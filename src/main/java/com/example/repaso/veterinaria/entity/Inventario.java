package com.example.repaso.veterinaria.entity;

import com.example.repaso.veterinaria.shared.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "inventarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Inventario extends BaseEntity {
    @Column(name = "producto_id")
    private Long productoId;

    @Column(name = "cantidad_disponible")
    private Integer cantidadDisponible;

    @Column(name = "fecha_actualizacion")
    private LocalDate fechaActualizacion;

    @Column(name = "ubicacion")
    private String ubicacion;
}
