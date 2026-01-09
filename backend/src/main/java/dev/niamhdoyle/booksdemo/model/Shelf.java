package dev.niamhdoyle.booksdemo.model;

import dev.niamhdoyle.booksdemo.dto.CreateShelfDto;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "shelves")
public class Shelf {
    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    private String id;
    private String name;
    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;
    List<Book> books;

    public Shelf(CreateShelfDto createShelfDto) {
        name = createShelfDto.name();
        books = createShelfDto.books();
        member = createShelfDto.member();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Member getMember() {
        return member;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
