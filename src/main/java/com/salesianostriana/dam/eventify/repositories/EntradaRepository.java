package com.salesianostriana.dam.eventify.repositories;

import com.salesianostriana.dam.eventify.entities.Entrada;
import com.salesianostriana.dam.eventify.entities.extras.Estado;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EntradaRepository extends JpaRepository<Entrada, Long> {


    List<Entrada> findByAsistente_IdAndEstado(Long id, Estado estado);

    @EntityGraph(attributePaths = {"asistente", "evento"})
    @Query(
            "SELECT e FROM Entrada e WHERE e.evento.id = :id"
    )
    Page<Entrada> findByEvento(Long id, Pageable pageable);

}
