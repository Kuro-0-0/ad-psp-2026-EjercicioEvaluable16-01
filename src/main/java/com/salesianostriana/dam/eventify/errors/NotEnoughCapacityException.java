package com.salesianostriana.dam.eventify.errors;

public class NotEnoughCapacityException extends RuntimeException {
    public NotEnoughCapacityException(String message) {
        super(message);
    }
}
