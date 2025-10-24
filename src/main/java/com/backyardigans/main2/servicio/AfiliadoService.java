package com.backyardigans.main2.servicio;

import com.backyardigans.main2.entities.Afiliado;
import java.util.List;

public interface AfiliadoService {
    List<Afiliado> listar();
    Afiliado guardar(Afiliado afiliado);
    Afiliado obtenerPorId(Long id);
    void eliminar(Long id);
}
