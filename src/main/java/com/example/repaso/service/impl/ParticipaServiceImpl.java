package com.example.repaso.service.impl;

import com.example.repaso.dto.ParticipaDTO;
import com.example.repaso.entity.Participa;
import com.example.repaso.entity.Proyecto;
import com.example.repaso.entity.Colaboradores;
import com.example.repaso.mappers.ParticipaMapper;
import com.example.repaso.repository.ParticipaRepository;
import com.example.repaso.repository.ProyectoRepository;
import com.example.repaso.repository.ColaboradoresRepository;
import com.example.repaso.service.service.PaticipaService;
import org.hibernate.service.spi.ServiceException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParticipaServiceImpl implements PaticipaService {
    private final ParticipaRepository participaRepository;
    private final ProyectoRepository proyectoRepository;
    private final ColaboradoresRepository colaboradorRepository;
    private final ParticipaMapper participaMapper;

    public ParticipaServiceImpl(ParticipaRepository participaRepository,
                                ProyectoRepository proyectoRepository,
                                ColaboradoresRepository colaboradorRepository,
                                ParticipaMapper participaMapper) {
        this.participaRepository = participaRepository;
        this.proyectoRepository = proyectoRepository;
        this.colaboradorRepository = colaboradorRepository;
        this.participaMapper = participaMapper;
    }

    @Override
    public ParticipaDTO create(ParticipaDTO participaDTO) throws ServiceException {
        try {
            Participa participa = new Participa();

            Proyecto proyecto = proyectoRepository.findById(participaDTO.getProyectoId())
                    .orElseThrow(() -> new ServiceException("Proyecto no encontrado"));
            Colaboradores colaborador = colaboradorRepository.findById(participaDTO.getColaboradorId())
                    .orElseThrow(() -> new ServiceException("Colaborador no encontrado"));

            participa.setProyecto(proyecto);
            participa.setColaboradores(colaborador);

            return participaMapper.toDTO(participaRepository.save(participa));
        } catch (Exception e) {
            throw new ServiceException("Error al crear Participa", e);
        }
    }

    @Override
    public ParticipaDTO update(Long id, ParticipaDTO participaDTO) throws ServiceException {
        try {
            Participa participa = participaRepository.findById(id)
                    .orElseThrow(() -> new ServiceException("Participa no encontrado"));

            Proyecto proyecto = proyectoRepository.findById(participaDTO.getProyectoId())
                    .orElseThrow(() -> new ServiceException("Proyecto no encontrado"));
            Colaboradores colaborador = colaboradorRepository.findById(participaDTO.getColaboradorId())
                    .orElseThrow(() -> new ServiceException("Colaborador no encontrado"));

            participa.setProyecto(proyecto);
            participa.setColaboradores(colaborador);

            return participaMapper.toDTO(participaRepository.save(participa));
        } catch (Exception e) {
            throw new ServiceException("Error al actualizar Participa", e);
        }
    }

    @Override
    public ParticipaDTO findById(Long id) throws ServiceException {
        try {
            return participaMapper.toDTO(
                    participaRepository.findById(id)
                            .orElseThrow(() -> new ServiceException("Participa no encontrado"))
            );
        } catch (Exception e) {
            throw new ServiceException("Error al buscar Participa", e);
        }
    }

    @Override
    public void deleteById(Long id) throws ServiceException {
        try {
            if (!participaRepository.existsById(id)) {
                throw new ServiceException("Participa no encontrado");
            }
            participaRepository.deleteById(id);
        } catch (Exception e) {
            throw new ServiceException("Error al eliminar Participa", e);
        }
    }

    @Override
    public List<ParticipaDTO> findAll() throws ServiceException {
        try {
            return participaMapper.toDTOs(participaRepository.findAll());
        } catch (Exception e) {
            throw new ServiceException("Error al listar Participa", e);
        }
    }


}
