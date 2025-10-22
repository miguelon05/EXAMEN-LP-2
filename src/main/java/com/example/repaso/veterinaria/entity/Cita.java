package com.example.repaso.veterinaria.entity;

import com.example.repaso.veterinaria.shared.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "citas")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Cita extends BaseEntity {
    @Column(name = "paciente_id")
    private Long pacienteId;

    @Column(name = "personal_id")
    private Long personalId;

    @Column(name = "servicio_id")
    private Long servicioId;

    @Column(name = "fecha_hora")
    private LocalDateTime fechaHora;

    @Column(name = "motivo")
    private String motivo;

    @Column(name = "estado")
    private String estado;

    @Column(name = "notas")
    private String notas;
}
