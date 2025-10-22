package com.example.repaso.veterinaria.dto;

import com.example.repaso.veterinaria.shared.BaseDTO;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ProductoDTO extends BaseDTO {
    private String nombre;
    private String descripcion;
    private BigDecimal precioCompra;
    private BigDecimal precioVenta;
    private Integer stockMinimo;
    private Long categoriaId;
}
