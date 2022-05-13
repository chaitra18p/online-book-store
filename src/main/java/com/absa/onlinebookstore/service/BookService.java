package com.absa.onlinebookstore.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.absa.onlinebookstore.dto.BookDTO;
import com.absa.onlinebookstore.entity.Book;
import com.absa.onlinebookstore.repository.BookRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private BookRepository bookRepository;

    public String addBook(final BookDTO bookDto){
        if(bookDto.getId() != null){
            Optional<Book> book = bookRepository.findById(bookDto.getId());
            if(book.isPresent()){
                return "Book already present";
            }
        }
        Book book = modelMapper.map(bookDto, Book.class);
        bookRepository.save(book);
        return "Book added successfully";
    }

    public List<BookDTO> getAllBooks(){
        List<Book> bookList = bookRepository.findAll();
        return bookList.stream().map(book-> modelMapper.map(book, BookDTO.class))
                        .collect(Collectors.toList());

    }
}
