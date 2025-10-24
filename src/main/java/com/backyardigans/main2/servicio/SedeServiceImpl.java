package com.backyardigans.main2.servicio;

import com.backyardigans.main2.entities.Sede;
import com.backyardigans.main2.repository.SedeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SedeServiceImpl implements SedeService {

    private final SedeRepository repository;

    public SedeServiceImpl(SedeRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Sede> listar() {
        return repository.findAll();
    }

    @Override
    public Sede guardar(Sede sede) {
        return repository.save(sede);
    }

    @Override
    public Sede obtenerPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
