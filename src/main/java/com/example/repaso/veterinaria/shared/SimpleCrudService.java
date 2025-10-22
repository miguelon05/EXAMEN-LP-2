package com.example.repaso.veterinaria.shared;

import com.example.repaso.mappers.base.BaseMappers;
import org.hibernate.service.spi.ServiceException;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class SimpleCrudService<E extends BaseEntity, D extends BaseDTO>
        implements CrudService<E, D> {

    private final JpaRepository<E, Long> repository;
    private final BaseMappers<E, D> mapper;

    protected SimpleCrudService(JpaRepository<E, Long> repository, BaseMappers<E, D> mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public D create(D dto) throws ServiceException {
        try {
            E entity = mapper.toEntity(dto);
            entity.setId(null);
            return mapper.toDTO(repository.save(entity));
        } catch (Exception e) {
            throw new ServiceException("Error al crear entidad", e);
        }
    }

    @Override
    public D update(Long id, D dto) throws ServiceException {
        try {
            repository.findById(id)
                    .orElseThrow(() -> new ServiceException("Entidad no encontrada"));
            E entity = mapper.toEntity(dto);
            entity.setId(id);
            return mapper.toDTO(repository.save(entity));
        } catch (Exception e) {
            throw new ServiceException("Error al actualizar entidad", e);
        }
    }

    @Override
    public D findById(Long id) throws ServiceException {
        try {
            return repository.findById(id)
                    .map(mapper::toDTO)
                    .orElseThrow(() -> new ServiceException("Entidad no encontrada"));
        } catch (Exception e) {
            throw new ServiceException("Error al buscar entidad", e);
        }
    }

    @Override
    public void deleteById(Long id) throws ServiceException {
        try {
            if (!repository.existsById(id)) {
                throw new ServiceException("Entidad no encontrada");
            }
            repository.deleteById(id);
        } catch (Exception e) {
            throw new ServiceException("Error al eliminar entidad", e);
        }
    }

    @Override
    public List<D> findAll() throws ServiceException {
        try {
            return mapper.toDTOs(repository.findAll());
        } catch (Exception e) {
            throw new ServiceException("Error al listar entidades", e);
        }
    }
}
