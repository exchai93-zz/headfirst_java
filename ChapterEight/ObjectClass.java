// Bad example of use of Object class
public void go() {
  Dog aDog = new Dog();
  // This line won't work  - the return type Object means the compiler won't let you assign the returned reference to anything but Object
  Dog sameDog = getObject(aDog);
}

public Object getObject(Object o) {
  // Returning a reference to the same Dog, but as a return type of Object
  return o;
}
// The compiler doesn't know that the thing returned from the method is actually a Dog, so it won't let you assign it to a Dog reference

// Good example
public void go() {
  Dog aDog = new Dog();
  // This works because you can assign anything to a refrence of type Object
  // Every object in Java is an instance of type Object
  Object sameDog = getObject(aDog);
}

public Object getObject(Object o) {
  return o;
}
