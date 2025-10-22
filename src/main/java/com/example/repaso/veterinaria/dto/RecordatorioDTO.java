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
public class RecordatorioDTO extends BaseDTO {
    private Long pacienteId;
    private Long clienteId;
    private String mensaje;
    private LocalDateTime fechaProgramada;
    private Boolean enviado;
    private String canal;
}
