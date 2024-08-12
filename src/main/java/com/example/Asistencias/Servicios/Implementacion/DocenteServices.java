package com.example.Asistencias.Servicios.Implementacion;

import com.example.Asistencias.Entidades.Docente;
import com.example.Asistencias.Repositorio.IDocenteRepository;
import com.example.Asistencias.Servicios.Interfaces.IDocenteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DocenteServices implements IDocenteServices {

    @Autowired
    private IDocenteRepository docenteRepository;


    @Override
    public Page<Docente> BuscarTodosPaginador(Pageable pageable) {
        return docenteRepository.findAll(pageable);
    }

    @Override
    public List<Docente> ObtenerPorTodos() {
        return docenteRepository.findAll();
    }



    @Override
    public Optional<Docente> BuscarPorId(Integer id) {
        return docenteRepository.findById(id);
    }

    @Override
    public Docente CrearOeditar(Docente docente) {
        return docenteRepository.save(docente);
    }

    @Override
    public void EliminarPorId(Integer id) {
        docenteRepository.deleteById(id);

    }
}

