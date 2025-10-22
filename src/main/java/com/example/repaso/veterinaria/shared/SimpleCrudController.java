package com.example.repaso.veterinaria.shared;

import jakarta.validation.Valid;
import org.hibernate.service.spi.ServiceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public abstract class SimpleCrudController<D extends BaseDTO> {

    private final CrudService<?, D> service;

    protected SimpleCrudController(CrudService<?, D> service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<D>> findAll() throws ServiceException {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<D> findById(@PathVariable Long id) throws ServiceException {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<D> create(@Valid @RequestBody D dto) throws ServiceException {
        D saved = service.create(dto);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<D> update(@PathVariable Long id, @Valid @RequestBody D dto) throws ServiceException {
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) throws ServiceException {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
