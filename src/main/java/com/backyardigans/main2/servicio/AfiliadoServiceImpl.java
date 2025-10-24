package com.backyardigans.main2.servicio;

import com.backyardigans.main2.entities.Afiliado;
import com.backyardigans.main2.repository.AfiliadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AfiliadoServiceImpl implements AfiliadoService {

    private final AfiliadoRepository repository;

    public AfiliadoServiceImpl(AfiliadoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Afiliado> listar() {
        return repository.findAll();
    }

    @Override
    public Afiliado guardar(Afiliado afiliado) {
        return repository.save(afiliado);
    }

    @Override
    public Afiliado obtenerPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
