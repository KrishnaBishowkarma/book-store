package np.com.krishnabk.librarycrud.dao;

import np.com.krishnabk.librarycrud.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
