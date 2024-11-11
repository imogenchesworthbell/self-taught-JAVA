package RockPaperScissors;

public class Computer {
    private String choice;

    public Computer() {
        this.choice = generateRandomChoice();
    }

    private String generateRandomChoice() {
        int choiceIndex = RandomNumber.random(2);  // Generates 0, 1, or 2
        return switch (choiceIndex) {
            case 0 -> "Rock";
            case 1 -> "Paper";
            default -> "Scissors";
        };
    }

    public String getChoice() {
        return choice;
    }
}

