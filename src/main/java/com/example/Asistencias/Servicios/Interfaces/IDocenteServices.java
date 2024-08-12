package com.example.Asistencias.Servicios.Interfaces;

import com.example.Asistencias.Entidades.Docente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IDocenteServices {
    Page<Docente> BuscarTodosPaginador(Pageable pageable);
    List<Docente> ObtenerPorTodos();
    Optional<Docente>BuscarPorId(Integer id);
    Docente CrearOeditar(Docente docente);
    void EliminarPorId(Integer id);
}
