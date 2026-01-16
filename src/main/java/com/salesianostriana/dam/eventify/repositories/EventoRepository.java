package com.salesianostriana.dam.eventify.repositories;

import com.salesianostriana.dam.eventify.entities.Entrada;
import com.salesianostriana.dam.eventify.entities.Evento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {

    @EntityGraph(attributePaths = {"entradas"})
    Page<Entrada> findEntradaByEventoId(Long id, Pageable pageable);

}
