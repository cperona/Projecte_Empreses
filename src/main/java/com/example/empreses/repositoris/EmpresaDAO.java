package com.example.empreses.repositoris;

import com.example.empreses.entitats.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaDAO extends JpaRepository<Empresa, Integer> {

}
