import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book;

    @Before
    public void setup() {
        library = new Library();
        book = new Book();
    }
    @Test
    public void canGetNumberOfBooks() {
        assertEquals(0, library.getNumberOfBooks());
    }
    @Test
    public void successAddBookToLibrary() {
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.getNumberOfBooks());
    }
    @Test
    public void failAddBookToLibrary() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(5, library.getNumberOfBooks());
        library.addBook(book);
        assertEquals(5, library.getNumberOfBooks());
    }
    @Test
    public void canConfirmStillAvailableCapacity() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(true, library.availableCapacity());
    }
    @Test
    public void canConfirmNoAvailableCapacity() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(false, library.availableCapacity());
    }

    @Test
    public void canLoanOutBook() {
        library.addBook(book);
        library.addBook(book);
        library.loanBook();
        assertEquals(1, library.getNumberOfBooks());
    }
}