package com.example.mybooks.book;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public List<Book> all() {
        return repository.findAll();
    }

    public Book newBook(Book newBook) {
        return repository.save(newBook);
    }

    public Book one(UUID id) {
        return repository.findById(id)
                .orElseThrow(() -> new BookNotFoundException(id));
    }

    public Book replaceBook(UUID id, Book newBook) {
        return repository.findById(id)
                .map(book -> {
                    book.setName(newBook.getName());
                    book.setAuthor(newBook.getAuthor());
                    book.setRead(newBook.isRead());
                    book.setAcquisitionDate(newBook.getAcquisitionDate());
                    book.setStartDateReading(newBook.getStartDateReading());
                    book.setEndDateReading(newBook.getEndDateReading());
                    return repository.save(newBook);
                }).orElseGet(() -> {
                    newBook.setId(id);
                    return repository.save(newBook);
                });
    }

    public void deleteBook(UUID id) {
        repository.deleteById(id);
    }
}
