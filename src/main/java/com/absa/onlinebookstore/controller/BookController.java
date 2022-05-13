package com.absa.onlinebookstore.controller;

import java.util.List;

import com.absa.onlinebookstore.dto.BookDTO;
import com.absa.onlinebookstore.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
    
    @Autowired
    public BookService bookService;

    @RequestMapping(value ="/orderBook", method = RequestMethod.POST)
    public ResponseEntity<String> addBook(@RequestBody BookDTO  bookDto){
        return new ResponseEntity<String>(bookService.addBook(bookDto), HttpStatus.OK);
    }

    @GetMapping("/getAllBooks")
    public ResponseEntity<List<BookDTO>> getAllBooks(){
       return new ResponseEntity<List<BookDTO>>(bookService.getAllBooks(), HttpStatus.OK);
    }
}
