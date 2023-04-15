package com.example.spring_assignments.book;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    BookRepo bookRepo = new BookRepo();
    List<Book> bookList = bookRepo.getBookList();

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookList;
    }

    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable int id) {
        return bookList.stream().filter(b -> b.getId() == id).findFirst().orElse(null);
    }

    @GetMapping("/books/{fromid}/{toid}")
    public List<Book> getBookByIdRange(@PathVariable int toid, @PathVariable int fromid) {
        return bookList.stream().filter(b -> b.getId() >= fromid && b.getId() <= toid).toList();
    }

    @GetMapping("/books/{id}/delete")
    public List<Book> deleteBookById(@PathVariable int id) {
        bookList.removeIf(b -> b.getId() == id);
        return bookList;
    }

    @GetMapping("/books/addByGET")
    public List<Book> addByGET(@RequestParam int id,
                               @RequestParam String title, @RequestParam String author) {
        bookList.add(new Book(id, title, author));
        return bookList;
    }

    @PostMapping("/books/add")
    public List<Book> addBookByPOST(@RequestBody Book b) {
        bookList.add(b);
        return bookList;
    } 

    @PutMapping("/books/update")
    public List<Book> updateBook(@RequestBody Book b) {
        Book bookToUpdate = bookList.stream()
                .filter(book -> book.getId() == b.getId()).findFirst().orElse(null);
        if (bookToUpdate == null) {
            bookList.add(b);
            bookList.add(b);
        } else {
            bookToUpdate.setTitle(b.getTitle());
            bookToUpdate.setAuthor(b.getAuthor());
        }
        return bookList;
    }

}

