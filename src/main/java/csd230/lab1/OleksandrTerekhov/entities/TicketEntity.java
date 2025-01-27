package csd230.lab1.OleksandrTerekhov.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class TicketEntity extends CartItemEntity {
    @Column(name = "text")
    private String text;



    @ManyToOne
    @JoinColumn
    private CartEntity cart;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public CartEntity getCart() {
        return cart;
    }

    public void setCart(CartEntity cart) {
        this.cart = cart;
    }

}