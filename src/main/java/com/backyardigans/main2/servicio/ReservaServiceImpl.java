package com.backyardigans.main2.servicio;

import com.backyardigans.main2.entities.Reserva;
import com.backyardigans.main2.repository.ReservaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
public class ReservaServiceImpl implements ReservaService {

    private final ReservaRepository repository;

    public ReservaServiceImpl(ReservaRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Reserva> listar() {
        return repository.findAll();
    }

    @Override
    public Reserva guardar(Reserva reserva) {
        return repository.save(reserva);
    }

    @Override
    public Reserva obtenerPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        repository.deleteById(id);
    }

    @Override
    public boolean existeReserva(LocalDate fecha, LocalTime hora, Long ideSede) {
        return repository.existsByFechaAndHoraAndIdeSede(fecha, hora, ideSede);
    }
}
