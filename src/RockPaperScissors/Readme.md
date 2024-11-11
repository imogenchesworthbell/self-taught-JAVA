# Create a Rock Paper Scissors Game

Design a basic console-based Rock, Paper, Scissors game using Object-Oriented Programming principles in Java.
The player competes against the computer.

## Classes

**RandomNumber:**

- random(int x) - Generates a random integer between 0 and x, used to determine the computer's choice in the game.

**Player:**

- name (String) - The player's username.
- choice (String) - The player's choice (Rock, Paper, or Scissors).
- getName() - Returns the player's name.
- getChoice() - Returns the player's choice.
- setChoice(String choice) - Sets the player's choice.


**Computer:**

- choice (String) - The computer's randomly generated choice (Rock, Paper, or Scissors).
- generateRandomChoice() - Generates the computer's random choice using the RandomNumber class.

**Game:**

- startGame() - Starts the game by asking for the player's name and choice, then the computer randomly selects its choice. Displays the result and determines the winner.
- determineWinner(String playerChoice, String computerChoice, String playerName) - Determines and prints the outcome of the game based on the choices of the player and computer.
