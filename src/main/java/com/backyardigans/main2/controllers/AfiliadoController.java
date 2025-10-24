package com.backyardigans.main2.controllers;

import com.backyardigans.main2.entities.Afiliado;
import com.backyardigans.main2.servicio.AfiliadoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/afiliados")
public class AfiliadoController {

    private final AfiliadoService service;

    public AfiliadoController(AfiliadoService service) {
        this.service = service;
    }

    // Dashboard
    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("afiliados", service.listar());
        return "dashboard-afiliados"; // templates/dashboard-afiliados.html
    }

    // Crear nuevo
    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("afiliado", new Afiliado());
        return "form-afiliado";
    }

    @PostMapping
    public String guardar(@ModelAttribute Afiliado afiliado) {
        service.guardar(afiliado);
        return "redirect:/afiliados/dashboard";
    }

    // Editar
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Afiliado afiliado = service.obtenerPorId(id);
        model.addAttribute("afiliado", afiliado);
        return "form-afiliado";
    }

    // Eliminar
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        service.eliminar(id);
        return "redirect:/afiliados/dashboard";
    }
}
