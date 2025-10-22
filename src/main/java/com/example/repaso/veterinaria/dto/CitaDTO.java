package com.example.repaso.veterinaria.dto;

import com.example.repaso.veterinaria.shared.BaseDTO;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CitaDTO extends BaseDTO {
    private Long pacienteId;
    private Long personalId;
    private Long servicioId;
    private LocalDateTime fechaHora;
    private String motivo;
    private String estado;
    private String notas;
}
