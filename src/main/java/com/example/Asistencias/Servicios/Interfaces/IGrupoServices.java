package com.example.Asistencias.Servicios.Interfaces;

import com.example.Asistencias.Entidades.Grupo;
import org.springframework.data.domain.Page; // Agregar import de spring
import org.springframework.data.domain.Pageable; //Agregar import de spring


import java.util.List;
import java.util.Optional;

public interface IGrupoServices {

    Page<Grupo> BuscarTodosPaginados(Pageable pageable);
    List<Grupo>  ObtenerTodos();


    Optional<Grupo> BuscarPorId(Integer id);

    Grupo CrearOeditar(Grupo grupo);
    void EliminarPorId(Integer id);
}

