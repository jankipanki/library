package pl.javastart.library.model;

public class Book {
    private String title;
    private String author;
    private int releaseDate;
    private int pages;
    private String publishisher;
    private String isbn;

    public Book(String title, String author, int releaseDate, int pages, String publishisher, String isbn) {
        this(title, author, releaseDate, pages, publishisher);
        this.isbn = isbn;
    }

    public Book(String title, String author, int releaseDate, int pages, String publishisher) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.pages = pages;
        this.publishisher = publishisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPublishisher() {
        return publishisher;
    }

    public void setPublishisher(String publishisher) {
        this.publishisher = publishisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void printInfo() {
        String info = this.title + "; " + this.author + "; " + this.releaseDate + "; " + this.pages + "; " + this.publishisher;
        if (isbn != null) {
            info += "; " + isbn;
        }
        System.out.println(info);
    }

}
