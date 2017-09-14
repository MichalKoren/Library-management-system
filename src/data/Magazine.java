package data;

//Klasy dziedziczące również implementują interfejs serializable,
// poniewaz klasa bazowa implementuje intefejs serializable
public class Magazine extends Publication {
    private int month;
    private int day;
    private String language;
    private static final long serialVersionUID = 2061400934707882805L;

    public Magazine(String title,String publisher,
                    String language, int year,int month,int day){
        super(year,title, publisher);
        setLanguage(language);
        setMonth(month);
        setDay(day);
    }


    public int getMonth(){
        return month;
    }
    public void setMonth(int month){
        this.month=month;
    }
    public int getDay(){
        return day;
    }
    public void setDay(int day){
        this.day=day;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        StringBuilder print = new StringBuilder();
        print.append(getTitle());
        print.append("; ");
        print.append(getPublisher());
        print.append("; ");
        print.append(getYear());
        print.append(";");
        print.append(getMonth());
        print.append("; ");
        print.append(getDay());
        print.append("; ");
        print.append(getLanguage());
        return print.toString();
    }

}
