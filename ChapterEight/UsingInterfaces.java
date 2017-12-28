public interface Pet {
  // Interface methods are implicitly public and abstract
  // All interfacemethods are abstract, therefore have no body
  public abstract void beFriendly();
  public abstract void play();
}
// State 'implements' followed by the name of the interface
public class Dog extends Canine implements Pet {
  // Stated 'Pet' interface therefore must implement Pet methods
  public void beFriendly() {}
  public void play() {}
  // Regular overriding methods 
  public void roam() {}
  public void eat() {}
}
