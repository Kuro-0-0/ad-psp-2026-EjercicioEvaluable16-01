package com.salesianostriana.dam.eventify.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@Builder
public class Asistente {

    /* Asistente: id, nombre, email */

    @Id @GeneratedValue
    private Long id;

    private String nombre;
    private String email;

}
