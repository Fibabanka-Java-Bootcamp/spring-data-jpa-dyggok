package com.hkarabakla.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Orders {

    @Id
    @GeneratedValue
    private int id;

    private LocalDate created_at;
    private double total;

    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    User user;

    @ManyToMany
    @JoinTable(
            name="order_book",
            joinColumns = @JoinColumn(name="order_id"),
            inverseJoinColumns = @JoinColumn(name="book_isbn"))
    private List<Book> books;

    public int getId() { return id; }

    public void setId(int id) { this.id = id;}

    public LocalDate getCreated_at() { return created_at;}

    public void setCreated_at(LocalDate created_at) { this.created_at = created_at;}

    public double getTotal() { return total;}

    public void setTotal(double total) {this.total = total;}

    public User getUser() { return user;}

    public void setUser(User user) { this.user = user;}

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", created_at=" + created_at +
           //     ", total=" + total +
          //      ", user=" + user +
                ", books=" + books +
                '}';
    }


}
