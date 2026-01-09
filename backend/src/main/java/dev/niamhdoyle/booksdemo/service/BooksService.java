package dev.niamhdoyle.booksdemo.service;

import dev.niamhdoyle.booksdemo.dto.CreateAuthorDto;
import dev.niamhdoyle.booksdemo.dto.CreateBookDto;
import dev.niamhdoyle.booksdemo.model.Author;
import dev.niamhdoyle.booksdemo.model.Book;
import dev.niamhdoyle.booksdemo.repository.AuthorsRepository;
import dev.niamhdoyle.booksdemo.repository.BooksRepository;
import org.springframework.stereotype.Component;

@Component
public class BooksService {

    private final BooksRepository booksRepository;
    private final AuthorsRepository authorsRepository;

    public BooksService(BooksRepository booksRepository, AuthorsRepository authorsRepository) {
        this.booksRepository = booksRepository;
        this.authorsRepository = authorsRepository;
    }

    public Author createAuthor(CreateAuthorDto createAuthorDto) {
        Author author = new Author(createAuthorDto);
        return authorsRepository.save(author);
    }

    public Book createBook(CreateBookDto createBookDto) {
        Book book = new Book(createBookDto);
        return booksRepository.save(book);
    }

    public Iterable<Book> getAllBooks() {
        return booksRepository.findAll();
    }
}
