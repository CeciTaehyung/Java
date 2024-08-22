package com.example.Asistencias.Repositorio;

import com.example.Asistencias.Entidades.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstudianteRepository  extends JpaRepository<Estudiante, Integer> {

}
