package library;

public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.3";

        System.out.println("Książki dostępne w bibliotece");
        Book book1 = new Book("W pustyni i w puszczy","Henryk Siekiewicz", 2010,296,"Gref", "978837371890");
        Book book2 = new Book("Java. Efektywne programowanie. Wydanie II", "Joshua Bloch", 2009, 352, "Helion","9788324620845");
        Book book3 = new Book("SCJP Sun Certified Programmer for Java 6 Study Guide", "Bert Bates, Katherine Sierra",2008, 851, "McGraw-Hill Osborne Media", "9780071591065");
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();

        /*book1.title = "W pustyni i w puszyczy";
        book1.author = "Henryk Sienkiewicz";
        book1.releaseDate = 2010;
        book1.pages = 296;
        book1.publishisher = "Greg";
        book1.isbn = "978837371890";

        System.out.println(appName);
        System.out.println(book1.title);
        System.out.println(book1.author);
        System.out.println(book1.releaseDate);
        System.out.println(book1.pages);
        System.out.println(book1.publishisher);
        System.out.println(book1.isbn);*/
    }
}
