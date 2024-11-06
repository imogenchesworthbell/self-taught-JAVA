public class RockPaperScissors {

    public static String randomChoice() {
        int choice = MathUtils.random(2);

        if (choice == 0) {
            return "Rock";
        } else if (choice == 1) {
            return "Paper";
        } else {
            return "Scissors";
        }
    }

    public static void winner(){
        String player1 = randomChoice();
        String player2 = randomChoice();

        System.out.println("Player 1 chose: " + player1 );
        System.out.println("Player 2 chose: " + player2 );

        if ( player1.equals(player2)){
            System.out.println("It's a tie");
        } else if ((player1.equals("Rock") && player2.equals("Scissors")) || (player1.equals("Paper") && player2.equals("Rock")) || (player1.equals("Scissors") && player2.equals("Paper"))) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
    }
    }

    public static void main(String[] args){
        winner();
    }
}