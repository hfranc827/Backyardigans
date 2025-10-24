package com.backyardigans.main2.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "afiliados")
public class Afiliado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreLocal;
    private String ruc;
    private String estado;
    private Long idUsuario;

    public Afiliado() {}

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombreLocal() { return nombreLocal; }
    public void setNombreLocal(String nombreLocal) { this.nombreLocal = nombreLocal; }

    public String getRuc() { return ruc; }
    public void setRuc(String ruc) { this.ruc = ruc; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public Long getIdUsuario() { return idUsuario; }
    public void setIdUsuario(Long idUsuario) { this.idUsuario = idUsuario; }
}
