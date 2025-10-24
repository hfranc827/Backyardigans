package com.backyardigans.main2.servicio;

import com.backyardigans.main2.entities.Sede;
import java.util.List;

public interface SedeService {
    List<Sede> listar();
    Sede guardar(Sede sede);
    Sede obtenerPorId(Long id);
    void eliminar(Long id);
}
