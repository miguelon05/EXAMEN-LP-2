import os
from pathlib import Path

BASE_PACKAGE = "com.example.repaso.veterinaria"
SRC_DIR = Path("src/main/java")

ENTITIES = [
    {
        "name": "Cliente",
        "table": "clientes",
        "fields": [
            ("String", "nombres"),
            ("String", "apellidos"),
            ("String", "telefono"),
            ("String", "correo"),
            ("String", "direccion"),
            ("LocalDate", "fechaRegistro"),
        ],
    },
    {
        "name": "Paciente",
        "table": "pacientes",
        "fields": [
            ("String", "nombre"),
            ("String", "especie"),
            ("String", "raza"),
            ("LocalDate", "fechaNacimiento"),
            ("String", "sexo"),
            ("BigDecimal", "peso"),
            ("String", "color"),
            ("Long", "clienteId"),
        ],
    },
    {
        "name": "Personal",
        "table": "personal",
        "fields": [
            ("String", "nombres"),
            ("String", "apellidos"),
            ("String", "documento"),
            ("String", "telefono"),
            ("String", "correo"),
            ("String", "cargo"),
            ("String", "especialidad"),
            ("LocalDate", "fechaContratacion"),
            ("Boolean", "activo"),
        ],
    },
    {
        "name": "Servicio",
        "table": "servicios",
        "fields": [
            ("String", "nombre"),
            ("String", "descripcion"),
            ("BigDecimal", "precio"),
            ("Integer", "duracionMinutos"),
            ("Boolean", "requiereAyuno"),
        ],
    },
    {
        "name": "CategoriaProducto",
        "table": "categorias_producto",
        "fields": [
            ("String", "nombre"),
            ("String", "descripcion"),
        ],
    },
    {
        "name": "Producto",
        "table": "productos",
        "fields": [
            ("String", "nombre"),
            ("String", "descripcion"),
            ("BigDecimal", "precioCompra"),
            ("BigDecimal", "precioVenta"),
            ("Integer", "stockMinimo"),
            ("Long", "categoriaId"),
        ],
    },
    {
        "name": "Inventario",
        "table": "inventarios",
        "fields": [
            ("Long", "productoId"),
            ("Integer", "cantidadDisponible"),
            ("LocalDate", "fechaActualizacion"),
            ("String", "ubicacion"),
        ],
    },
    {
        "name": "Proveedor",
        "table": "proveedores",
        "fields": [
            ("String", "nombre"),
            ("String", "contacto"),
            ("String", "telefono"),
            ("String", "correo"),
            ("String", "direccion"),
        ],
    },
    {
        "name": "Compra",
        "table": "compras",
        "fields": [
            ("Long", "proveedorId"),
            ("Long", "personalId"),
            ("LocalDate", "fechaCompra"),
            ("BigDecimal", "total"),
        ],
    },
    {
        "name": "DetalleCompra",
        "table": "detalles_compra",
        "fields": [
            ("Long", "compraId"),
            ("Long", "productoId"),
            ("Integer", "cantidad"),
            ("BigDecimal", "precioUnitario"),
        ],
    },
    {
        "name": "Venta",
        "table": "ventas",
        "fields": [
            ("Long", "clienteId"),
            ("Long", "personalId"),
            ("LocalDate", "fechaVenta"),
            ("BigDecimal", "subtotal"),
            ("BigDecimal", "impuestos"),
            ("BigDecimal", "total"),
        ],
    },
    {
        "name": "DetalleVenta",
        "table": "detalles_venta",
        "fields": [
            ("Long", "ventaId"),
            ("Long", "productoId"),
            ("Integer", "cantidad"),
            ("BigDecimal", "precioUnitario"),
        ],
    },
    {
        "name": "Factura",
        "table": "facturas",
        "fields": [
            ("Long", "ventaId"),
            ("String", "numero"),
            ("LocalDate", "fechaEmision"),
            ("BigDecimal", "subtotal"),
            ("BigDecimal", "impuestos"),
            ("BigDecimal", "total"),
            ("Boolean", "pagada"),
        ],
    },
    {
        "name": "MetodoPago",
        "table": "metodos_pago",
        "fields": [
            ("String", "nombre"),
            ("String", "descripcion"),
        ],
    },
    {
        "name": "Pago",
        "table": "pagos",
        "fields": [
            ("Long", "facturaId"),
            ("Long", "metodoPagoId"),
            ("BigDecimal", "monto"),
            ("LocalDate", "fechaPago"),
            ("String", "referencia"),
            ("String", "estado"),
        ],
    },
    {
        "name": "Cita",
        "table": "citas",
        "fields": [
            ("Long", "pacienteId"),
            ("Long", "personalId"),
            ("Long", "servicioId"),
            ("LocalDateTime", "fechaHora"),
            ("String", "motivo"),
            ("String", "estado"),
            ("String", "notas"),
        ],
    },
    {
        "name": "HistorialClinico",
        "table": "historiales_clinicos",
        "fields": [
            ("Long", "pacienteId"),
            ("LocalDate", "fechaApertura"),
            ("String", "observaciones"),
        ],
    },
    {
        "name": "DetalleHistorial",
        "table": "detalles_historial",
        "fields": [
            ("Long", "historialId"),
            ("LocalDate", "fechaAtencion"),
            ("String", "diagnostico"),
            ("String", "tratamiento"),
            ("Long", "medicamentoId"),
            ("String", "recomendaciones"),
        ],
    },
    {
        "name": "Tratamiento",
        "table": "tratamientos",
        "fields": [
            ("String", "nombre"),
            ("String", "descripcion"),
            ("Integer", "duracionDias"),
        ],
    },
    {
        "name": "Medicamento",
        "table": "medicamentos",
        "fields": [
            ("String", "nombre"),
            ("String", "descripcion"),
            ("String", "dosis"),
            ("String", "viaAdministracion"),
            ("String", "fabricante"),
        ],
    },
    {
        "name": "Vacuna",
        "table": "vacunas",
        "fields": [
            ("Long", "pacienteId"),
            ("String", "nombre"),
            ("LocalDate", "fechaAplicacion"),
            ("LocalDate", "proximaAplicacion"),
            ("String", "lote"),
            ("String", "observaciones"),
        ],
    },
    {
        "name": "Campania",
        "table": "campanias",
        "fields": [
            ("String", "nombre"),
            ("String", "descripcion"),
            ("LocalDate", "fechaInicio"),
            ("LocalDate", "fechaFin"),
            ("String", "objetivo"),
        ],
    },
    {
        "name": "Recordatorio",
        "table": "recordatorios",
        "fields": [
            ("Long", "pacienteId"),
            ("Long", "clienteId"),
            ("String", "mensaje"),
            ("LocalDateTime", "fechaProgramada"),
            ("Boolean", "enviado"),
            ("String", "canal"),
        ],
    },
    {
        "name": "Usuario",
        "table": "usuarios",
        "fields": [
            ("String", "username"),
            ("String", "password"),
            ("String", "correo"),
            ("Boolean", "activo"),
            ("Long", "personalId"),
        ],
    },
    {
        "name": "Rol",
        "table": "roles",
        "fields": [
            ("String", "nombre"),
            ("String", "descripcion"),
        ],
    },
    {
        "name": "Permiso",
        "table": "permisos",
        "fields": [
            ("String", "nombre"),
            ("String", "descripcion"),
        ],
    },
    {
        "name": "UsuarioRol",
        "table": "usuarios_roles",
        "fields": [
            ("Long", "usuarioId"),
            ("Long", "rolId"),
        ],
    },
    {
        "name": "RolPermiso",
        "table": "roles_permisos",
        "fields": [
            ("Long", "rolId"),
            ("Long", "permisoId"),
        ],
    },
    {
        "name": "Receta",
        "table": "recetas",
        "fields": [
            ("Long", "pacienteId"),
            ("Long", "personalId"),
            ("LocalDate", "fecha"),
            ("String", "indicaciones"),
            ("Long", "medicamentoId"),
            ("Integer", "diasTratamiento"),
        ],
    },
]

