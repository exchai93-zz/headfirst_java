public class Duck extends Animal {
  int size;

  public Duck(int newSize) {
    // Calling the super constructor - compiler does it for you if you don't
    super();
    size = newSize;
  }
}
