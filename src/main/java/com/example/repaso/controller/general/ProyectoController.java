package com.example.repaso.controller.general;

import com.example.repaso.dto.ProyectoDTO;
import com.example.repaso.service.service.ProyectoService;
import org.hibernate.service.spi.ServiceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/proyectos")
public class ProyectoController {
    private final ProyectoService proyectoService;

    public ProyectoController(ProyectoService proyectoService) {
        this.proyectoService = proyectoService;
    }

    @GetMapping
    public ResponseEntity<List<ProyectoDTO>> findAll() {
        return ResponseEntity.ok(proyectoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProyectoDTO> read(@PathVariable Long id) throws ServiceException {
        ProyectoDTO proyectoDTO = proyectoService.findById(id);
        return ResponseEntity.ok(proyectoDTO);
    }

    @PostMapping
    public ResponseEntity<ProyectoDTO> create(@RequestBody ProyectoDTO proyectoDTO) throws ServiceException {
        ProyectoDTO proyectoGuardado = proyectoService.create(proyectoDTO);
        return new ResponseEntity<>(proyectoGuardado, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProyectoDTO> update(@PathVariable Long id, @RequestBody ProyectoDTO proyectoDTO) throws ServiceException {
        ProyectoDTO proyectoActualizado = proyectoService.update(id, proyectoDTO);
        return ResponseEntity.ok(proyectoActualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) throws ServiceException {
        proyectoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
