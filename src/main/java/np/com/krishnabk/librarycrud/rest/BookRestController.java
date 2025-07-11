package np.com.krishnabk.librarycrud.rest;

import np.com.krishnabk.librarycrud.dao.BookDAO;
import np.com.krishnabk.librarycrud.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class BookRestController {

    private BookDAO bookDAO;

    // quick and dirty: inject book dao to use constructor injection (will add service layer later)
    @Autowired
    public BookRestController(BookDAO theBookDAO){
        bookDAO = theBookDAO;
    }

    // expose "/books" and return a list books
    @GetMapping("/books")
    public List<Book> findAll(){
        return bookDAO.findAll();
    }
}
