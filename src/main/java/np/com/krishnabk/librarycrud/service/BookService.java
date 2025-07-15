package np.com.krishnabk.librarycrud.service;

import np.com.krishnabk.librarycrud.entity.Book;

import java.util.List;

public interface BookService {

    List<Book> findAll();

    Book findById(int theId);

    Book save(Book theBook);

    void deleteById(int theId);
}
