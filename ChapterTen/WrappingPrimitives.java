// Wrapping a value
int i = 288;
Integer iWrap = new Integer(i);

// Unwrapping a value
int unWrapped = iWrap.intValue();

// Making an ArrayList of primitive ints - without autoboxing (before Java 5.0)
public void doNumsOldWay() {
  ArrayList listOfNumbers = new ArrayList();
  // Wrap the primitive '3' in an Integer
  listOfNumbers.add(new Integer(3));
  // It comes out as type Object, but you can cast the Object to an Integer
  Integer one = (Integer) listOfNumbers.get(0);
  // Get the primitive out of the Integer
  int intOne = one.intValue();
}

// With autoboxing - Java 5.0 onwards
public void doNumsNewWay() {
  // Make an ArrayList of type Integer
  ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
  listOfNumbers.add(3);
  // Compiler automatically unwraps the Integer object 
  int num = listOfNumbers.get(0);
}
