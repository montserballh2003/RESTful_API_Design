package com.Api.spring.service;



import com.Api.spring.model.BookRequest;
import com.Api.spring.model.BookResponse;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

@Service
public class BookService {

    public BookResponse createBook(BookRequest bookRequest) {
        String bookId = UUID.randomUUID().toString();
        // Create a new book using the bookRequest data
        // Save the book to a file
        saveBookToFile(bookId, bookRequest);
        // Create and return a BookResponse
        return new BookResponse(bookId, bookRequest.getTitle(), bookRequest.getAuthor());
    }

    public BookResponse getBookById(String id) {
        // Retrieve the book from the file or data source based on the id
        // Create and return a BookResponse
        return new BookResponse(id, "Book Title", "Book Author");
    }

    private void saveBookToFile(String bookId, BookRequest bookRequest) {
        try (FileWriter writer = new FileWriter("books.txt", true)) {
            writer.write(bookId + "," + bookRequest.getTitle() + "," + bookRequest.getAuthor() + "\n");
        } catch (IOException e) {
            // Handle the exception
        }
    }

    // Add other service methods as needed
}