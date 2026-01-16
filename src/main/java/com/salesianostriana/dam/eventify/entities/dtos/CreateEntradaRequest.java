package com.salesianostriana.dam.eventify.entities.dtos;

import com.salesianostriana.dam.eventify.entities.Asistente;
import com.salesianostriana.dam.eventify.entities.Entrada;
import com.salesianostriana.dam.eventify.entities.Evento;
import com.salesianostriana.dam.eventify.repositories.EntradaRepository;

public record CreateEntradaRequest(Long idEvento, Long idAsistente) {
    public Entrada toEntity() {
        return Entrada.builder()
                .evento(Evento.builder().id(idEvento).build())
                .asistente(Asistente.builder().id(idAsistente).build())
                .build();
    }
}
