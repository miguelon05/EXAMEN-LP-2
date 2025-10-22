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
@Table(name = "recetas")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Receta extends BaseEntity {
    @Column(name = "paciente_id")
    private Long pacienteId;

    @Column(name = "personal_id")
    private Long personalId;

    @Column(name = "fecha")
    private LocalDate fecha;

    @Column(name = "indicaciones")
    private String indicaciones;

    @Column(name = "medicamento_id")
    private Long medicamentoId;

    @Column(name = "dias_tratamiento")
    private Integer diasTratamiento;
}
