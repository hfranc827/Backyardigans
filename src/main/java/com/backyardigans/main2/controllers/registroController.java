package com.backyardigans.main2.controllers;

import com.backyardigans.main2.entities.Usuario;
import com.backyardigans.main2.servicio.usuarioServicio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/registro")
public class registroController {

    private final usuarioServicio usuarioService;

    public registroController(usuarioServicio usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public String mostrarFormulario(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "PaginaRegistro"; // Nombre del archivo HTML con mayúscula inicial
    }

    @PostMapping("/guardar")
    public String guardarUsuario(@ModelAttribute("usuario") Usuario usuario, Model model) {
        if (usuarioService.existePorCorreo(usuario.getCorreo())) {
            model.addAttribute("error", "El correo ya está en uso");
            return "PaginaRegistro";
        }

        usuarioService.guardar(usuario);
        return "redirect:/login?registroExitoso";
    }
}
