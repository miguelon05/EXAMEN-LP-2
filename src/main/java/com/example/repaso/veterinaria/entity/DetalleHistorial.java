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
@Table(name = "detalles_historial")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class DetalleHistorial extends BaseEntity {
    @Column(name = "historial_id")
    private Long historialId;

    @Column(name = "fecha_atencion")
    private LocalDate fechaAtencion;

    @Column(name = "diagnostico")
    private String diagnostico;

    @Column(name = "tratamiento")
    private String tratamiento;

    @Column(name = "medicamento_id")
    private Long medicamentoId;

    @Column(name = "recomendaciones")
    private String recomendaciones;
}
