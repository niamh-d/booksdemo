package dev.niamhdoyle.booksdemo.dto;

import dev.niamhdoyle.booksdemo.model.Book;
import dev.niamhdoyle.booksdemo.model.Member;

import java.util.List;

public record CreateShelfDto(String name, List<Book> books, Member member) {
}
