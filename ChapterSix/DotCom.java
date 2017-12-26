import java.util;

public class DotCom {
  // Instance variables
  private ArrayList<String> locationCells;
  private String name;
  // Setter method that updates the DotCom's location
  public void setLocationCells(ArrayList<String> loc) {
    locationCells = loc
    // Basic setter method
  public void setName(String n) {
    name = n;
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
        System.out.println("Ouch! You sunk " + name + " : ( ");
      } else {
        result = "hit";
      }
    }
    return result;
  }
}
