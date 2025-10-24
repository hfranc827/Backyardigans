package com.backyardigans.main2.repository;

import com.backyardigans.main2.entities.catalogoServicios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface catalogoServiciosRepository extends JpaRepository<catalogoServicios, Long> {
}
