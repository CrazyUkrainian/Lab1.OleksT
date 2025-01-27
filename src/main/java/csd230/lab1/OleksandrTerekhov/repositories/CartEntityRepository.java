package csd230.lab1.OleksandrTerekhov.repositories;

import csd230.lab1.OleksandrTerekhov.entities.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartEntityRepository extends JpaRepository<CartEntity, Long> {

//    // Find a cart by ID
//    CartEntity findById(long id);
//
//    // Find carts belonging to a specific user
//    List<CartEntity> findByUserId(long userId);
//
//    // Find carts by their status (e.g., "Pending", "Completed")
//    List<CartEntity> findByStatus(String status);
//
//    // Find carts created after a specific date
//    List<CartEntity> findByCreatedDateAfter(java.time.LocalDate date);
}
