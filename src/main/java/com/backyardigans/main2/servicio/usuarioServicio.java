package com.backyardigans.main2.servicio;

import com.backyardigans.main2.entities.Usuario;
import com.backyardigans.main2.repository.usuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class usuarioServicio {

    private final usuarioRepository repositorio;

    public usuarioServicio(usuarioRepository repositorio) {
        this.repositorio = repositorio;
    }

    public void guardar(Usuario usuario) {
        repositorio.save(usuario);
    }

    public boolean existePorCorreo(String correo) {
        return repositorio.findByCorreo(correo).isPresent();
    }

    public List<Usuario> listarTodos() {
        return repositorio.findAll();
    }

    public Optional<Usuario> buscarPorId(Long id) {
        return repositorio.findById(id);
    }

    public Optional<Usuario> buscarPorCorreo(String correo) {
        return repositorio.findByCorreo(correo);
    }

    public void eliminar(Long id) {
        repositorio.deleteById(id);
    }
}
