package com.example.Asistencias.Repositorio;

import com.example.Asistencias.Entidades.DocenteGrupo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDocenteGrupo  extends JpaRepository<DocenteGrupo, Integer> {

    Page<DocenteGrupo> findByOrderByTeacherDesc(Pageable pageable);
}
