public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // An example of using another file, MathUtils.java, and importing a math method from there...
        int likes = 200;
        int dislikes = 100;

        double total = MathUtils.ratio(likes, dislikes);
        System.out.println(total);

        int x = 34;
        double randomNum = MathUtils.random(x);
        System.out.print("A random number between 0 and " + x + " is: " + randomNum);
    }
}