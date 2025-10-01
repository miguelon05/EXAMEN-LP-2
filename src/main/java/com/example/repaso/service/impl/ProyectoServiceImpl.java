package com.example.repaso.service.impl;

import com.example.repaso.dto.ProyectoDTO;
import com.example.repaso.entity.Cliente;
import com.example.repaso.entity.Proyecto;
import com.example.repaso.mappers.ProyectoMapper;
import com.example.repaso.repository.ClienteRepository;
import com.example.repaso.repository.ProyectoRepository;
import com.example.repaso.service.service.ProyectoService;
import org.hibernate.service.spi.ServiceException;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProyectoServiceImpl  implements ProyectoService {
    private final ProyectoRepository proyectoRepository;
    private final ClienteRepository clienteRepository;
    private final ProyectoMapper proyectoMapper;

    public ProyectoServiceImpl(ProyectoRepository proyectoRepository,
                               ClienteRepository clienteRepository,
                               ProyectoMapper proyectoMapper) {
        this.proyectoRepository = proyectoRepository;
        this.clienteRepository = clienteRepository;
        this.proyectoMapper = proyectoMapper;
    }

    @Override
    public ProyectoDTO create(ProyectoDTO proyectoDTO) throws ServiceException {
        try {
            Proyecto proyecto = proyectoMapper.toEntity(proyectoDTO);
            Cliente cliente = clienteRepository.findById(proyectoDTO.getCliente().getIdCliente())
                    .orElseThrow(() -> new ServiceException("Cliente no encontrado"));

            proyecto.setCliente(cliente);

            return proyectoMapper.toDTO(proyectoRepository.save(proyecto));
        } catch (Exception e) {
            throw new ServiceException("Error al crear Proyecto", e);
        }
    }

    @Override
    public ProyectoDTO update(Long id, ProyectoDTO proyectoDTO) throws ServiceException {
        try {
            Proyecto proyecto = proyectoRepository.findById(id)
                    .orElseThrow(() -> new ServiceException("Proyecto no encontrado"));

            proyecto.setCuantia(proyectoDTO.getCuantia());
            proyecto.setFechaInicio(proyectoDTO.getFechaInicio());
            proyecto.setFechaFin(proyectoDTO.getFechaFin());

            Cliente cliente = clienteRepository.findById(proyectoDTO.getCliente().getIdCliente())
                    .orElseThrow(() -> new ServiceException("Cliente no encontrado"));
            proyecto.setCliente(cliente);

            return proyectoMapper.toDTO(proyectoRepository.save(proyecto));
        } catch (Exception e) {
            throw new ServiceException("Error al actualizar Proyecto", e);
        }
    }

    @Override
    public ProyectoDTO findById(Long id) throws ServiceException {
        try {
            Proyecto proyecto = proyectoRepository.findById(id)
                    .orElseThrow(() -> new ServiceException("Proyecto no encontrado"));
            return proyectoMapper.toDTO(proyecto);
        } catch (Exception e) {
            throw new ServiceException("Error al buscar Proyecto", e);
        }
    }

    @Override
    public void deleteById(Long id) throws ServiceException {
        try {
            if (!proyectoRepository.existsById(id)) {
                throw new ServiceException("Proyecto no encontrado");
            }
            proyectoRepository.deleteById(id);
        } catch (Exception e) {
            throw new ServiceException("Error al eliminar Proyecto", e);
        }
    }

    @Override
    public List<ProyectoDTO> findAll() throws ServiceException {
        try {
            return proyectoMapper.toDTOs(proyectoRepository.findAll());
        } catch (Exception e) {
            throw new ServiceException("Error al listar Proyectos", e);
        }
    }

}
