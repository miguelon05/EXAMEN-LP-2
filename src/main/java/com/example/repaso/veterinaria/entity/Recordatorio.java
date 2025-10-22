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
@Table(name = "recordatorios")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Recordatorio extends BaseEntity {
    @Column(name = "paciente_id")
    private Long pacienteId;

    @Column(name = "cliente_id")
    private Long clienteId;

    @Column(name = "mensaje")
    private String mensaje;

    @Column(name = "fecha_programada")
    private LocalDateTime fechaProgramada;

    @Column(name = "enviado")
    private Boolean enviado;

    @Column(name = "canal")
    private String canal;
}
