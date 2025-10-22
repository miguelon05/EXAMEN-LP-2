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
public class VacunaDTO extends BaseDTO {
    private Long pacienteId;
    private String nombre;
    private LocalDate fechaAplicacion;
    private LocalDate proximaAplicacion;
    private String lote;
    private String observaciones;
}
