package pl.javastart.library.model;

public class Library {
    private static final int MAX_PUBLICATIONS = 2000;
    private int publicationsNumber = 0;
    private Publication[] publications = new Publication[MAX_PUBLICATIONS];

    public void addBook(Book book) {
        if (publicationsNumber < MAX_PUBLICATIONS) {
            publications[publicationsNumber] = book;
            publicationsNumber++;
        } else {
            System.out.println("Maxymalna liczba książek została osiagnięta");
        }
    }

    public void printBooks() {
        int countBooks = 0;
        for (int i = 0; i < publicationsNumber; i++) {
            if (publications[i] instanceof Book) {
                System.out.println(publications[i]);
                countBooks++;
            }
        }
        if (countBooks == 0) {
            System.out.println("Brak książek w bibliotece");
        }
    }

    public void addMagazines(Magazine magazine) {
        if (publicationsNumber < MAX_PUBLICATIONS) {
            publications[publicationsNumber] = magazine;
            publicationsNumber++;
        } else {
            System.out.println("Maxymalna liczba magazynów została osiagnięta");
        }
    }

    public void printMagazine() {
        int countMagazine = 0;
        for (int i = 0; i < publicationsNumber; i++) {
            if (publications[publicationsNumber] instanceof Magazine) {
                System.out.println(publications[i]);
                publicationsNumber++;
            }
        }
        if (countMagazine == 0) {
            System.out.println("Brak magazynów w bibliotece");
        }
    }
}
