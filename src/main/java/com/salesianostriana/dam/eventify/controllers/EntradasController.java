package com.salesianostriana.dam.eventify.controllers;

import com.salesianostriana.dam.eventify.entities.dtos.CreateEntradaRequest;
import com.salesianostriana.dam.eventify.entities.dtos.EntradaDTO;
import com.salesianostriana.dam.eventify.services.EntradaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/entradas")
public class EntradasController {

    private final EntradaService service;

    @PostMapping()
    public ResponseEntity<EntradaDTO> comprarEntrada(CreateEntradaRequest createEntradaRequest) {
        return ResponseEntity.ok().body(
                EntradaDTO.toDTO(service.comprarEntrada(createEntradaRequest.toEntity()))
        );
    }

    @PutMapping("{id}/cancelar")
    public ResponseEntity<EntradaDTO> cancelarEntrada(@PathVariable Long id) {
        return ResponseEntity.ok().body(
                EntradaDTO.toDTO(
                        service.cancelarEntrada(id)
                )
        );
    }


}
