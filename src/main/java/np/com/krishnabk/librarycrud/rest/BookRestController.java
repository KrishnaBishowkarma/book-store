package np.com.krishnabk.librarycrud.rest;

import np.com.krishnabk.librarycrud.dao.BookDAO;
import np.com.krishnabk.librarycrud.entity.Book;
import np.com.krishnabk.librarycrud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class BookRestController {

    private final BookService bookService;
    private BookDAO bookDAO;

    // quick and dirty: inject book dao to use constructor injection (will add service layer later)
    @Autowired
    public BookRestController(BookDAO theBookDAO, BookService bookService){
        bookDAO = theBookDAO;
        this.bookService = bookService;
    }

    // expose "/books" and return a list books
    @GetMapping("/books")
    public List<Book> findAll(){
        return bookDAO.findAll();
    }

    // expose /books/{bookId} - return a book by id
    @GetMapping("/books/{bookId}")
    public Book getBook (@PathVariable int bookId){

        Book theBook = bookService.findById(bookId);

        if (theBook == null){
            throw new RuntimeException("Book id not found - " + bookId);
        }

        return theBook;
    }
}
