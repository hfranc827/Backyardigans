package com.backyardigans.main2.controllers;

import com.backyardigans.main2.entities.Reserva;
import com.backyardigans.main2.servicio.ReservaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
@RequestMapping ("/afiliado-reserva")
public class reservaController {

    private final ReservaService service;

    public reservaController(ReservaService service) {
        this.service = service;
    }

    @GetMapping ("/reserva-lista")
    public String listarReservas(Model model) {
        model.addAttribute("reservas", service.listar());
        return "GestionReserva"; ///////
    }

    @GetMapping("/reserva-nueva")
    public String mostrarFormulario(Model model) {
        model.addAttribute("reserva", new Reserva());
        return "form-reserva";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute("reserva") Reserva reserva) {

        if (reserva.getFecha().isBefore(LocalDate.now())) {
            return "redirect:/gestion-reserva/reserva-nueva?error=fechaInvalida";
        }

        if (service.existeReserva(reserva.getFecha(), reserva.getHora(), reserva.getIdeSede())) {
            return "redirect:/gestion-reserva/reserva-nueva?error=yaReservado";
        }

        service.guardar(reserva);
        return "redirect:/gestion-reserva?success=true";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Reserva reserva = service.obtenerPorId(id);
        model.addAttribute("reserva", reserva);
        return "form-reserva";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        service.eliminar(id);
        return "redirect:/gestion-reserva?deleted=true";
    }
}

