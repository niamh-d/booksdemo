package dev.niamhdoyle.booksdemo.repository;

import dev.niamhdoyle.booksdemo.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorsRepository extends CrudRepository<Author, Long> {
}
