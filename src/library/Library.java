package library;

public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.2";

        Book book1 = new Book();

        book1.title = "W pustyni i w puszyczy";
        book1.author = "Henryk Sienkiewicz";
        book1.releaseDate = 2010;
        book1.pages = 296;
        book1.publishisher = "Greg";
        book1.isbn = "978837371890";

        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece");
        System.out.println(book1.title);
        System.out.println(book1.author);
        System.out.println(book1.releaseDate);
        System.out.println(book1.pages);
        System.out.println(book1.publishisher);
        System.out.println(book1.isbn);
        System.out.println("jeszcze jedno");
    }
}
