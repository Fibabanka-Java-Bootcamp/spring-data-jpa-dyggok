package com.hkarabakla.services;

import com.hkarabakla.entities.*;
import com.hkarabakla.repositories.BookRepo;
import com.hkarabakla.repositories.UserRepo;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.*;

@Component
public class UserService {

    private final UserRepo repo;
    private final BookRepo bookRepo;

    public UserService(UserRepo repo, BookRepo bookRepo) {
        this.repo = repo;
        this.bookRepo = bookRepo;
    }

    public void userOperations() {

        User u = new User();
        u.setName("user");


        Address address = new Address();
        address.setStreet("Gazi sokak");
        address.setNumber("7");
        address.setCity("Istanbul");

        Orders o1 = new Orders();
        o1.setCreated_at(LocalDate.of(2020,11,20));
        o1.setBooks(bookRepo.findAllByNameContainingIgnoreCase("java 101"));
        Orders o2 = new Orders();
        o2.setCreated_at(LocalDate.of(2021,11,20));
        o2.setBooks(bookRepo.findAllByNameContainingIgnoreCase("java 202"));


        List<Orders> orders = new ArrayList<>();
        orders.add(o1);
        orders.add(o2);

        u.setAddress(address);
        u.setOrders(orders);

        repo.save(u);

        System.out.println(u.getId());

        System.out.println(u);
    }
}
