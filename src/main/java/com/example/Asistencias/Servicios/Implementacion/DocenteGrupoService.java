package com.example.Asistencias.Servicios.Implementacion;

import com.example.Asistencias.Entidades.DocenteGrupo;
import com.example.Asistencias.Repositorio.IDocenteGrupo;
import com.example.Asistencias.Servicios.Interfaces.IDocenteGrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocenteGrupoService  implements IDocenteGrupoService {

    @Autowired
    private IDocenteGrupo docenteGrupoRepository;

    @Override
    public Page<DocenteGrupo> BuscarTodosPaginador(Pageable pageable) {
        return docenteGrupoRepository.findByOrderByDocenteDesc(pageable);
    }

    @Override
    public List<DocenteGrupo> ObtenerPorTodos() {
        return docenteGrupoRepository.findAll();
    }

    @Override
    public Optional<DocenteGrupo> BuscarPorId(Integer id) {
        return docenteGrupoRepository.findById(id);
    }

    @Override
    public DocenteGrupo CrearOeditar(DocenteGrupo docenteGrupo) {
        return docenteGrupoRepository.save(docenteGrupo);
    }

    @Override
    public void EliminarPorId(Integer id) {

        docenteGrupoRepository.findById(id);
    }

    @Override
    public Page<DocenteGrupo> BuscarTodosPaginador() {
        return null;
    }
}
