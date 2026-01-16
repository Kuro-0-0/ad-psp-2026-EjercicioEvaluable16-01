package com.salesianostriana.dam.eventify.services;

import com.salesianostriana.dam.eventify.entities.Evento;
import com.salesianostriana.dam.eventify.errors.EventoNotFoundException;
import com.salesianostriana.dam.eventify.errors.NotEnoughCapacityException;
import com.salesianostriana.dam.eventify.repositories.EventoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service @RequiredArgsConstructor
public class EventoService {

    private  final EventoRepository repository;

    public Evento buscarEvento(Long idEvento) {
        return repository.findById(idEvento).orElseThrow(() -> new EventoNotFoundException("No se ha encontrado ningun evento con id: " + idEvento));
    }

    public void comprarEntrada(Evento evento) {

        if (evento.getAforoMaximo() <= evento.getEntradasVendidas())
            throw new NotEnoughCapacityException("No hay suficiente aforo para comprar esta entrada.");

        evento.setEntradasVendidas(evento.getEntradasVendidas() + 1);

        repository.save(evento);
    }

}
