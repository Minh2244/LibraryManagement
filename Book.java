// ID, tên sách, tác giả
public class Book {
    private int id;
    private String title;
    private String author;

    // Constructor
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    // Các hàm Getter/Setter (để truy cập dữ liệu)
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
}