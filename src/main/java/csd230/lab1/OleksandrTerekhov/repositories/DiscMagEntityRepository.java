package csd230.lab1.OleksandrTerekhov.repositories;

import csd230.lab1.OleksandrTerekhov.entities.DiscMagEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DiscMagEntityRepository extends JpaRepository<DiscMagEntity, Long> {

    // Find by ID
    DiscMagEntity findById(long id);

    // Find magazines containing specific text in their title
    List<DiscMagEntity> findByTitleContainingIgnoreCase(String text);

    // Find magazines by publisher
    List<DiscMagEntity> findByPublisher(String publisher);
}
