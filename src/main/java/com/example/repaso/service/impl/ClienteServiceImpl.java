package com.example.repaso.service.impl;

import com.example.repaso.dto.ClienteDTO;
import com.example.repaso.entity.Cliente;
import com.example.repaso.mappers.ClienteMapper;
import com.example.repaso.repository.ClienteRepository;
import com.example.repaso.service.service.ClienteService;
import org.hibernate.service.spi.ServiceException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClienteServiceImpl implements ClienteService {
    private final ClienteRepository clienteRepository;
    private final ClienteMapper clienteMapper;

    public ClienteServiceImpl(ClienteRepository clienteRepository, ClienteMapper clienteMapper) {
        this.clienteRepository = clienteRepository;
        this.clienteMapper = clienteMapper;
    }

    @Override
    public ClienteDTO create(ClienteDTO clienteDTO) throws ServiceException {
        try {
            Cliente cliente = clienteMapper.toEntity(clienteDTO);
            Cliente saved = clienteRepository.save(cliente);
            return clienteMapper.toDTO(saved);
        } catch (Exception e) {
            throw new ServiceException("Error al crear el cliente", e);
        }
    }

    @Override
    public ClienteDTO update(Long id, ClienteDTO clienteDTO) throws ServiceException {
        try {
            Cliente cliente = clienteRepository.findById(id)
                    .orElseThrow(() -> new ServiceException("Cliente con id " + id + " no encontrado"));

            // Actualizamos solo campos editables
            cliente.setTelefono(clienteDTO.getTelefono());
            cliente.setDomicilio(clienteDTO.getDomicilio());
            cliente.setRazonSocial(clienteDTO.getRazonSocial());

            Cliente updated = clienteRepository.save(cliente);
            return clienteMapper.toDTO(updated);
        } catch (Exception e) {
            throw new ServiceException("Error al actualizar el cliente", e);
        }
    }

    @Override
    public ClienteDTO findById(Long id) throws ServiceException {
        try {
            Cliente cliente = clienteRepository.findById(id)
                    .orElseThrow(() -> new ServiceException("Cliente con id " + id + " no encontrado"));
            return clienteMapper.toDTO(cliente);
        } catch (Exception e) {
            throw new ServiceException("Error al buscar el cliente", e);
        }
    }

    @Override
    public void deleteById(Long id) throws ServiceException {
        try {
            if (!clienteRepository.existsById(id)) {
                throw new ServiceException("Cliente con id " + id + " no encontrado");
            }
            clienteRepository.deleteById(id);
        } catch (Exception e) {
            throw new ServiceException("Error al eliminar el cliente", e);
        }
    }

    @Override
    public List<ClienteDTO> findAll() throws ServiceException {
        try {
            return clienteMapper.toDTOs(clienteRepository.findAll());
        } catch (Exception e) {
            throw new ServiceException("Error al listar los clientes", e);
        }
    }

}
