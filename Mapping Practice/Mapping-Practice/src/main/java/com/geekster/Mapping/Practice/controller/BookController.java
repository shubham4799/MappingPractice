package com.geekster.Mapping.Practice.controller;

import com.geekster.Mapping.Practice.models.Book;
import com.geekster.Mapping.Practice.servises.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/addBook")
    public String addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @GetMapping("/getAllBook")
    public List<Book> getAllBook(){
        return bookService.getAllBook();
    }

    @PutMapping("/updateBook")
    public String updateBook(@RequestBody Book book){
        return bookService.updateBook(book);
    }

    @DeleteMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable Integer bookId){
        return bookService.deleteBook(bookId);
    }

}
