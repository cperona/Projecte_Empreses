package com.example.empreses.repositoris;

import com.example.empreses.entitats.Alumne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AlumneDAO extends JpaRepository<Alumne, Long> {
    @Query("select e from Alumne e where e.dni = :dniValue")
    List<Alumne> findAlumneByDni(@Param("dniValue") String dni);

}
