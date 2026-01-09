package dev.niamhdoyle.booksdemo.dto;

import java.util.List;

public record BookJson(String title, String author, String publisher, String publishedYear, List<String> authorNames) {
}
