package com.backyardigans.main2.repository;

import com.backyardigans.main2.entities.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    List<Reserva> findByIdUsuario(Long idUsuario);
    List<Reserva> findByIdeSede(Long ideSede);
    boolean existsByFechaAndHoraAndIdeSede(LocalDate fecha, LocalTime hora, Long ideSede);
}
