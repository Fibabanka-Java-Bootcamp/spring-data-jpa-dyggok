package com.hkarabakla.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Book {

    @Id
    private String isbn;

    private String name;
    private String description;
    private LocalDate publishedDate;
    private LocalDate addedDate;
    private double price;
    private String currency;
    private String imageUrl;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

    @ManyToMany(mappedBy = "books",fetch = FetchType.EAGER,cascade = CascadeType.REMOVE)
    private List<Orders> orders;

    @ManyToMany(mappedBy = "books")
    private List<Author> authors;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Orders> getOrders() { return orders; }

    public void setOrders(List<Orders> orders) { this.orders = orders; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public LocalDate getPublishedDate() { return publishedDate; }

    public void setPublishedDate(LocalDate publishedDate) { this.publishedDate = publishedDate;}

    public LocalDate getAddedDate() { return addedDate; }

    public void setAddedDate(LocalDate addedDate) { this.addedDate = addedDate; }

    public double getPrice() {return price; }

    public void setPrice(double price) {this.price = price;}

    public String getCurrency() { return currency; }

    public void setCurrency(String currency) {this.currency = currency; }

    public String getImageUrl() { return imageUrl;}

    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl;}

    public List<Author> getAuthors() { return authors; }

    public void setAuthors(List<Author> authors) { this.authors = authors; }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", publishedDate=" + publishedDate +
                ", addedDate=" + addedDate +
                ", price=" + price +
                ", currency='" + currency + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", category=" + category +
            //    ", orders=" + orders +
                '}';
    }
}
