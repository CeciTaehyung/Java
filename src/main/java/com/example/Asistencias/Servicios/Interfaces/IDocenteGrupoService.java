package com.example.Asistencias.Servicios.Interfaces;

import com.example.Asistencias.Entidades.Docente;
import com.example.Asistencias.Entidades.DocenteGrupo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IDocenteGrupoService {

    Page<DocenteGrupo> BuscarTodosPaginador(Pageable pageable);
    List<DocenteGrupo> ObtenerPorTodos();
    Optional<DocenteGrupo> BuscarPorId(Integer id);
    DocenteGrupo CrearOeditar(DocenteGrupo docenteGrupo);
    void EliminarPorId(Integer id);


    Page<DocenteGrupo> BuscarTodosPaginador();
}
