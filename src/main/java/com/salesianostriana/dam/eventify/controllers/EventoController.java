package com.salesianostriana.dam.eventify.controllers;

import com.salesianostriana.dam.eventify.entities.dtos.EntradaDTO;
import com.salesianostriana.dam.eventify.services.EventoService;
import lombok.RequiredArgsConstructor;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/eventos")
public class EventoController {

    private final EventoService service;

    @GetMapping("{id}/entradas")
    public ResponseEntity<Page<EntradaDTO>> getEntradasByEvento(@PathVariable Long id, Pageable pageable) {
        return ResponseEntity.ok().body(
                service.getEntradasByEvento(id, pageable).map(EntradaDTO::toDTO)
        );
    }

}
