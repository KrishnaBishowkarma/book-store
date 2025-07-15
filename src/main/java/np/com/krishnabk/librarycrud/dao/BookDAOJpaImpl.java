package np.com.krishnabk.librarycrud.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import np.com.krishnabk.librarycrud.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDAOJpaImpl implements BookDAO {

    // define fields for entity manager
    private EntityManager entityManager;

    // setup constructor injection
    @Autowired
    public BookDAOJpaImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }

    @Override
    public List<Book> findAll() {

        // create query
        TypedQuery<Book> theQuery = entityManager.createQuery("from Book", Book.class);

        // execute query and get result list
        List<Book> bookList = theQuery.getResultList();

        // return the results
        return bookList;
    }

    @Override
    public Book findById(int theId) {

        // get book
        Book theBook = entityManager.find(Book.class, theId);

        // return use with id
        return theBook;
    }

    @Override
    public Book save(Book theBook) {

        // save book
        Book dbBook = entityManager.merge(theBook);

        // return book
        return dbBook;
    }

    @Override
    public void deleteById(int theId) {

        // get the book
        Book theBook = entityManager.find(Book.class, theId);

        // delete the book
        entityManager.remove(theBook);
    }
}
