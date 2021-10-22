package com.example.mybooks.book;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "tbl_books")
public class Book {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private String author;

    @Type(type = "true_false")
    private boolean read;

    @Basic
    @Column(name = "acquisition_date")
    private LocalDate acquisitionDate;

    @Basic
    @Column(name = "start_date_reading")
    private LocalDate startDateReading;

    @Basic
    @Column(name = "end_date_reading")
    private LocalDate endDateReading;

    public Book() {}

    public Book(UUID id, String name, String author, boolean read, LocalDate acquisitionDate, LocalDate startDateReading, LocalDate endDateReading) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.read = read;
        this.acquisitionDate = acquisitionDate;
        this.startDateReading = startDateReading;
        this.endDateReading = endDateReading;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public LocalDate getAcquisitionDate() {
        return acquisitionDate;
    }

    public void setAcquisitionDate(LocalDate acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }

    public LocalDate getStartDateReading() {
        return startDateReading;
    }

    public void setStartDateReading(LocalDate startDateReading) {
        this.startDateReading = startDateReading;
    }

    public LocalDate getEndDateReading() {
        return endDateReading;
    }

    public void setEndDateReading(LocalDate endDateReading) {
        this.endDateReading = endDateReading;
    }
}
