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
@Table(name = "historiales_clinicos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class HistorialClinico extends BaseEntity {
    @Column(name = "paciente_id")
    private Long pacienteId;

    @Column(name = "fecha_apertura")
    private LocalDate fechaApertura;

    @Column(name = "observaciones")
    private String observaciones;
}
