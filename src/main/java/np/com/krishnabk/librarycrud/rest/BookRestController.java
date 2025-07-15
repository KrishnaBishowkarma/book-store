package np.com.krishnabk.librarycrud.rest;

import np.com.krishnabk.librarycrud.dao.BookDAO;
import np.com.krishnabk.librarycrud.entity.Book;
import np.com.krishnabk.librarycrud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class BookRestController {

    private final BookService bookService;
    private BookDAO bookDAO;

    @Autowired
    public BookRestController(BookDAO theBookDAO, BookService theBookService){
        bookDAO = theBookDAO;
        bookService = theBookService;
    }

    // expose "/books" and return a list books
    @GetMapping("/books")
    public List<Book> findAll(){
        return bookService.findAll();
    }

    // expose /books/{bookId} - return a book by id
    @GetMapping("/books/{bookId}")
    public Book getBook (@PathVariable int bookId){

        Book theBook = bookService.findById(bookId);

        if (theBook == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Book id not found - " + bookId);
        }

        return theBook;
    }

    // add mapping for POST /books - add new book
    @PostMapping("/books")
    public Book addBook(@RequestBody Book theBook){
        // also just in case they pass an id in JSON ... set id to 0
        // this is to force a save of new item ... instead of update

        theBook.setId(0);

        Book dbBook = bookService.save(theBook);

        return dbBook;
    }

    // add mapping for DELETE /books/{bookId} - delete book by id
    @DeleteMapping("/books/{bookId}")
    public String deleteBook (@PathVariable int bookId){

        Book theBook = bookService.findById(bookId);

        if (theBook == null) {
            throw new RuntimeException("Book id not found - " + bookId);
        }

        bookService.deleteById(bookId);

        return "Deleted book id - " + bookId;
    }
}
