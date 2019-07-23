import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private int capacity;

    public Library() {
        this.books = new ArrayList<Book>();
        this.capacity = 5;
    }

    public int getNumberOfBooks() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if (availableCapacity()) {
            this.books.add(book);
        }
    }

    public Book loanBook() {
        return this.books.remove(0);
    }

    public boolean availableCapacity() {
        if (getNumberOfBooks() < this.capacity) {
            return true;
        }
        return false;
    }
}
