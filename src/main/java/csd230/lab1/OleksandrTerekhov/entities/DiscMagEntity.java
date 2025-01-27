package csd230.lab1.OleksandrTerekhov.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity
public class DiscMagEntity extends MagazineEntity {
    @Column(name = "has_disc", nullable = true)
    private boolean hasDisc;

    @Column(name = "order_qty", nullable = true)
    private int orderQty;

    @Column(name = "curr_issue")
    private Date currIssue;

    @Column(name = "title")
    private String title;

    @Column(name = "copies", nullable = false)
    private int copies;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn
    private CartEntity cart;

    public boolean getHasDisc() {
        return hasDisc;
    }

    public void setHasDisc(boolean hasDisc) {
        this.hasDisc = hasDisc;
    }
}