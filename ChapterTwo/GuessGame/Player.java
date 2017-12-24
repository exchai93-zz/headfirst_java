public class Player {
  // Where the guess goes
  int number = 0;

  public void guess() {
    number = (int) (Math.random() * 10);
    System.out.println("I'm guessing " + number);
  }
}
