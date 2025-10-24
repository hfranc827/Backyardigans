package com.backyardigans.main2.repository;

import com.backyardigans.main2.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface usuarioRepository extends JpaRepository<Usuario, Long> {

    // Buscar un usuario por su correo electrónico
    Optional<Usuario> findByCorreo(String correo);
}
