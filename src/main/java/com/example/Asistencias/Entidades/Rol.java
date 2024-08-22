package com.example.Asistencias.Entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "roles")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Nombre es requerido")
    private String nombre;

    public Integer getId(){return id;}

    public void SetId(Integer id) {this.id = id;}

    public @NotBlank(message = "Nombre es requirdo") String getNombre(){return nombre;}

    public void setNombre(@NotBlank(message = "nombre es requerido") String nombre){this.nombre = nombre;}
}
