package com.salesianostriana.dam.eventify.services;

import com.salesianostriana.dam.eventify.entities.Entrada;
import com.salesianostriana.dam.eventify.entities.extras.Estado;
import com.salesianostriana.dam.eventify.errors.AsistenteNotFoundException;
import com.salesianostriana.dam.eventify.errors.EventoNotFoundException;
import com.salesianostriana.dam.eventify.errors.NotEnoughCapacityException;
import com.salesianostriana.dam.eventify.repositories.AsistenteRepository;
import com.salesianostriana.dam.eventify.repositories.EntradaRepository;
import com.salesianostriana.dam.eventify.repositories.EventoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class EntradaService {

    private final EntradaRepository repository;

    private final EventoService eventoService;
    private final AsistenteRepository asistenteRepository;

    public Entrada comprarEntrada(Long idEvento, Long idAsistente) {

        Entrada entrada = Entrada.builder()
                .fechaCompra(LocalDate.now())
                .estado(Estado.ACTIVA)
                .evento(eventoService.buscarEvento(idEvento))
                .asistente(asistenteRepository.findById(idAsistente).orElseThrow(() -> new AsistenteNotFoundException("Asistente no encontrado")))
                .build();

        eventoService.comprarEntrada(entrada.getEvento());

        return repository.save(entrada);
    }

}

