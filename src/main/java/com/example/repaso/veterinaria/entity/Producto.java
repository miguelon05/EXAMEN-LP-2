package com.example.repaso.veterinaria.entity;

import com.example.repaso.veterinaria.shared.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "productos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Producto extends BaseEntity {
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "precio_compra")
    private BigDecimal precioCompra;

    @Column(name = "precio_venta")
    private BigDecimal precioVenta;

    @Column(name = "stock_minimo")
    private Integer stockMinimo;

    @Column(name = "categoria_id")
    private Long categoriaId;
}
