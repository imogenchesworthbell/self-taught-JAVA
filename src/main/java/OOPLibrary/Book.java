package OOPLibrary;

public class Book extends LibraryItem {
    String author;

    public Book(String title, int yearPublished, String author){
        super(title, yearPublished);
        this.author = author;
    }

    @Override
    public void displayInfo(){
        System.out.println("Title: " + title + " Year Published: " + getYearPublished() + " Author: " + author);
    }
}