TYPE_IMPORTS = {
    "LocalDate": "java.time.LocalDate",
    "LocalDateTime": "java.time.LocalDateTime",
    "BigDecimal": "java.math.BigDecimal",
}

LOMBOK_IMPORTS = [
    "lombok.Data",
    "lombok.EqualsAndHashCode",
    "lombok.NoArgsConstructor",
    "lombok.AllArgsConstructor",
]

DTO_LOMBOK_IMPORTS = LOMBOK_IMPORTS.copy()


def snake_case(name: str) -> str:
    chars = []
    for i, ch in enumerate(name):
        if ch.isupper() and i > 0:
            chars.append("_")
        chars.append(ch.lower())
    return "".join(chars)


def ensure_dir(path: Path) -> None:
    path.mkdir(parents=True, exist_ok=True)


def write_file(path: Path, content: str) -> None:
    ensure_dir(path.parent)
    path.write_text(content, encoding="utf-8")


def generate_entity(entity):
    name = entity["name"]
    table = entity["table"]
    fields = entity["fields"]
    imports = {
        "jakarta.persistence.Column",
        "jakarta.persistence.Entity",
        "jakarta.persistence.Table",
    }
    extra_imports = {TYPE_IMPORTS[f_type] for f_type, _ in fields if f_type in TYPE_IMPORTS}
    imports.update(extra_imports)
    imports.add("com.example.repaso.veterinaria.shared.BaseEntity")
    imports.update(LOMBOK_IMPORTS)
    imports.add("jakarta.persistence.MappedSuperclass") if False else None
    imports_list = sorted(imports)

    lines = [
        f"package {BASE_PACKAGE}.entity;",
        "",
    ]
    for imp in imports_list:
        lines.append(f"import {imp};")
    lines.append("")
    lines.append("@Entity")
    lines.append(f"@Table(name = \"{table}\")")
    lines.append("@Data")
    lines.append("@NoArgsConstructor")
    lines.append("@AllArgsConstructor")
    lines.append("@EqualsAndHashCode(callSuper = true)")
    lines.append(f"public class {name} extends BaseEntity {{")
    for f_type, f_name in fields:
        column = snake_case(f_name)
        lines.append(f"    @Column(name = \"{column}\")")
        lines.append(f"    private {f_type} {f_name};")
        lines.append("")
    if fields:
        lines.pop()  # remove last blank line
    lines.append("}")
    lines.append("")
    return "\n".join(lines)


