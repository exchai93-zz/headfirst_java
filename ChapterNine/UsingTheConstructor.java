// Using a setter method to set the initial size of the new Duck
public class Duck {
  // Instance variable
  int size;
  // Constructor
  public Duck() {
    System.out.println("Quack");
  }
  // Setter method
  public void setSize(int newSize) {
    size = newSize;
  }
}

public class UseADuck {
  public static void main (String [] args) {
    Duck d = new Duck();
    d.setSize(42);
  }
}

// Using a constructor to initialize the Duck state
public class Duck {
  int size;
  // Add an int parameter to the Duck constructor
  public Duck(int duckSize) {
    System.out.println("Quack");
    // User the argument value to set the size instance variable
    size = duckSize;
    System.out.println("size is " + size);
  }
}

public class UseADuck {
  public static void main (String [] args) {
    // Make a new duck and pass a value to the constructor
    // Only one statement needed
    Duck d = new Duck(42);
  }
}
