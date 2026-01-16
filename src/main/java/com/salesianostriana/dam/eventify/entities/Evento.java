package com.salesianostriana.dam.eventify.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@Builder
public class Evento {

    /* Evento: id, titulo, fecha, aforoMaximo, entradasVendidas */

    @Id @GeneratedValue
    private Long id;

    private String titulo;
    private LocalDate fecha;
    private int aforoMaximo;
    private int entradasVendidas;

}
