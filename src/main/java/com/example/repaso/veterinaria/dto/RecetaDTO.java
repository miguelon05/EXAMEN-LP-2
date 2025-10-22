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
public class RecetaDTO extends BaseDTO {
    private Long pacienteId;
    private Long personalId;
    private LocalDate fecha;
    private String indicaciones;
    private Long medicamentoId;
    private Integer diasTratamiento;
}
