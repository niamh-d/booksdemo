package dev.niamhdoyle.booksdemo.repository;

import org.springframework.data.repository.CrudRepository;

import dev.niamhdoyle.booksdemo.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}