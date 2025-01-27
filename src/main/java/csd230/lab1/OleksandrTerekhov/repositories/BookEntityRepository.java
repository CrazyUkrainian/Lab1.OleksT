package csd230.lab1.OleksandrTerekhov.repositories;

import csd230.lab1.OleksandrTerekhov.entities.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookEntityRepository extends JpaRepository<BookEntity, Long> {

  // Find books by ISBN
//  List<BookEntity> findByIsbn(String isbn);

  // Find a book by its ID
//  BookEntity findById(long id);
//
//  // Find books with an exact title
//  List<BookEntity> findByTitle(String title);
//
//  // Find books containing text in their title
//  List<BookEntity> findByTitleContainingIgnoreCase(String text);
//
//  // Find books where the title starts with a specific text
//  List<BookEntity> findByTitleStartingWith(String prefix);
//
//  // Custom query: Find books within a price range
//  @Query("SELECT b FROM BookEntity b WHERE b.price BETWEEN :minPrice AND :maxPrice")
//  List<BookEntity> findBooksInPriceRange(@Param("minPrice") double minPrice, @Param("maxPrice") double maxPrice);
//
//  // Find books by author's name
//  List<BookEntity> findByAuthorNameContainingIgnoreCase(String name);
}
