public class SimpleDotComGame {
  public static void main (String[] args) {
    // Declare variable to hold use guess count, set to 0
    int numOfGuesses = 0;
    // Class that has a method for getting user input
    GameHelper helper = new GameHelper();
    SimpleDotCom game = new SimpleDotCom();
    // Make a random number for the first cell and use it to make the cell locations array
    int randomNum = (int) (Math.random() * 5);
    int[] locations = {randomNum, randomNum+1, randomNum+2};
    // Give the game its locations (the array)
    game.setLocationCells(locations);
    boolean isAlive = true;

    while (isAlive == true) {
      // Get user input
      String guess = helper.getUserInput("enter a number");
      // Ask the game to check the guess and save the returned result in a String
      String result = game.checkYourself(guess);
      numOfGuesses++;
      if (result.equals("kill")) {
        isAlive = false;
        System.out.println("You took " + numOfGuesses + " guesses");
      }
    }
  }
}
