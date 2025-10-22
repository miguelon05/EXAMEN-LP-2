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
@Table(name = "compras")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Compra extends BaseEntity {
    @Column(name = "proveedor_id")
    private Long proveedorId;

    @Column(name = "personal_id")
    private Long personalId;

    @Column(name = "fecha_compra")
    private LocalDate fechaCompra;

    @Column(name = "total")
    private BigDecimal total;
}
