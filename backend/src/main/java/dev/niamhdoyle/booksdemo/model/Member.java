package dev.niamhdoyle.booksdemo.model;

import dev.niamhdoyle.booksdemo.dto.CreateMemberDto;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Member {
    @Id
    private String id;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String city;
    private String country;
    private String description;
    private String avatar;

    public Member() {}

    public Member(CreateMemberDto createMemberDto) {
        id = createMemberDto.id();
        userName = createMemberDto.userName();
        firstName = createMemberDto.firstName();
        lastName = createMemberDto.lastName();
        email = createMemberDto.email();
        city = createMemberDto.city();
        country = createMemberDto.country();
        description = createMemberDto.description();
        avatar = createMemberDto.avatar();
    }

    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getDescription() {
        return description;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
