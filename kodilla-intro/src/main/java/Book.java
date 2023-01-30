public class Book {
    private String author;
    private String title;

    private Book(String author, String title) {
        this.author = author;
        this.title = title;
    }
    public static Book of(String author, String title) {
        Book book = Book.of(author, title);
        System.out.println("Author: " + author + "Title: " + title);
        return book;
    }
}