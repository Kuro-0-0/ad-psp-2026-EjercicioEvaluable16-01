package com.salesianostriana.dam.eventify.errors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NotEnoughCapacityException.class)
    public ProblemDetail NotEnoughCapacityExceptionHandler(NotEnoughCapacityException ex) {
        ProblemDetail pb = ProblemDetail.forStatusAndDetail(HttpStatus.BAD_REQUEST, ex.getMessage());

        pb.setTitle("Error al procesar la solicitud de la entrada");

        return pb;
    }

    @ExceptionHandler(EntityNotFoundException.class)
    public ProblemDetail entityNotFoundExceptionHandler(EntityNotFoundException ex) {
        ProblemDetail pb = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, ex.getMessage());

        pb.setTitle("Entidad no encontrado");

        return pb;
    }

}


