package com.backyardigans.main2.entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "reservas")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reservas")
    private Long idReservas;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @Column(name = "hora", nullable = false)
    private LocalTime hora;

    @Column(name = "estado", length = 20)
    private String estado;

    @Column(name = "id_usuario")
    private Long idUsuario;

    @Column(name = "id_sede")
    private Long ideSede;

    public Reserva() {}

    public Reserva(LocalDate fecha, LocalTime hora, String estado, Long idUsuario, Long ideSede) {
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
        this.idUsuario = idUsuario;
        this.ideSede = ideSede;
    }

    // Getters y Setters
    public Long getIdReservas() { return idReservas; }
    public void setIdReservas(Long idReservas) { this.idReservas = idReservas; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public LocalTime getHora() { return hora; }
    public void setHora(LocalTime hora) { this.hora = hora; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public Long getIdUsuario() { return idUsuario; }
    public void setIdUsuario(Long idUsuario) { this.idUsuario = idUsuario; }

    public Long getIdeSede() { return ideSede; }
    public void setIdeSede(Long ideSede) { this.ideSede = ideSede; }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + idReservas +
                ", fecha=" + fecha +
                ", hora=" + hora +
                ", estado='" + estado + '\'' +
                ", idUsuario=" + idUsuario +
                ", ideSede=" + ideSede +
                '}';
    }
}
