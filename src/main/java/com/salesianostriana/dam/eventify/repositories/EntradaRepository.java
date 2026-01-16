package com.salesianostriana.dam.eventify.repositories;

import com.salesianostriana.dam.eventify.entities.Entrada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntradaRepository extends JpaRepository<Entrada, Long> {
}
