package com.example.Asistencias.Entidades;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import org.hibernate.validator.constraints.NotBlank;
@Entity
@Table(name = "docentes")
public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

     @NotBlank (message = "Ingresar el nombre del docente")
     private String nombre;
     @Nullable
     private String apellido;
     private String email;
     private String telefono;
     private String escuela;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public @NotBlank(message = "Ingresar el nombre del docente") String getNombre() {
        return nombre;
    }

    public void setNombre(@NotBlank(message = "Ingresar el nombre del docente") String nombre) {
        this.nombre = nombre;
    }

    @Nullable
    public String getApellido() {
        return apellido;
    }

    public void setApellido(@Nullable String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
}
