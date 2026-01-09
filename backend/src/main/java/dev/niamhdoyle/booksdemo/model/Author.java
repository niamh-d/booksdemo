package dev.niamhdoyle.booksdemo.model;

import dev.niamhdoyle.booksdemo.dto.CreateAuthorDto;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    private String id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String nationality;

    public Author(CreateAuthorDto createAuthorDto) {
        this.firstName = createAuthorDto.firstName();
        this.lastName = createAuthorDto.lastName();
        this.birthDate = createAuthorDto.dateOfBirth();
        this.nationality = createAuthorDto.nationality();
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getNationality() {
        return nationality;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