def generate_dto(entity):
    name = entity["name"]
    fields = entity["fields"]
    imports = set(DTO_LOMBOK_IMPORTS)
    extra_imports = {TYPE_IMPORTS[f_type] for f_type, _ in fields if f_type in TYPE_IMPORTS}
    imports.update(extra_imports)
    imports.add("com.example.repaso.veterinaria.shared.BaseDTO")
    lines = [f"package {BASE_PACKAGE}.dto;", ""]
    for imp in sorted(imports):
        lines.append(f"import {imp};")
    lines.append("")
    lines.append("@Data")
    lines.append("@NoArgsConstructor")
    lines.append("@AllArgsConstructor")
    lines.append("@EqualsAndHashCode(callSuper = true)")
    lines.append(f"public class {name}DTO extends BaseDTO {{")
    for f_type, f_name in fields:
        lines.append(f"    private {f_type} {f_name};")
    lines.append("}")
    lines.append("")
    return "\n".join(lines)


def generate_mapper(entity):
    name = entity["name"]
    lines = [f"package {BASE_PACKAGE}.mapper;", ""]
    lines.append("import org.mapstruct.Mapper;")
    lines.append("import " + BASE_PACKAGE + ".dto." + name + "DTO;")
    lines.append("import " + BASE_PACKAGE + ".entity." + name + ";")
    lines.append("import com.example.repaso.mappers.base.BaseMappers;")
    lines.append("")
    lines.append("@Mapper(componentModel = \"spring\")")
    lines.append(f"public interface {name}Mapper extends BaseMappers<{name}, {name}DTO> {{")
    lines.append("}")
    lines.append("")
    return "\n".join(lines)


def generate_repository(entity):
    name = entity["name"]
    lines = [f"package {BASE_PACKAGE}.repository;", ""]
    lines.append("import org.springframework.data.jpa.repository.JpaRepository;")
    lines.append("import " + BASE_PACKAGE + ".entity." + name + ";")
    lines.append("")
    lines.append(f"public interface {name}Repository extends JpaRepository<{name}, Long> {{")
    lines.append("}")
    lines.append("")
    return "\n".join(lines)


