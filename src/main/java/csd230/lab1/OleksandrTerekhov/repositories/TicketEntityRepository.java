package csd230.lab1.OleksandrTerekhov.repositories;

import csd230.lab1.OleksandrTerekhov.entities.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketEntityRepository extends JpaRepository<TicketEntity, Long> {

    // Find ticket by ID
    TicketEntity findById(long id);

    // Find tickets by event name (partial match)
    List<TicketEntity> findByEventNameContainingIgnoreCase(String eventName);

    // Find tickets within a specific price range
    List<TicketEntity> findByPriceBetween(double minPrice, double maxPrice);

    // Find tickets by event date
    List<TicketEntity> findByEventDate(java.time.LocalDate eventDate);
}
