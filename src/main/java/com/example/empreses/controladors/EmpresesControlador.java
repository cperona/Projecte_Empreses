package com.example.empreses.controladors;

import com.example.empreses.entitats.Empresa;
import com.example.empreses.repositoris.EmpresaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api")
public class EmpresesControlador {
    @Autowired
    EmpresaDAO repositoriEmpreses;

    @GetMapping("empreses")
    public String empreses(Model model) {
        model.addAttribute("empreses", repositoriEmpreses.findAll());
        return "empreses/llista_empreses";
    }

    @GetMapping("empreses/nou")
    public String mostrarFormulariEmpreses(Model model) {
        Empresa empresa = new Empresa();
        model.addAttribute("empresa", empresa);
        return "empreses/nova_empresa";
    }

    @PostMapping("empreses/alta")
    public String altaEmpresa(Empresa empresa, Model model) {
        repositoriEmpreses.save(empresa);
        //fem redirecció per a evitar que s'envi el formulari més d'un cop
        return "redirect:/api/empreses";
    }
}
