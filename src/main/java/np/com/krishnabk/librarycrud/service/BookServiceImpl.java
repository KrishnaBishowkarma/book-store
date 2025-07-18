package np.com.krishnabk.librarycrud.service;

import np.com.krishnabk.librarycrud.dao.BookRepository;
import np.com.krishnabk.librarycrud.entity.Book;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository theBookRepository){
        bookRepository = theBookRepository;
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findById(int theId) {
        Optional<Book> result = bookRepository.findById(theId);

        Book theBook = null;

        if (result.isPresent()) {
            theBook = result.get();
        } else {
            // we didn't find the book
            throw new RuntimeException("Did not find book id - " + theId);
        }

        return theBook;
    }

    @Override
    public Book save(Book theBook) {
        return bookRepository.save(theBook);
    }

    @Override
    public void deleteById(int theId) {
        bookRepository.deleteById(theId);
    }
}
