package com.backyardigans.main2.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class detalleReservaController {

    @GetMapping("/formulario-reserva")
    public String mostrarFormularioReserva() {
        return "PaginaFormularioReserva";
    }
}
