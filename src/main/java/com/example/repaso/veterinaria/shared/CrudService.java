package com.example.repaso.veterinaria.shared;

import com.example.repaso.service.base.GenericService;

public interface CrudService<E extends BaseEntity, D extends BaseDTO> extends GenericService<E, D, Long> {
}
