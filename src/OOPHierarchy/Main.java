package OOPHierarchy;

public class Main {
    public static void main(String[] args) {
        Book newBook = new Book ("Matilda", 1988, "Roald Dahl");
        DVD newDVD = new DVD ("Interstellar", 2014, "Christopher Nolan");
        newBook.displayInfo();
        newDVD.displayInfo();
    }

}
