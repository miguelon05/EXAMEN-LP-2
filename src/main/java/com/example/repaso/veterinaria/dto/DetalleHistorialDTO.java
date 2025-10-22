package com.example.repaso.veterinaria.dto;

import com.example.repaso.veterinaria.shared.BaseDTO;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class DetalleHistorialDTO extends BaseDTO {
    private Long historialId;
    private LocalDate fechaAtencion;
    private String diagnostico;
    private String tratamiento;
    private Long medicamentoId;
    private String recomendaciones;
}
