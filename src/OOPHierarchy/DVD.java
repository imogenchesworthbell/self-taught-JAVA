package OOPHierarchy;

public class DVD extends LibraryItem{
    String director;

    public DVD(String title, int yearPublished, String director){
        super(title, yearPublished);
        this.director = director;
    }

    @Override
    public void displayInfo(){
        System.out.println("Title: " + title + " Year Published: " + getYearPublished() + " Director: " + director);
    }
}
