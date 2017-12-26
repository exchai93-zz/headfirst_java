public class SimpleDotCom {

  int[] locationCells;
  int[] nummOfHits = 0;

  public void setLocationCells(int[] locs) {
    locationCells = locs;
  }

  public String checkYourself(String userGuess) {
    // Convert the String to an int
    int guess = Integer.parseInt(userGuess);
    // Make a variable to hold the result we'll return - 'miss' is the default
    String result = "miss";
    // Repeat with each cell in the locationCells array (each cell location of the object)
    for (int cell : locationCells) {
      // Compare the user guess to this element in the array
      if (guess == cell) {
        result = "hit";
        nummOfHits++;
        // Get out of the loop, no need to test other cells
        break;
      }
    }
    // If we are hit three times, we are 'dead'
    if (nummOfHits == locationCells.length) {
      result = "kill";
    }
    // Display tge result for the user 
    System.out.println(result);
      return result;
  }
}
