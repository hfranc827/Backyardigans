package com.backyardigans.main2.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "sedes")
public class Sede {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSedes;

    private Long idCarwash;
    private String distrito;
    private String direccion;
    private String horarioAtencion;
    private String ubicacionMapa;

    public Sede() {}

    // Getters y Setters
    public Long getIdSedes() {
        return idSedes;
    }

    public void setIdSedes(Long idSedes) {
        this.idSedes = idSedes;
    }

    public Long getIdCarwash() {
        return idCarwash;
    }

    public void setIdCarwash(Long idCarwash) {
        this.idCarwash = idCarwash;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHorarioAtencion() {
        return horarioAtencion;
    }

    public void setHorarioAtencion(String horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }

    public String getUbicacionMapa() {
        return ubicacionMapa;
    }

    public void setUbicacionMapa(String ubicacionMapa) {
        this.ubicacionMapa = ubicacionMapa;
    }
}
