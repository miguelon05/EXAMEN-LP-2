package com.example.repaso.veterinaria.dto;

import com.example.repaso.veterinaria.shared.BaseDTO;
import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class PacienteDTO extends BaseDTO {
    private String nombre;
    private String especie;
    private String raza;
    private LocalDate fechaNacimiento;
    private String sexo;
    private BigDecimal peso;
    private String color;
    private Long clienteId;
}
