package com.salesianostriana.dam.eventify.repositories;

import com.salesianostriana.dam.eventify.entities.Asistente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsistenteRepository extends JpaRepository<Asistente, Long> {
}
