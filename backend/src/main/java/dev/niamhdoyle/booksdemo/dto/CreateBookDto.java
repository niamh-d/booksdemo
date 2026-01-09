package dev.niamhdoyle.booksdemo.dto;

import dev.niamhdoyle.booksdemo.model.Author;

import java.util.List;

public record CreateBookDto(String title, List<Author> authors, String description, String publisher, String publishedYear) {
}
