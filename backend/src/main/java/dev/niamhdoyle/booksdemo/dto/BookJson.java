package dev.niamhdoyle.booksdemo.dto;

import java.util.List;

public record BookJson(String title, List<String> authorNames, String publisher, String publishedYear) {
}
