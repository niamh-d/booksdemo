package dev.niamhdoyle.booksdemo.model;

import dev.niamhdoyle.booksdemo.dto.CreateUserDto;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String id;

    private String userName;

    private String email;

    private String password;

    public User(CreateUserDto createUserDto) {
        this.userName = createUserDto.userName();
        this.password = createUserDto.password();
    }

    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}