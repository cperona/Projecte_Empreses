package com.example.empreses.controladors;

import com.example.empreses.entitats.Alumne;
import com.example.empreses.repositoris.AlumneDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("api")
public class AlumneControlador {
    @Autowired
    AlumneDAO repositoriAlumnes;

    @GetMapping("alumnes")
    public String alumnes(Model model) {
        model.addAttribute("alumnes", repositoriAlumnes.findAll());
        return "alumnes/llista_alumnes";
    }

    @GetMapping("alumnes/nou")
    public String mostrarFormulariAlumnes(Model model) {
        Alumne alumne = new Alumne();
        model.addAttribute("alumne", alumne);
        return "alumnes/nou_alumne";
    }

    @PostMapping("alumnes/alta")
    public String altaAlumnes(Alumne alumne, Model model) {
        //Validació de dades del formulari
        List<Alumne> alumnes = repositoriAlumnes.findAlumneByDni(alumne.getDni());
        if (alumnes.size() > 0) {
            return "alumnes/ja_existeix_alumne";
        }
        repositoriAlumnes.save(alumne);
        //fem redirecció per a evitar que s'envi el formulari més d'un cop
        return "redirect:/api/alumnes";
    }
}