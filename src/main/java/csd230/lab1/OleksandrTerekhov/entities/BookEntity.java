package csd230.lab1.OleksandrTerekhov.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class BookEntity extends PublicationEntity {
    @Column(name = "author")
    private String author;

    @Column(name = "isbn")
    private String ISBN;

    @ManyToOne
    @JoinColumn
    private CartEntity cart;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }


}