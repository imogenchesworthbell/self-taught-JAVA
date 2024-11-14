// made this version before I separated them out into classes in the RockPaperScissors Folder

import java.util.Scanner;

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
        Scanner user = new Scanner(System.in);

        System.out.println("Enter username");
        String userName = user.nextLine();


        System.out.println("Time to choose " + userName + "! Rock, Paper or Scissors");
        String player1 = user.nextLine();

        String player2 = randomChoice();

        System.out.println("You chose: " + player1 );
        System.out.println("The computer chose: " + player2 );

        if ( player1.equals(player2)){
            System.out.println("It's a tie");
        } else if ((player1.equals("Rock") && player2.equals("Scissors")) || (player1.equals("Paper") && player2.equals("Rock")) || (player1.equals("Scissors") && player2.equals("Paper"))) {
            System.out.println(userName + " wins!");
        } else {
            System.out.println("The computer wins!");
    }
    }

    public static void main(String[] args){
        winner();
    }
}