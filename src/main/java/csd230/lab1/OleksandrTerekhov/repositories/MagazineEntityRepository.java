package csd230.lab1.OleksandrTerekhov.repositories;

import csd230.lab1.OleksandrTerekhov.entities.MagazineEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface MagazineEntityRepository extends JpaRepository<MagazineEntity, Long> {

    // Find magazines by title (exact match)
    List<MagazineEntity> findByTitle(String title);

    // Find magazines with title containing specific text (case-insensitive)
    List<MagazineEntity> findByTitleContainingIgnoreCase(String text);

    // Find magazines by ID
    MagazineEntity findById(long id);

    // Find magazines published in a specific year (custom query)
    @Query("SELECT m FROM MagazineEntity m WHERE YEAR(m.currIssue) = :year")
    List<MagazineEntity> findByPublicationYear(@Param("year") int year);

    // Find magazines with a minimum order quantity
    List<MagazineEntity> findByOrderQtyGreaterThanEqual(int minOrderQty);

    // Custom query: Find magazines by issue date range
    @Query("SELECT m FROM MagazineEntity m WHERE m.currIssue BETWEEN :startDate AND :endDate")
    List<MagazineEntity> findByIssueDateRange(@Param("startDate") Date startDate, @Param("endDate") Date endDate);
}
