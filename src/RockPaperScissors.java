public class RockPaperScissors {

    public static void randomChoice() {
        double choice = MathUtils.random(2);

        if (choice == 0) {
            System.out.println("Rock");
        } else if (choice == 1) {
            System.out.println("Paper");
        } else {
            System.out.println("Scissors");
        }
    }

    public static void main(String[] args){
        randomChoice();
    }
}