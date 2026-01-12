package dev.niamhdoyle.booksdemo.dto;

import java.time.LocalDate;

public record CreateAuthorDto(String firstName, String lastName, LocalDate dateOfBirth, String nationality) { }