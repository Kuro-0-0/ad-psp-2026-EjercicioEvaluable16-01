package com.salesianostriana.dam.eventify.entities.dtos;

import com.salesianostriana.dam.eventify.entities.Entrada;

import java.time.LocalDate;

/* Entrada: id, fechaCompra, estado (ACTIVA, CANCELADA) */
public record EntradaDTO(LocalDate fechaCompra, String estado, String eventoTitulo) {
    public static EntradaDTO toDTO(Entrada entrada) {
        return new EntradaDTO(
                entrada.getFechaCompra(),
                entrada.getEstado().name(),
                entrada.getEvento().getTitulo()
        );
    }
}
