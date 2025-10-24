package com.backyardigans.main2.repository;

import com.backyardigans.main2.entities.distrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface distritoRepository extends JpaRepository<distrito, Long> {

    @Query(value = """
        SELECT 
            d.distrito AS distrito,
            p.provincia AS provincia,
            dep.departamento AS departamento
        FROM ubigeo_distritos d
        JOIN ubigeo_provincias p ON d.provincia_id = p.id
        JOIN ubigeo_departamentos dep ON p.departamento_id = dep.id
        WHERE LOWER(d.distrito) LIKE LOWER(CONCAT('%', :nombre, '%'))
        ORDER BY dep.departamento, p.provincia, d.distrito
        """, nativeQuery = true)
    List<Object[]> buscarUbigeos(@Param("nombre") String nombre);
}
