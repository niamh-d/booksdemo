package dev.niamhdoyle.booksdemo.dto;

public record CreateMemberDto(
        String id, String userName, String firstName, String lastName, String email, String city, String country, String description, String avatar
) { }
