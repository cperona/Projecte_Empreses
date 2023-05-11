package com.example.empreses.repositoris;

import com.example.empreses.entitats.Alumne;
import com.example.empreses.entitats.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmpresaDAO extends JpaRepository<Empresa, Long> {
    @Query("select e from Empresa e where e.cif = :cifValue")
    List<Alumne> findAlumneByCif(@Param("cifValue") String cif);
}
