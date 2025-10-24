package com.backyardigans.main2.controllers;

import com.backyardigans.main2.entities.Sede;
import com.backyardigans.main2.servicio.SedeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/sedes")
public class SedeController {

    private final SedeService service;

    public SedeController(SedeService service) {
        this.service = service;
    }

    @GetMapping
    public String listarSedes(Model model) {
        model.addAttribute("sedes", service.listar());
        return "sedes"; // templates/sedes.html
    }

    @GetMapping("/nueva")
    public String mostrarFormulario(Model model) {
        model.addAttribute("sede", new Sede());
        return "form-sede"; // templates/form-sede.html
    }

    @PostMapping
    public String guardar(@ModelAttribute("sede") Sede sede) {
        service.guardar(sede);
        return "redirect:/sedes";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Sede sede = service.obtenerPorId(id);
        model.addAttribute("sede", sede);
        return "form-sede";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        service.eliminar(id);
        return "redirect:/sedes";
    }
}
