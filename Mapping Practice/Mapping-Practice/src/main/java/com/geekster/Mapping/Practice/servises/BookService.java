package com.geekster.Mapping.Practice.servises;

import com.geekster.Mapping.Practice.models.Book;
import com.geekster.Mapping.Practice.models.Student;
import com.geekster.Mapping.Practice.repositories.IBookRepo;
import com.geekster.Mapping.Practice.repositories.IStudentRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private IBookRepo iBookRepo;
    @Autowired
    private IStudentRepo studentRepo;

    public String addBook(Book book) {
        Integer studentId = book.getStudent().getStudentId();
        Student studentObject = studentRepo.findById(studentId).get();
        book.setStudent(studentObject);
        iBookRepo.save(book);
        return "Book Added successfully!!";
    }

    public List<Book> getAllBook() {
        return iBookRepo.findAll();
    }
    @Transactional
    public String updateBook(Book book) {
        iBookRepo.updateBook(book.getBookId(),book.getBookTitle(),book.getBookAuthor(),book.getBookDescription(),book.getBookPrice());
        return "Book updated successfully!!";
    }

    public String deleteBook(Integer bookId) {
        iBookRepo.deleteById(bookId);
        return "id "+bookId+" Book deleted successfully!!";
    }
}
