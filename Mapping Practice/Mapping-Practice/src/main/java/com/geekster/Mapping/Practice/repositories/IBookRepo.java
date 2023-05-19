package com.geekster.Mapping.Practice.repositories;

import com.geekster.Mapping.Practice.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepo extends JpaRepository<Book , Integer> {
    @Modifying
    @Query(value = "update book set book_Title = :bookTitle , book_Author = :bookAuthor , book_Description = :bookDescription , book_Price = :bookPrice where book_Id = :bookId" , nativeQuery = true)
    void updateBook(Integer bookId, String bookTitle, String bookAuthor, String bookDescription, String bookPrice);
}
