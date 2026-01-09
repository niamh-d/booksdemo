package dev.niamhdoyle.booksdemo.controller;

import dev.niamhdoyle.booksdemo.dto.CreateUserDto;
import dev.niamhdoyle.booksdemo.model.Book;
import dev.niamhdoyle.booksdemo.model.User;
import dev.niamhdoyle.booksdemo.repository.UserRepository;
import dev.niamhdoyle.booksdemo.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/api")
public class MainController {
    @Autowired
    private BooksService booksService;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Book> getAllBooks(){
        return booksService.getAllBooks();
    }
}