def generate_service_interface(entity):
    name = entity["name"]
    lines = [f"package {BASE_PACKAGE}.service;", ""]
    lines.append("import " + BASE_PACKAGE + ".dto." + name + "DTO;")
    lines.append("import " + BASE_PACKAGE + ".entity." + name + ";")
    lines.append("import " + BASE_PACKAGE + ".shared.CrudService;")
    lines.append("")
    lines.append(f"public interface {name}Service extends CrudService<{name}, {name}DTO> {{")
    lines.append("}")
    lines.append("")
    return "\n".join(lines)


def generate_service_impl(entity):
    name = entity["name"]
    lines = [f"package {BASE_PACKAGE}.service.impl;", ""]
    lines.append("import org.springframework.stereotype.Service;")
    lines.append("import " + BASE_PACKAGE + ".dto." + name + "DTO;")
    lines.append("import " + BASE_PACKAGE + ".entity." + name + ";")
    lines.append("import " + BASE_PACKAGE + ".mapper." + name + "Mapper;")
    lines.append("import " + BASE_PACKAGE + ".repository." + name + "Repository;")
    lines.append("import " + BASE_PACKAGE + ".service." + name + "Service;")
    lines.append("import " + BASE_PACKAGE + ".shared.SimpleCrudService;")
    lines.append("")
    lines.append("@Service")
    lines.append(f"public class {name}ServiceImpl extends SimpleCrudService<{name}, {name}DTO> implements {name}Service {{")
    lines.append(f"    public {name}ServiceImpl({name}Repository repository, {name}Mapper mapper) {{")
    lines.append("        super(repository, mapper);")
    lines.append("    }")
    lines.append("}")
    lines.append("")
    return "\n".join(lines)


def generate_controller(entity):
    name = entity["name"]
    path = snake_case(name).replace("_", "-") + "s"
    url = f"/api/v1/veterinaria/{path}"
    lines = [f"package {BASE_PACKAGE}.controller;", ""]
    lines.append("import org.springframework.web.bind.annotation.RequestMapping;")
    lines.append("import org.springframework.web.bind.annotation.RestController;")
    lines.append("import " + BASE_PACKAGE + ".dto." + name + "DTO;")
    lines.append("import " + BASE_PACKAGE + ".service." + name + "Service;")
    lines.append("import " + BASE_PACKAGE + ".shared.SimpleCrudController;")
    lines.append("")
    lines.append("@RestController")
    lines.append(f"@RequestMapping(\"{url}\")")
    lines.append(f"public class {name}Controller extends SimpleCrudController<{name}DTO> {{")
    lines.append(f"    public {name}Controller({name}Service service) {{")
    lines.append("        super(service);")
    lines.append("    }")
    lines.append("}")
    lines.append("")
    return "\n".join(lines)


def main():
    for entity in ENTITIES:
        name = entity["name"]
        write_file(SRC_DIR / BASE_PACKAGE.replace(".", "/") / "entity" / f"{name}.java", generate_entity(entity))
        write_file(SRC_DIR / BASE_PACKAGE.replace(".", "/") / "dto" / f"{name}DTO.java", generate_dto(entity))
        write_file(SRC_DIR / BASE_PACKAGE.replace(".", "/") / "mapper" / f"{name}Mapper.java", generate_mapper(entity))
        write_file(SRC_DIR / BASE_PACKAGE.replace(".", "/") / "repository" / f"{name}Repository.java", generate_repository(entity))
        write_file(SRC_DIR / BASE_PACKAGE.replace(".", "/") / "service" / f"{name}Service.java", generate_service_interface(entity))
        write_file(SRC_DIR / BASE_PACKAGE.replace(".", "/") / "service" / "impl" / f"{name}ServiceImpl.java", generate_service_impl(entity))
        write_file(SRC_DIR / BASE_PACKAGE.replace(".", "/") / "controller" / f"{name}Controller.java", generate_controller(entity))


if __name__ == "__main__":
    main()
