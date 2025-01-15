package csd230.lab1.OleksandrTerekhov;

import csd230.lab1.OleksandrTerekhov.repositories.*;
import csd230.lab1.OleksandrTerekhov.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.github.javafaker.Faker;
import java.util.List;


@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private BookEntityRepository bookRepository;

    @Autowired
    private CartEntityRepository cartRepository;

    @Autowired
    private CartItemEntityRepository cartItemRepository;

    @Autowired
    private DiscMagEntityRepository discMagRepository;

    @Autowired
    private MagazineEntityRepository magazineRepository;

    @Autowired
    private PublicationEntityRepository publicationRepository;

    @Autowired
    private TicketEntityRepository ticketRepository;

    private final Faker faker = new Faker();

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Demonstrating CRUD operations for BookEntity
        BookEntity newBook = new BookEntity();
        newBook.setTitle(faker.book().title());
        newBook.setAuthor(faker.book().author());
        newBook.setPrice(faker.number().randomDouble(2, 10, 100));

        // Create
        newBook = bookRepository.save(newBook);
        System.out.println("Created Book: " + newBook);

        // Read
        BookEntity retrievedBook = bookRepository.findById(newBook.getId()).orElse(null);
        System.out.println("Retrieved Book: " + retrievedBook);

        // Update
        if (retrievedBook != null) {
            retrievedBook.setPrice(retrievedBook.getPrice() + 10);
            bookRepository.save(retrievedBook);
            System.out.println("Updated Book: " + retrievedBook);
        }

        // Delete
        if (retrievedBook != null) {
            bookRepository.delete(retrievedBook);
            System.out.println("Deleted Book with ID: " + retrievedBook.getId());
        }

        // Demonstrating CRUD operations for CartEntity
        CartEntity newCart = new CartEntity();
        newCart.setUserId(faker.number().randomNumber());

        // Create
        newCart = cartRepository.save(newCart);
        System.out.println("Created Cart: " + newCart);

        // Read
        CartEntity retrievedCart = cartRepository.findById(newCart.getId()).orElse(null);
        System.out.println("Retrieved Cart: " + retrievedCart);

        // Update
        if (retrievedCart != null) {
            retrievedCart.setUserId(faker.number().randomNumber());
            cartRepository.save(retrievedCart);
            System.out.println("Updated Cart: " + retrievedCart);
        }

        // Delete
        if (retrievedCart != null) {
            cartRepository.delete(retrievedCart);
            System.out.println("Deleted Cart with ID: " + retrievedCart.getId());
        }

        // Demonstrating CRUD operations for CartItemEntity
        CartItemEntity newCartItem = new CartItemEntity();
        newCartItem.setQuantity(faker.number().numberBetween(1, 10));

        // Create
        newCartItem = cartItemRepository.save(newCartItem);
        System.out.println("Created CartItem: " + newCartItem);

        // Read
        CartItemEntity retrievedCartItem = cartItemRepository.findById(newCartItem.getId()).orElse(null);
        System.out.println("Retrieved CartItem: " + retrievedCartItem);

        // Update
        if (retrievedCartItem != null) {
            retrievedCartItem.setQuantity(retrievedCartItem.getQuantity() + 1);
            cartItemRepository.save(retrievedCartItem);
            System.out.println("Updated CartItem: " + retrievedCartItem);
        }

        // Delete
        if (retrievedCartItem != null) {
            cartItemRepository.delete(retrievedCartItem);
            System.out.println("Deleted CartItem with ID: " + retrievedCartItem.getId());
        }

        // Demonstrating CRUD operations for DiscMagEntity
        DiscMagEntity newDiscMag = new DiscMagEntity();
        newDiscMag.setTitle(faker.book().title());
        newDiscMag.setPrice(faker.number().randomDouble(2, 10, 100));

        // Create
        newDiscMag = discMagRepository.save(newDiscMag);
        System.out.println("Created DiscMag: " + newDiscMag);

        // Read
        DiscMagEntity retrievedDiscMag = discMagRepository.findById(newDiscMag.getId()).orElse(null);
        System.out.println("Retrieved DiscMag: " + retrievedDiscMag);

        // Update
        if (retrievedDiscMag != null) {
            retrievedDiscMag.setPrice(retrievedDiscMag.getPrice() + 5);
            discMagRepository.save(retrievedDiscMag);
            System.out.println("Updated DiscMag: " + retrievedDiscMag);
        }

        // Delete
        if (retrievedDiscMag != null) {
            discMagRepository.delete(retrievedDiscMag);
            System.out.println("Deleted DiscMag with ID: " + retrievedDiscMag.getId());
        }

        // Demonstrating CRUD operations for MagazineEntity
        MagazineEntity newMagazine = new MagazineEntity();
        newMagazine.setTitle(faker.book().title());
        newMagazine.setPrice(faker.number().randomDouble(2, 5, 50));

        // Create
        newMagazine = magazineRepository.save(newMagazine);
        System.out.println("Created Magazine: " + newMagazine);

        // Read
        MagazineEntity retrievedMagazine = magazineRepository.findById(newMagazine.getId()).orElse(null);
        System.out.println("Retrieved Magazine: " + retrievedMagazine);

        // Update
        if (retrievedMagazine != null) {
            retrievedMagazine.setPrice(retrievedMagazine.getPrice() + 2);
            magazineRepository.save(retrievedMagazine);
            System.out.println("Updated Magazine: " + retrievedMagazine);
        }

        // Delete
        if (retrievedMagazine != null) {
            magazineRepository.delete(retrievedMagazine);
            System.out.println("Deleted Magazine with ID: " + retrievedMagazine.getId());
        }

        // Demonstrating CRUD operations for PublicationEntity
        PublicationEntity newPublication = new PublicationEntity();
        newPublication.setTitle(faker.book().title());

        newPublication.setPrice(faker.number().randomDouble(2, 15, 75));

        // Create
        newPublication = publicationRepository.save(newPublication);
        System.out.println("Created Publication: " + newPublication);

        // Read
        PublicationEntity retrievedPublication = publicationRepository.findById(newPublication.getId()).orElse(null);
        System.out.println("Retrieved Publication: " + retrievedPublication);

        // Update
        if (retrievedPublication != null) {
            retrievedPublication.setPrice(retrievedPublication.getPrice() + 10);
            publicationRepository.save(retrievedPublication);
            System.out.println("Updated Publication: " + retrievedPublication);
        }

        // Delete
        if (retrievedPublication != null) {
            publicationRepository.delete(retrievedPublication);
            System.out.println("Deleted Publication with ID: " + retrievedPublication.getId());
        }

        // Demonstrating CRUD operations for TicketEntity
        TicketEntity newTicket = new TicketEntity();
        newTicket.setPrice(faker.number().randomDouble(2, 20, 150));

        // Create
        newTicket = ticketRepository.save(newTicket);
        System.out.println("Created Ticket: " + newTicket);

        // Read
        TicketEntity retrievedTicket = ticketRepository.findById(newTicket.getId()).orElse(null);
        System.out.println("Retrieved Ticket: " + retrievedTicket);

        // Update
        if (retrievedTicket != null) {
            retrievedTicket.setPrice(retrievedTicket.getPrice() + 5);
            ticketRepository.save(retrievedTicket);
            System.out.println("Updated Ticket: " + retrievedTicket);
        }

        // Delete
        if (retrievedTicket != null) {
            ticketRepository.delete(retrievedTicket);
            System.out.println("Deleted Ticket with ID: " + retrievedTicket.getId());
        }
    }
}

