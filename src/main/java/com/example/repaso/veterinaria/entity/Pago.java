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
@Table(name = "pagos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Pago extends BaseEntity {
    @Column(name = "factura_id")
    private Long facturaId;

    @Column(name = "metodo_pago_id")
    private Long metodoPagoId;

    @Column(name = "monto")
    private BigDecimal monto;

    @Column(name = "fecha_pago")
    private LocalDate fechaPago;

    @Column(name = "referencia")
    private String referencia;

    @Column(name = "estado")
    private String estado;
}
