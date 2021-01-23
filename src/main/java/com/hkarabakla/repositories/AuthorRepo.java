package com.hkarabakla.repositories;

import com.hkarabakla.entities.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AuthorRepo extends CrudRepository<Author,Integer> {
    List<Author> findAllByNameContainingIgnoreCase(String name);
    List<Author> findByName(String name);
}
