package com.example.repaso.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class ProyectoDTO {
    private Long idProyecto;
    private BigDecimal cuantia;
    private Date fechaInicio;
    private Date fechaFin;
    private ClienteDTO Cliente;
    private List<ParticipaDTO> participantes;
}
