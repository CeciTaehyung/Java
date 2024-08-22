package com.example.Asistencias.Servicios.Implementacion;

import com.example.Asistencias.Entidades.Estudiante;
import com.example.Asistencias.Repositorio.IEstudianteRepository;
import com.example.Asistencias.Servicios.Interfaces.IEstudianteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EstudianteServices implements IEstudianteServices {

    @Autowired
    private IEstudianteRepository estudianteRepository ;

    @Override
    public Page<Estudiante> BuscarTodosPaginador(Pageable pageable) {
        return estudianteRepository.findAll(pageable);
    }

    @Override
    public List<Estudiante> ObtenerPorTodos() {
        return List.of();
    }

    @Override
    public Optional<Estudiante> BuscarPorId(Integer id) {
        return Optional.empty();
    }

    @Override
    public Estudiante CrearOeditar(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public void EliminarPorId(Integer id) {
        estudianteRepository.deleteById(id);
    }
}
