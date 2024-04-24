import java.util.Arrays;
import java.util.List;

public class Library {
    Book[] books = new Book[10];

    public Library(List<Book> books) {
        this.books = books.toArray(new Book[0]);
    }
    public Book[] getBooks() {
        return books;
    }
    public void setBooks(Book[] books) {
        this.books = books;
    }
    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
