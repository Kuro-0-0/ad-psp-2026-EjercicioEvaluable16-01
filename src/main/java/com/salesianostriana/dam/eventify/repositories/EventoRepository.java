package com.salesianostriana.dam.eventify.repositories;

import com.salesianostriana.dam.eventify.entities.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {
}
