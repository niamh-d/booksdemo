package dev.niamhdoyle.booksdemo.model;

import dev.niamhdoyle.booksdemo.dto.CreateBookDto;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    private String id;
    private String title;
    @ManyToMany
    private List<Author> authors;
    private String description;
    private String publisher;
    private String publishedYear;

    public Book() {}

    public Book(CreateBookDto createBookDto) {
        this.title = createBookDto.title();
        this.authors = createBookDto.authors();
        this.description = createBookDto.description();
        this.publisher = createBookDto.publisher();
        this.publishedYear = createBookDto.publishedYear();
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public String getDescription() {
        return description;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPublishedDate() {
        return publishedYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedYear = publishedDate;
    }
}
