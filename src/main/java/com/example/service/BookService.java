package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Book;
import com.example.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    // Get all books
    public List<Book> findAll() {
        return repository.findAll();
    }

    // Get a book by ID
    public Book findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
    }

    // Create or update a book
    public Book save(Book book) {
        return repository.save(book);
    }

    // Delete a book by ID
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
