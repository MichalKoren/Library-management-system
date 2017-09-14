package utils;

import java.util.Scanner;
import data.Book;
import data.LibraryUser;
import data.Magazine;
import java.util.InputMismatchException;
public class DataReader {
    private Scanner sc;

    public DataReader() {
        sc = new Scanner(System.in);
    }

    public void close() {
        sc.close();
    }

    public int getInt() throws NumberFormatException {
        int number = 0;
        try {
            number = sc.nextInt();
        } catch (InputMismatchException e) {
            throw new NumberFormatException("Liczba wprowadzona w niepoprawnym formacie");
        } finally {
            sc.nextLine();
        } return number;
    }


    public Book readAndCreateBook() throws InputMismatchException {
        System.out.println("Tytuł: ");
        String title = sc.nextLine();
        System.out.println("Autor: ");
        String author = sc.nextLine();
        System.out.println("Wydawnictwo: ");
        String publisher = sc.nextLine();
        System.out.println("ISBN: ");
        String isbn = sc.nextLine();
        System.out.println("Rok wydania: ");
        int releaseDate = 0;
        int pages = 0;
        try {
            releaseDate = sc.nextInt();
            sc.nextLine();
            System.out.println("Ilość Stron: ");
            pages = sc.nextInt();
            sc.nextLine();
        } catch (InputMismatchException e) {
            sc.nextLine();
            throw e;
        }
        System.out.println("Ksiażka została dodana.");
        return new Book(title, author, releaseDate, pages, publisher, isbn);
    }
    public Magazine readAndCreateMagazine() {
        System.out.println("Tytuł: ");
        String title = sc.nextLine();
        System.out.println("Wydawnictwo: ");
        String publisher = sc.nextLine();
        System.out.println("Język: ");
        String language = sc.nextLine();
        int year = 0;
        int month = 0;
        int day = 0;
        System.out.println("Rok wydania: ");
        try {
            year = sc.nextInt();
            sc.nextLine();
            System.out.println("Miesiąc: ");
            month = sc.nextInt();
            sc.nextLine();
            System.out.println("Dzień: ");
            day = sc.nextInt();
            sc.nextLine();
        } catch (InputMismatchException e) {
            sc.nextLine();
            throw e;
        }
        System.out.println("Magazyn został dodany.");
        return new Magazine(title, publisher, language, year, month, day);
    }
    public LibraryUser readAndCreateLibraryUser(){
        System.out.println("Imie: ");
        String firstName = sc.nextLine();
        System.out.println("Nazwisko: ");
        String lastName = sc.nextLine();
        System.out.println("PESEL: ");
        String pesel = sc.nextLine();
        System.out.println("Użytkownik został dodany.");
        return new LibraryUser(firstName, lastName, pesel);
    }
}