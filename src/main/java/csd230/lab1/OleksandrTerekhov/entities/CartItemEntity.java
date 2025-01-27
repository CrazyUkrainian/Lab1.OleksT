package csd230.lab1.OleksandrTerekhov.entities;

import csd230.lab1.OleksandrTerekhov.entities.CartEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "cart_item_entity")
public class CartItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @Column(name = "order_qty", nullable = false)
    private int orderQty = 1;

    @Column(name = "copies", nullable = false)
    private int copies = 1; // Default value

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn
    private CartEntity cart;

    @PrePersist
    protected void onCreate() {
        if (copies <= 0) {
            copies = 1; // Ensure default value if not set
        }
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CartEntity getCart() {
        return cart;
    }

    public void setCart(CartEntity cart) {
        this.cart = cart;
    }
}