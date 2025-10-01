package com.example.repaso.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name="CLIENTE")

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLIENTE")
    private Long idCliente;

    @Column(name = "TELEFONO", length = 15)
    private String telefono;

    @Column(name = "DOMICILIO", length = 150)
    private String domicilio;

    @Column(name = "RAZON_SOCIAL", length = 200)
    private String razonSocial;

}
