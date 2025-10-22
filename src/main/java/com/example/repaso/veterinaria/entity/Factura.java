package com.example.repaso.veterinaria.entity;

import com.example.repaso.veterinaria.shared.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "facturas")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Factura extends BaseEntity {
    @Column(name = "venta_id")
    private Long ventaId;

    @Column(name = "numero")
    private String numero;

    @Column(name = "fecha_emision")
    private LocalDate fechaEmision;

    @Column(name = "subtotal")
    private BigDecimal subtotal;

    @Column(name = "impuestos")
    private BigDecimal impuestos;

    @Column(name = "total")
    private BigDecimal total;

    @Column(name = "pagada")
    private Boolean pagada;
}
