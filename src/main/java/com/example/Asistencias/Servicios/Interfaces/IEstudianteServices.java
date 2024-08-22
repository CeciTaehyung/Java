package com.example.Asistencias.Servicios.Interfaces;

import com.example.Asistencias.Entidades.DocenteGrupo;
import com.example.Asistencias.Entidades.Estudiante;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;


public interface IEstudianteServices {

    Page<Estudiante> BuscarTodosPaginador(Pageable pageable);
    List<Estudiante> ObtenerPorTodos();
    Optional<Estudiante> BuscarPorId(Integer id);
    Estudiante CrearOeditar(Estudiante estudiante);
    void EliminarPorId(Integer id);
}
