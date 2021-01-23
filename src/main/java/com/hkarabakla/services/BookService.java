package com.hkarabakla.services;

import com.hkarabakla.entities.Author;
import com.hkarabakla.entities.Book;
import com.hkarabakla.repositories.BookRepo;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class BookService {
    private final BookRepo bookRepo;

    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public void bookOperations() {
        Scanner scanner = new Scanner(System.in);
        Book b1 = new Book();
        Book b2 = new Book();
        b1.setName("java 101");
        b1.setPrice(13.99);
        b1.setIsbn(UUID.randomUUID().toString());
        b1.setCurrency("tl");

        b2.setName("java 202");
        b2.setIsbn(UUID.randomUUID().toString());
        b2.setPrice(42.25);
        b2.setCurrency("dolar");

        bookRepo.save(b1);
        bookRepo.save(b2);

        System.out.println("Enter a book name: " );
        String input = scanner.nextLine();

        while(input.isEmpty()){

        }

        System.out.println(bookRepo.findAllByNameContainingIgnoreCase(input));

    }

}
