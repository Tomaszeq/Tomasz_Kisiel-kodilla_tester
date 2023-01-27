public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public static void main(String[] args) {
        Book book = new Book("Maja Lidia Kossakowska", "Siewca Wiatru");
    }
    public static Book of(String author, String title) {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        return book;
    }
}

