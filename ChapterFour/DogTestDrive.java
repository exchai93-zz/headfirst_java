class DogTestDrive {
  public static void main (String[] args) {
    Dog one = new GoodDog();
    one.setSize(70);
    Dog two = new GoodDog();
    two.setSize(8);

    System.out.println("Dog one: " + one.getSize());
    System.out.println("Dog two: " + two.getSize());

    one.bark();
    two.bark();
  }
}
