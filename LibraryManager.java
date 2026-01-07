import java.util.ArrayList;

// Class quản lý thư viện
public class LibraryManager {

    // Danh sách các sách trong thư viện
    private ArrayList<Book> books;

    // Constructor
    public LibraryManager() {
        books = new ArrayList<>();
    }

    // Hàm thêm sách vào danh sách
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Đã thêm sách: " + book.getTitle());
    }
}
