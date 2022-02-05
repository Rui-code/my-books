package com.example.mybooks.book;

import java.util.UUID;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(UUID uuid) {
        super("Could not find book " + uuid);
    }
}
