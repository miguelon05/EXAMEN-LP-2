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
@Table(name = "ventas")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Venta extends BaseEntity {
    @Column(name = "cliente_id")
    private Long clienteId;

    @Column(name = "personal_id")
    private Long personalId;

    @Column(name = "fecha_venta")
    private LocalDate fechaVenta;

    @Column(name = "subtotal")
    private BigDecimal subtotal;

    @Column(name = "impuestos")
    private BigDecimal impuestos;

    @Column(name = "total")
    private BigDecimal total;
}
