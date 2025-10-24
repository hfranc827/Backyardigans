package com.backyardigans.main2.servicio;

import com.backyardigans.main2.entities.catalogoServicios;
import com.backyardigans.main2.repository.catalogoServiciosRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class catalogoServiciosServicioImpl implements catalogoServiciosServicio {

    private final catalogoServiciosRepository repository;

    public catalogoServiciosServicioImpl(catalogoServiciosRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<catalogoServicios> listar() {
        return repository.findAll();
    }

    @Override
    public catalogoServicios obtenerPorId(Long id) {
        Optional<catalogoServicios> optional = repository.findById(id);
        return optional.orElse(null);
    }

    @Override
    public void guardar(catalogoServicios servicio) {
        repository.save(servicio);
    }

    @Override
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
