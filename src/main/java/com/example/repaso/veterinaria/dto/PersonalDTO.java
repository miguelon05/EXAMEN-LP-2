package com.example.repaso.veterinaria.dto;

import com.example.repaso.veterinaria.shared.BaseDTO;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class PersonalDTO extends BaseDTO {
    private String nombres;
    private String apellidos;
    private String documento;
    private String telefono;
    private String correo;
    private String cargo;
    private String especialidad;
    private LocalDate fechaContratacion;
    private Boolean activo;
}
