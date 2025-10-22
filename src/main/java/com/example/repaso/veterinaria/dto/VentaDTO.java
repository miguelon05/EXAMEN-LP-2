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
public class VentaDTO extends BaseDTO {
    private Long clienteId;
    private Long personalId;
    private LocalDate fechaVenta;
    private BigDecimal subtotal;
    private BigDecimal impuestos;
    private BigDecimal total;
}
