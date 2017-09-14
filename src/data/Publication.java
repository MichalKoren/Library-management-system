package data;

import java.io.Serializable;

public class Publication implements Serializable,Comparable<Publication> {
    private int year;
    private String title;
    private String publisher;
    private static final long serialVersionUID = 7910452641164094454L;


    protected Publication(int year,String title, String publisher){
        setYear(year);
        setTitle(title);
        setPublisher(publisher);
    }



    @Override
    public int compareTo(Publication o){
        return title.compareTo(o.getTitle());
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


}
