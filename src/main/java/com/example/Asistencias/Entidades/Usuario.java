package com.example.Asistencias.Entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

@Entity
@Table(name = "usuario")

public class Usuario {
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message =  "El nombre de usuario es requerido")
    private String login;

    @NotBlank(message = "La contraseña es requerida")
    private String clave;

    private int status;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "usurio_rol",
            joinColumns = @JoinColumn(name = "usuaio_id"),
            inverseJoinColumns = @JoinColumn(name = "rol_id")

    )
    private List<Rol> roles;


}
