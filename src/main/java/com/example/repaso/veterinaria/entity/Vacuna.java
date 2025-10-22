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
@Table(name = "vacunas")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Vacuna extends BaseEntity {
    @Column(name = "paciente_id")
    private Long pacienteId;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "fecha_aplicacion")
    private LocalDate fechaAplicacion;

    @Column(name = "proxima_aplicacion")
    private LocalDate proximaAplicacion;

    @Column(name = "lote")
    private String lote;

    @Column(name = "observaciones")
    private String observaciones;
}
