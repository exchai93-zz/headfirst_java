public class SimpleDotComTestDrive {
  public static void main (String [] args) {
    // Instantiate a SimpleDotCom object
    SimpleDotCom dot = new SimpleDotCom();
    // Make an int array for the location of the dot com (3 consecutive ints out of a possible 7)
    int[] locations = {2,3,4};
    // Invoke the setter method on the dot com
    dot.setLocationCells(locations);
    // Make a fake user guess
    String userGuess = "2";
    // Invoke the checkYourself() method on the dot come object and pass it the fake guess
    String result = dot.checkYourself(userGuess);
    String testResult = "failed";
    // If the fake guess (2) gives back a "hit", it's working
    if (result.equals("hit")) {
      testResult = "passed";
    }
    // Print out test result passed or failed
    System.out.println(testResult);
  }
}
