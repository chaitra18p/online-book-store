package com.absa.onlinebookstore;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import com.absa.onlinebookstore.dto.BookDTO;
import com.absa.onlinebookstore.service.BookService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OnlineBookStoreApplicationTests {

    @Autowired
    private BookService bookService;


    @Test
    public void addBookTest(){
        //BookDTO bookDto = new BookDTO(null,"5 Point Someone", "Thriller book", "Chetan Bhagat", "123-2364-5698", 2);
        BookDTO bookDto = new BookDTO(null,"5AM Club", "Self help book", "Robin Sharma", "123-2364-3333", 5);
        String msg = bookService.addBook(bookDto);
        assertEquals("Book added successfully", msg);
    }

    @Test
    public void getAllBooksTest(){
        List<BookDTO> bookList = bookService.getAllBooks();
        bookList.forEach(System.out::println);
        assertEquals(1, bookList.size()); 
    }
}
