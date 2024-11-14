public class Greeter {
    public static void main(String[] args){
        System.out.println("Hello World!"); //println adds a line after printing print doesn't

        String name = "Imogen";
        int nameLength = name.length();
        System.out.print("My name is ");
        for(int i = 0; i < nameLength; i++){
            System.out.print(name.charAt(i));
        };
        System.out.print(" which is " + nameLength + " letters long.");
    }
}
