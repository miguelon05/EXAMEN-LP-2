package com.example.repaso.service.impl;

import com.example.repaso.dto.ColaboradoresDTO;
import com.example.repaso.entity.Colaboradores;
import com.example.repaso.mappers.ColaboradoresMapper;
import com.example.repaso.repository.ColaboradoresRepository;
import com.example.repaso.service.service.ColaboradoresService;
import org.hibernate.service.spi.ServiceException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColaboradoresServiceImpl implements ColaboradoresService {
    private final ColaboradoresRepository colaboradorRepository;
    private final ColaboradoresMapper colaboradorMapper;

    public ColaboradoresServiceImpl(ColaboradoresRepository colaboradorRepository, ColaboradoresMapper colaboradorMapper) {
        this.colaboradorRepository = colaboradorRepository;
        this.colaboradorMapper = colaboradorMapper;
    }

    @Override
    public ColaboradoresDTO create(ColaboradoresDTO colaboradorDTO) throws ServiceException {
        try {
            return colaboradorMapper.toDTO(colaboradorRepository.save(colaboradorMapper.toEntity(colaboradorDTO)));
        } catch (Exception e) {
            throw new ServiceException("Error al crear Colaborador", e);
        }
    }

    @Override
    public ColaboradoresDTO update(Long id, ColaboradoresDTO colaboradorDTO) throws ServiceException {
        try {
            Colaboradores col = colaboradorRepository.findById(id)
                    .orElseThrow(() -> new ServiceException("Colaborador no encontrado"));
            col.setNombre(colaboradorDTO.getNombre());
            col.setTelefono(colaboradorDTO.getTelefono());
            col.setDomicilio(colaboradorDTO.getDomicilio());
            col.setNif(colaboradorDTO.getNif());
            col.setBanco(colaboradorDTO.getBanco());
            col.setNumCuenta(colaboradorDTO.getNumCuenta());
            return colaboradorMapper.toDTO(colaboradorRepository.save(col));
        } catch (Exception e) {
            throw new ServiceException("Error al actualizar Colaborador", e);
        }
    }

    @Override
    public ColaboradoresDTO findById(Long id) throws ServiceException {
        try {
            return colaboradorMapper.toDTO(
                    colaboradorRepository.findById(id).orElseThrow(() -> new ServiceException("Colaborador no encontrado"))
            );
        } catch (Exception e) {
            throw new ServiceException("Error al buscar Colaborador", e);
        }
    }

    @Override
    public void deleteById(Long id) throws ServiceException {
        try {
            if (!colaboradorRepository.existsById(id)) {
                throw new ServiceException("Colaborador no encontrado");
            }
            colaboradorRepository.deleteById(id);
        } catch (Exception e) {
            throw new ServiceException("Error al eliminar Colaborador", e);
        }
    }

    @Override
    public List<ColaboradoresDTO> findAll() throws ServiceException {
        try {
            return colaboradorMapper.toDTOs(colaboradorRepository.findAll());
        } catch (Exception e) {
            throw new ServiceException("Error al listar Colaboradores", e);
        }
    }

}
