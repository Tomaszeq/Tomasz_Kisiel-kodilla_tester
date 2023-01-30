public class Book {
    private String author;
    private String title;

    private Book(String author, String title) {
        this.author = author;
        this.title = title;
    }
    public static Book of(String author, String title) {
        Book book = new Book(author, title);
        book.author = "Maja Lidia Kossakowska";
        book.title = "Siewca Wiatru";
        System.out.println("Author: " + author + "Title: " + title);
        return book;
    }
    public static void main(String[] args){
    }
}