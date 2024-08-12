package com.example.Asistencias.Repositorio;

import com.example.Asistencias.Entidades.Docente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDocenteRepository  extends JpaRepository<Docente, Integer> {
}
