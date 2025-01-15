package csd230.lab1.OleksandrTerekhov.pojos;

import csd230.lab1.OleksandrTerekhov.entities.TicketEntity;

import java.util.Objects;

/**
 * DTO for {@link TicketEntity}
 */
public class Ticket extends CartItem {
    private String text;

    public Ticket() {
        super();
    }

    public Ticket(double price, int quantity, String description, Cart cart, String text) {
        super(price, quantity, description, cart);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void sellItem() {
        System.out.println("Selling Ticket: " + getDescription());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ticket ticket)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getText(), ticket.getText());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getText());
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "text='" + text + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", description='" + getDescription() + '\'' +
                ", cart=" + getCart() +
                '}';
    }
}
