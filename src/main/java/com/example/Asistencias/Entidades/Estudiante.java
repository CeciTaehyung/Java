package com.example.Asistencias.Entidades;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "estudiante")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Ingresar el nombre del estudiante")
    private String nombre;
    @Nullable
    private String email;
    private String pin;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public @NotBlank(message = "Ingresar el nombre del estudiante") String getNombre() {
        return nombre;
    }

    public void setNombre(@NotBlank(message = "Ingresar el nombre del estudiante") String nombre) {
        this.nombre = nombre;
    }

    @Nullable
    public String getEmail() {
        return email;
    }

    public void setEmail(@Nullable String email) {
        this.email = email;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}
