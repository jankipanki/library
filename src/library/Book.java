package library;

public class Book {
    String title;
    String author;
    int releaseDate;
    int pages;
    String publishisher;
    String isbn;

    public Book(String title, String author, int releaseDate, int pages, String publishisher, String isbn) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.pages = pages;
        this.publishisher = publishisher;
        this.isbn = isbn;
    }

    void printInfo() {
        String info = this.title + "; " + this.author + "; " + this.releaseDate + "; " + this.pages + "; " + this.publishisher + "; " + this.isbn;
        System.out.println(info);
    }
}
