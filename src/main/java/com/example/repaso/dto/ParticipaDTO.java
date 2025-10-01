package com.example.repaso.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ParticipaDTO {
    private Long idParticipa;
    private Long proyectoId;
    private Long colaboradorId;
}
