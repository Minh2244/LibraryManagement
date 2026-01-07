import java.util.ArrayList;

public class LibraryManager {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        for (Book b : books) {
            System.out.println(
                b.getId() + " - " + b.getTitle() + " - " + b.getAuthor()
            );
        }
    }
}
