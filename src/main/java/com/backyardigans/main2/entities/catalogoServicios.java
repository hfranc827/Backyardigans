package com.backyardigans.main2.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "catalogo_servicios")
public class catalogoServicios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_catalogo")
    private Long id_catalogo;

    @Column(name = "titulo", nullable = false, length = 100)
    private String titulo;

    @Column(name = "imagen", length = 255)
    private String imagen;

    @Column(name = "archivo", length = 255)
    private String archivo;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @Column(name = "precio", nullable = false)
    private Double precio;

    @Column(name = "tipo_servicio", length = 50)
    private String tipo_servicio;

    @Column(name = "id_afiliado", nullable = false)
    private Long id_afiliado;

    // Constructor vacío
    public catalogoServicios() {}

    // Constructor con parámetros
    public catalogoServicios(String titulo, String imagen, String archivo, String descripcion,
                             Double precio, String tipo_servicio, Long id_afiliado) {
        this.titulo = titulo;
        this.imagen = imagen;
        this.archivo = archivo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tipo_servicio = tipo_servicio;
        this.id_afiliado = id_afiliado;
    }

    // Getters y Setters
    public Long getId_catalogo() {
        return id_catalogo;
    }

    public void setId_catalogo(Long id_catalogo) {
        this.id_catalogo = id_catalogo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getTipo_servicio() {
        return tipo_servicio;
    }

    public void setTipo_servicio(String tipo_servicio) {
        this.tipo_servicio = tipo_servicio;
    }

    public Long getId_afiliado() {
        return id_afiliado;
    }

    public void setId_afiliado(Long id_afiliado) {
        this.id_afiliado = id_afiliado;
    }

    @Override
    public String toString() {
        return "catalogoServicios{" +
                "id_catalogo=" + id_catalogo +
                ", titulo='" + titulo + '\'' +
                ", imagen='" + imagen + '\'' +
                ", archivo='" + archivo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", tipo_servicio='" + tipo_servicio + '\'' +
                ", id_afiliado=" + id_afiliado +
                '}';
    }
}
