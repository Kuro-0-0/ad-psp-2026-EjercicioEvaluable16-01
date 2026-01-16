package com.salesianostriana.dam.eventify.entities.dtos;

import java.time.LocalDate;

/* Entrada: id, fechaCompra, estado (ACTIVA, CANCELADA) */
public record EntradaDto(LocalDate fechaCompra, String estado, String eventoTitulo) {}
