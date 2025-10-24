package com.backyardigans.main2.servicio;

import com.backyardigans.main2.entities.catalogoServicios;
import java.util.List;

public interface catalogoServiciosServicio{

    List<catalogoServicios> listar();

    catalogoServicios obtenerPorId(Long id);

    void guardar(catalogoServicios servicio);

    void eliminar(Long id);
}
