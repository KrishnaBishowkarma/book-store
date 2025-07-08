package np.com.krishnabk.librarycrud.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "book")
public class Book {

    // define fields

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String bookTitle;

    @Column(name = "author")
    private String authorName;

    @Column(name = "isbn")
    private String ISBN;

    @Column(name = "publish_date")
    private LocalDateTime publishDate;

    // define constructors

    public Book(){
    }

    public Book(String bookTitle, String authorName, String ISBN, LocalDateTime publishDate) {
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.ISBN = ISBN;
        this.publishDate = publishDate;
    }

    // define getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public LocalDateTime getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDateTime publishDate) {
        this.publishDate = publishDate;
    }


    // define toString method

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookTitle='" + bookTitle + '\'' +
                ", authorName='" + authorName + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", publishDate=" + publishDate +
                '}';
    }
}
