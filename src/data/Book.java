package data;
//Klasy dziedziczące również implementują interfejs serializable,
// poniewaz klasa bazowa implementuje intefejs serializable
public class Book extends Publication {
    //POLA SKLADOWE
    private String author;
    private int pages;
    private String isbn;
    private static final long serialVersionUID = -7907331751072277846L;
    // Konstruktory
    public Book(String title, String author, int year, int pages, String publisher,
                String isbn) {
        super(year, title, publisher);
        this.setAuthor(author);
        this.setPages(pages);
        this.setIsbn(isbn);
    }


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {

        StringBuilder print = new StringBuilder();
        print.append(getTitle());
        print.append("; ");
        print.append(getAuthor());
        print.append(";");
        print.append(getYear());
        print.append("; ");
        print.append(getPages());
        print.append("; ");
        print.append(getPublisher());
        print.append("; ");
        print.append(getIsbn());
        return print.toString();







    }
}