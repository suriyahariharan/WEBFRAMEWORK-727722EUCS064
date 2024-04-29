package com.example.day14ce2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14ce2.model.HariharanBook;
import com.example.day14ce2.repository.HariharanBookRepo;

@Service
public class BookService {
   @Autowired
   HariharanBookRepo bookRepo;

   public HariharanBook addBook(HariharanBook book)
   {
        return bookRepo.save(book);
   }

   public List<HariharanBook> getBooks()
   {
        return bookRepo.findAll();
   }

   public Optional<HariharanBook> getBook(int id)
   {
    return bookRepo.findById(id);
   }

   public HariharanBook updateBook(int id,HariharanBook book)
   {
        HariharanBook avail = bookRepo.findById(id).orElse(null);
        if(avail!=null)
        {
            avail.setAuthor(book.getAuthor());
            avail.setAvailableCopies(book.getAvailableCopies());
            avail.setTitle(book.getTitle());
            avail.setTotalCopies(book.getTotalCopies());
            return bookRepo.save(avail);
        }
        else 
        return null;
   }
}
