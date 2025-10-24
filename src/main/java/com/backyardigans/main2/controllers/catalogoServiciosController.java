package com.backyardigans.main2.controllers;

import com.backyardigans.main2.entities.catalogoServicios;
import com.backyardigans.main2.servicio.catalogoServiciosServicio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/catalogos")
public class catalogoServiciosController {

    private final catalogoServiciosServicio service;

    public catalogoServiciosController(catalogoServiciosServicio service) {
        this.service = service;
    }

    @GetMapping
    public String listarCatalogo(Model model) {
        model.addAttribute("servicios", service.listar());
        return "catalogo"; // Vista: catalogo.html
    }

    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("servicio", new catalogoServicios());
        return "form-catalogo"; // Vista: form-catalogo.html
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute("servicio") catalogoServicios servicio) {
        service.guardar(servicio);
        return "redirect:/catalogo?success=true";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        catalogoServicios servicio = service.obtenerPorId(id);
        model.addAttribute("servicio", servicio);
        return "form-catalogo";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        service.eliminar(id);
        return "redirect:/catalogo?deleted=true";
    }
}
