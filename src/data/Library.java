package data;
import data.Book;
import utils.DataReader;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;

/*
Klasa Library przechowuje informacje o ksiazkach
Udostępnia ona metodę pozwalającą dodawać nowe pozycje do istniejącego zbioru za pomocą nowej metody addBook().
Maxymalną liczbę książek określamy za pomocą finalnego pola maxBooks. W polu booksNumber będziemy natomiast przechowywali rzeczywistą ilość książek w bibliotece.
Klasa ta przechowuje dane o ksiazkach, nie zawiera operacji ktore stanowia logike programu
*/
public class Library implements Serializable {

    private static final long serialVersionUID = 2995794334600947814L;

    private Map<String,Publication> publications;
    private Map<String,LibraryUser> users;

    public Library(){
        publications = new HashMap<>();
        users = new HashMap<>();
    }

    public int getPublicationsNumber(){
        return publications.size();
    }
    public Map<String,Publication> getPublications(){
        return publications;
    }
    public Map<String,LibraryUser> getUsers(){
        return users;
    }

    public void addBook(Book book){
        addPublication(book);
    }
    public void addMagazine(Magazine magazine){
        addPublication(magazine);
    }
    public void addUser(LibraryUser user){
        users.put(user.getPesel(),user);
    }
    public void removePublication(Publication pub){
        if(publications.containsValue(pub)){
            publications.remove(pub.getTitle());
        }
    }
    private void addPublication(Publication pub){
        publications.put(pub.getTitle(),pub);
    }


   // gdy bedziemy wystwietlac duze zbiory danych metoda toString bedzie intensywnie wykorzystywana
    //StringBuilder  z punktu widzenia optymalizacji  usprawni działania aplikacji
    //poniewaz zminimalizuje ilosc tworzonych obiektow  w porównaniu do sposobu wykorzystującego operator konkatenacji "+".
   public String toString(){
       StringBuilder builder = new StringBuilder();
      for(Publication p: publications.values()){
          builder.append(p);
          builder.append("\n");
       }return builder.toString();
   }

   public static class AlphabeticalComparator implements Comparator<Publication>{
       public int compare(Publication o1,Publication o2){
           if(o1==null && o2==null){
               return 0;
           }if(o1==null){
               return 1;
           }if(o2==null){
               return -1;
           }return o1.getTitle().compareTo(o2.getTitle());
       }
   }
    public static class DateComparator implements Comparator<Publication> {
        @Override
        public int compare(Publication o1, Publication o2) {
            if (o1 == null && o2 == null) {
                return 0;
            }
            if (o1 == null) {
                return 1;
            }
            if (o2 == null) {
                return -1;
            }
            Integer i1 = o1.getYear();
            Integer i2 = o2.getYear();
            return -i1.compareTo(i2);
        }
    }



    }

