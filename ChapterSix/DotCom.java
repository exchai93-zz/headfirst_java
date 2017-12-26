import java.util.ArrayList;

public class DotCom {

  int[] locationCells;
  int numOfHits = 0;
  String name;

  private ArrayList<String> location Cells;

  public void setLocationCells(ArrayList<String> loc) {
    locationCells = loc;
  }

  public String checkYourself(String userInput) {
    // Make a variable to hold the result we'll return - 'miss' is the default
    String result = "miss";
    // Find out if the user guess is in the ArrayList by asking for its index.
    // If it's not in the list, then indexOf() returns a -1
    int index = locationCells.indexOf(userInput);
    if(index >= 0) {
      locationCells.remove(index);

      if(locationCells.isEmpty()) {
        result = "kill";
      } else {
        result = "hit";
      }
    }
    return result;
  }
}
