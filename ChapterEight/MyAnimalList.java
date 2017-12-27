public class MyAnimalList {

  private Animal[] animals = new Animals[5];
  private int nextIndex = 0;

  public void add(Adnimal a) {
    if (nextIndex < animals.length) {
      animals[nextIndex] = a;
      System.out.println("Animal added at " + nextIndex);
      nextIndex++
    }
  }
}
