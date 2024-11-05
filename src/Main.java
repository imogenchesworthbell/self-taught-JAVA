public class Main {
    public static void main(String[] args) {
        System.out.print("Hello World!"); //println adds a line after printing print doesn't

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        String name = "Imogen";
        int nameLength = name.length();

        for(int i = 0; i < nameLength; i++){
            System.out.print(name.charAt(i));
        };

        System.out.println(" there are " + nameLength +" letters. ");

        // An example of using another file, MathUtils.java, and importing a math method from there...
        int likes = 200;
        int dislikes = 24;

        double total = MathUtils.ratio(likes, dislikes);
        System.out.println(total);

        int x = 34;
        double randomNum = MathUtils.random(x);
        System.out.print("A random number between 0 and " + x + " is: " + randomNum);
    }
}