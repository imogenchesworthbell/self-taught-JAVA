package OOPLibrary;

public class LibraryItem {
    String title;
    int yearPublished;

    public LibraryItem(String title, int yearPublished){
        this.title = title;
        this.yearPublished = yearPublished;
    }

    public int getYearPublished(){
        return yearPublished;
    }

    public void setYearPublished(int yearPublished){
        this.yearPublished =  yearPublished;
    }

    public void displayInfo(){
        System.out.println("Title: " + title + " Year Published: " + getYearPublished());
    }

}
