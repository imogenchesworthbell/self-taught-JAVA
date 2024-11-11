package RockPaperScissors;

public class Player {
    private String name;
    private String choice;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }
}

