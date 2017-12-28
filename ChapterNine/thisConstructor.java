import java.awt.Color;

class Mini extends Car {
  public Mini() {
    // The no-arg constructor supplies a default Color
    // Calls the overloaded Real Constructor (the one that calls super())
    this(Color.RED);
  }

  public Mini(Color c) {
    // This is the Real Constructor that does the real work of initialiing the object - including the call to Super()
    super("Mini");
    color = c;
  }
}

public Mini(int size) {
  // This won't work as you cannot call This() and Super() in the same constructor
  this(Color.RED);
  super(size);
}
