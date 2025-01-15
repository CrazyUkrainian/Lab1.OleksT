package csd230.lab1.OleksandrTerekhov.repositories;

import csd230.lab1.OleksandrTerekhov.entities.CartItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CartItemEntityRepository extends JpaRepository<CartItemEntity, Long> {

    // Find items by cart ID
    List<CartItemEntity> findByCartId(Long cartId);

    // Find items with a minimum quantity
    List<CartItemEntity> findByQuantityGreaterThanEqual(int quantity);

    // Find items with a price less than or equal to a specified value
    List<CartItemEntity> findByPriceLessThanEqual(double maxPrice);

    // Custom query: Find items with a specific description containing text
    @Query("SELECT c FROM CartItemEntity c WHERE LOWER(c.description) LIKE LOWER(CONCAT('%', :description, '%'))")
    List<CartItemEntity> findByDescriptionContaining(@Param("description") String description);

    // Custom query: Find items with price between a range
    @Query("SELECT c FROM CartItemEntity c WHERE c.price BETWEEN :minPrice AND :maxPrice")
    List<CartItemEntity> findByPriceBetween(@Param("minPrice") double minPrice, @Param("maxPrice") double maxPrice);

    // Custom query: Find items by cart ID and minimum quantity
    @Query("SELECT c FROM CartItemEntity c WHERE c.cart.id = :cartId AND c.quantity >= :minQuantity")
    List<CartItemEntity> findByCartIdAndMinQuantity(@Param("cartId") Long cartId, @Param("minQuantity") int minQuantity);
}
