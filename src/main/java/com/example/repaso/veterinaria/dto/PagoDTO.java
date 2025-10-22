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
public class PagoDTO extends BaseDTO {
    private Long facturaId;
    private Long metodoPagoId;
    private BigDecimal monto;
    private LocalDate fechaPago;
    private String referencia;
    private String estado;
}
