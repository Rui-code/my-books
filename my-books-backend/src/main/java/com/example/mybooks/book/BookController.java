package com.example.mybooks.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class BookController {
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/api/v1/book")
    public List<Book> all() {
        return bookService.all();
    }

    @PostMapping("/api/v1/book")
    public Book newBook(@RequestBody Book newBook) {
        return bookService.newBook(newBook);
    }

    @GetMapping("/api/v1/book/{id}")
    public Book one(@PathVariable UUID id) {
        return bookService.one(id);
    }

    @PutMapping("/api/v1/book/{id}")
    public Book replaceBook(@PathVariable UUID id, @RequestBody Book newBook) {
        return bookService.replaceBook(id, newBook);
    }

    @DeleteMapping("/api/v1/book/{id}")
    public void deleteBook(@PathVariable UUID id) {
        bookService.deleteBook(id);
    }
}
