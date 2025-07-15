package np.com.krishnabk.librarycrud.service;

import np.com.krishnabk.librarycrud.dao.BookDAO;
import np.com.krishnabk.librarycrud.entity.Book;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    private BookDAO bookDAO;

    public BookServiceImpl(BookDAO theBookDAO){
        bookDAO = theBookDAO;
    }

    @Override
    public List<Book> findAll() {
        return bookDAO.findAll();
    }

    @Override
    public Book findById(int theId) {
        return bookDAO.findById(theId);
    }

    @Transactional
    @Override
    public Book save(Book theBook) {
        return bookDAO.save(theBook);
    }

    @Transactional
    @Override
    public void deleteById(int theId) {
        bookDAO.deleteById(theId);
    }
}
