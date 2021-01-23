package com.hkarabakla.services;

import com.hkarabakla.entities.Author;
import com.hkarabakla.entities.Book;
import com.hkarabakla.repositories.AuthorRepo;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Component
public class AuthorService {
    private final AuthorRepo authorRepo;

    public AuthorService(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }

    public void authorOperations(){
        Author author = new Author();
        author.setName("Kemal Tahir");

        Book book = new Book();
        book.setName("İnce Memed1");
        book.setAddedDate(LocalDate.of(2010,2,21));
        book.setIsbn(UUID.randomUUID().toString());
        book.setPrice(24.99);
        book.setPublishedDate(LocalDate.of(1930,3,12));

        Book book2 = new Book();
        book2.setName("İnce Memed2");
        book2.setAddedDate(LocalDate.of(2010,3,21));
        book2.setIsbn(UUID.randomUUID().toString());
        book2.setPrice(24.99);
        book2.setPublishedDate(LocalDate.of(1931,3,12));

        List<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book2);

        author.setBooks(books);

        authorRepo.save(author);

        System.out.println(authorRepo.findByName("Kemal Tahir"));
    }

}
