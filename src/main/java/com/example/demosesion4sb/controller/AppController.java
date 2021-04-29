package com.example.demosesion4sb.controller;

import com.example.demosesion4sb.modelo.Alumno;
import com.example.demosesion4sb.modelo.Asesor;
import com.example.demosesion4sb.repo.AlumnoRepository;
import com.example.demosesion4sb.repo.AsesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class AppController {

    @Autowired
    private AsesorRepository asesorRepository;

    @Autowired
    private AlumnoRepository alumnoRepository;

    @GetMapping("")
    ModelAndView index() {
        List<Alumno> alumnos = alumnoRepository.findAll();

        return new ModelAndView("indexForm")
                .addObject("alumnos", alumnos);
    }

    @GetMapping("/nuevo")
    ModelAndView nuevo() {
        return new ModelAndView("nuevo")
                .addObject("alumno", new Alumno());
    }

    @PostMapping("/nuevo")
    ModelAndView crear(@Validated Alumno alumno, BindingResult bindingResult, RedirectAttributes ra) {
        if (bindingResult.hasErrors()) {
            return new ModelAndView("nuevo")
                    .addObject("alumno", alumno);
        }

        alumno.setUltimoregistro(LocalDateTime.now());

        alumnoRepository.save(alumno);
        ra.addFlashAttribute("success", "El alumno ha sido registrado correctamente");
        return new ModelAndView("redirect:/");
    }

    @GetMapping("/web")
    String indexP(){
        return "index";
    }



}