import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Library library;
    private Book book;
    private Borrower borrower;

    @Before
    public void setup() {
        library = new Library();
        book = new Book();
        borrower = new Borrower();
        library.addBook(book);
    }
    @Test
    public void canShowNumberOfBorrowedBooks() {
        assertEquals(0, borrower.numberOfBorrowedBooks());
    }

    @Test
    public void canBorrowBook() {
        borrower.borrowBook(library);
        assertEquals(0,library.getNumberOfBooks());
        assertEquals(1,borrower.numberOfBorrowedBooks());
    }
}
