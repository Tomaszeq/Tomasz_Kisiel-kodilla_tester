public class Book {
    private String author;
    private String title;

    private Book(String author, String title) {
        this.author = author;
        this.title = title;
    }
    public static Book of(String author, String title) {
        Book book = Book.of("Maja Lidia Kossakowska", "Siewca Wiatru");
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        return book;
    }
}

