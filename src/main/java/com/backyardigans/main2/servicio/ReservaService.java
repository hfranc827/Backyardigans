package com.backyardigans.main2.servicio;

import com.backyardigans.main2.entities.Reserva;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface ReservaService {
    boolean existeReserva(LocalDate fecha, LocalTime hora, Long ideSede);

    List<Reserva> listar();
    Reserva guardar(Reserva reserva);
    Reserva obtenerPorId(Long id);
    void eliminar(Long id);
}
