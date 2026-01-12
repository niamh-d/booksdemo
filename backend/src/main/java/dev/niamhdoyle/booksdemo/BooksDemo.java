package dev.niamhdoyle.booksdemo;

import dev.niamhdoyle.booksdemo.dto.*;
import dev.niamhdoyle.booksdemo.model.Author;
import dev.niamhdoyle.booksdemo.model.Book;
import dev.niamhdoyle.booksdemo.service.BooksService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class BooksDemo {

    @Bean
    public CommandLineRunner commandLineRunner(BooksService booksService) {

        return args -> {

            ObjectMapper mapper = new ObjectMapper();
            List<AuthorJson> authorsReadJson = mapper.readValue(
                    new File("C:\\Users\\niamh\\Development\\IntellijProjects\\booksdemo\\backend\\src\\main\\resources\\data\\dummyAuthors.json"),
                    new TypeReference<>() {
                    }
            );
            List<BookJson> booksReadJson = mapper.readValue(
                    new File("C:\\Users\\niamh\\Development\\IntellijProjects\\booksdemo\\backend\\src\\main\\resources\\data\\dummyBooks.json"),
                    new TypeReference<>() {
                    }
            );

            List<Author> savedAuthors = new ArrayList<>();

            for(AuthorJson author : authorsReadJson){
                CreateAuthorDto authorDto = new CreateAuthorDto(
                        author.firstName(), author.lastName(), LocalDate.parse(author.dateOfBirth()), author.nationality());
                Author savedAuthor = booksService.createAuthor(authorDto);
                savedAuthors.add(savedAuthor);
            }

            for(BookJson book : booksReadJson){

                List<Author> authors = new ArrayList<>();

               for (String authorName : book.authorNames()) {
                   savedAuthors.stream()
                           .filter(a -> authorName.equals(a.getFirstName() + " " + a.getLastName()))
                           .findFirst().ifPresent(authors::add);
               }

                CreateBookDto createBookDto = new CreateBookDto(
                        book.title(),
                        authors,
                        "dummmy desciption",
                        book.publisher(),
                        book.publishedYear()
                );

               booksService.createBook(createBookDto);
            }
        };
    }
}
