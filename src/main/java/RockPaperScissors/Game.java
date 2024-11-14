package RockPaperScissors;

import java.util.Scanner;

public class Game {
    public void startGame() {
        Scanner scanner = new Scanner(System.in);

        // Create Player
        System.out.println("Enter username:");
        String userName = scanner.nextLine();
        Player player = new Player(userName);

        // Player makes a choice
        System.out.println("Time to choose " + player.getName() + "! Rock, Paper, or Scissors:");
        player.setChoice(scanner.nextLine());

        // Computer makes a choice
        Computer computer = new Computer();
        String computerChoice = computer.getChoice();

        // Display choices
        System.out.println("You chose: " + player.getChoice());
        System.out.println("The computer chose: " + computerChoice);

        // Determine the winner
        determineWinner(player.getChoice(), computerChoice, player.getName());

        scanner.close();
    }

    private void determineWinner(String playerChoice, String computerChoice, String playerName) {

        String playerChoiceLower = playerChoice.toLowerCase();
        String computerChoiceLower = computerChoice.toLowerCase();

        if (playerChoiceLower.equals(computerChoiceLower)) {
            System.out.println("It's a tie!");
        } else if (
                (playerChoiceLower.equals("rock") && computerChoiceLower.equals("scissors")) ||
                        (playerChoiceLower.equals("paper") && computerChoiceLower.equals("rock")) ||
                        (playerChoiceLower.equals("scissors") && computerChoiceLower.equals("paper"))
        ) {
            System.out.println(playerName + " wins!");
        } else {
            System.out.println("The computer wins!");
        }
    }


    public static void main(String[] args) {
        Game game = new Game();
        game.startGame();
    }
}

