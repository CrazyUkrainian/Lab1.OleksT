package csd230.lab1.OleksandrTerekhov.repositories;

import csd230.lab1.OleksandrTerekhov.entities.PublicationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PublicationEntityRepository extends JpaRepository<PublicationEntity, Long> {
//
//    // Find a publication by ID
//    PublicationEntity findById(long id);
//
//    // Find publications by exact title
//    List<PublicationEntity> findByTitle(String title);
//
//    // Find publications with a title containing specific text (case-insensitive)
//    List<PublicationEntity> findByTitleContainingIgnoreCase(String text);
//
//    // Find publications by quantity greater than or equal to a specified value
//    List<PublicationEntity> findByQuantityGreaterThanEqual(int quantity);
//
//    // Find publications by price within a specific range
//    List<PublicationEntity> findByPriceBetween(double minPrice, double maxPrice);
//
//    // Custom query: Find publications with a minimum number of copies
//    @Query("SELECT p FROM PublicationEntity p WHERE p.copies >= :minCopies")
//    List<PublicationEntity> findPublicationsWithMinCopies(@Param("minCopies") int minCopies);
//
//    // Custom query: Find publications with a description containing specific text
//    @Query("SELECT p FROM PublicationEntity p WHERE LOWER(p.description) LIKE LOWER(CONCAT('%', :description, '%'))")
//    List<PublicationEntity> findByDescriptionContaining(@Param("description") String description);
//
//    // Find publications associated with a specific cart
//    List<PublicationEntity> findByCartId(Long cartId);
//
//    // Find publications with a specific title and price range
//    List<PublicationEntity> findByTitleAndPriceBetween(String title, double minPrice, double maxPrice);
}
