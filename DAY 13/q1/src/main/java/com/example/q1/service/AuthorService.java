package com.example.q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.HariharanAuthor;
import com.example.q1.repository.HariharanAuthorRepository;

@Service
public class AuthorService {
    @Autowired
    private HariharanAuthorRepository authorRepository;

    public HariharanAuthor saveAuthor(HariharanAuthor author) {
        return authorRepository.save(author);
    }

    public HariharanAuthor getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public List<HariharanAuthor> getAllAuthors() {
        return authorRepository.findAll();
    }

    public HariharanAuthor updateAuthor(Long id, HariharanAuthor author) {
        HariharanAuthor existingAuthor = authorRepository.findById(id).orElse(null);
        if (existingAuthor != null) {
            existingAuthor.setEmail(author.getEmail());
            existingAuthor.setPhoneNumber(author.getPhoneNumber());
            existingAuthor.setAddress(author.getAddress());
            return authorRepository.save(existingAuthor);
        }
        return null;
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
