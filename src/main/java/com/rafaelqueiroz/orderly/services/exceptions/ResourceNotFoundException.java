package com.rafaelqueiroz.orderly.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(Object id) {
        super("Resource not found with id " + id);
    }
}
