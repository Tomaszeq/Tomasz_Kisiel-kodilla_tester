public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public static void main(String[] args) {
    }
    public static Book of(String author, String title) {
        Book book = new Book("Maja Lidia Kossakowska", "Siewca Wiatru");
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        return book;
    }
}

