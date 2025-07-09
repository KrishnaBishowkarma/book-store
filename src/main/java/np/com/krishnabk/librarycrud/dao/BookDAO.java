package np.com.krishnabk.librarycrud.dao;

import np.com.krishnabk.librarycrud.entity.Book;

import java.util.List;

public interface BookDAO {
    List<Book> findAll();
}
