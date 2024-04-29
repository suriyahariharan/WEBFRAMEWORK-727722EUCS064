package com.example.q1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.HariharanAuthor;
import com.example.q1.model.HariharanBook;
import com.example.q1.repository.HariharanAuthorRepository;
import com.example.q1.repository.BookRepository;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
@Autowired
private HariharanAuthorRepository authorRepository;
    public HariharanBook saveBook(Long authorId, HariharanBook book) {
        HariharanAuthor author = authorRepository.findById(authorId).orElse(null);
        if (author != null) {
            book.setAuthor(author);
            author.getBooks().add(book);
            return bookRepository.save(book);
        }
        return null;
    }

    public HariharanBook getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

