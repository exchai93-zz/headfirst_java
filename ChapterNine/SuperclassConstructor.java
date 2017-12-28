public class Duck extends Animal {
  int size;

  public Duck(int newSize) {
    // Calling the super constructor - compiler does it for you if you don't
    super();
    size = newSize;
  }
}


// Superclass constructors with arguments
public abstract class Animal {
  // All animals have a name
  private String name;
  }
  // A getter method that Hippo inherits
  public String getName() {
    return name;
  }
  // The constructor that takes the name and assigns it the name instance variable
  public Animal(String theName) {
    name = theName;
  }
}

public class Hippo extends Animal {
  // Hippo constructor takes a name
  public Hippo(String name) {
    // Sends the name up the Stack to the Animal constructor
    super(name);
  }
}

public class MakeHippo {
  public static void main(String [] args) {
    // Make a Hippo passing the name "Buffy" to the Hippo constructor
    Hippo h = new Hippo("Buffy");
    // Call the Hippo's inherited getName()
    System.out.println(h.getName());
  }
}
