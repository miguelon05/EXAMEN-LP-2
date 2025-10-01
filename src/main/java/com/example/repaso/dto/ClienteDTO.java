package com.example.repaso.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class ClienteDTO {
    private Long idCliente;
    private String telefono;
    private String domicilio;
    private String razonSocial;
}
