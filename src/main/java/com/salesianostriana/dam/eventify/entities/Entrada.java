package com.salesianostriana.dam.eventify.entities;


import com.salesianostriana.dam.eventify.entities.extras.Estado;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@Builder
public class Entrada {

    /* Entrada: id, fechaCompra, estado (ACTIVA, CANCELADA) */

    @Id @GeneratedValue
    private Long id;

    private LocalDate fechaCompra;

    @Enumerated(EnumType.STRING)
    private Estado estado;


}
