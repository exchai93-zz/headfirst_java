// When you think your class might evolve after someone has serialized objects from it...
// Use the serialver command line tool to get the versionID for your class
servialver Dog

// Paste the output into your class
public class Dog {
  static final long serialVersionUID = -###########;

  private String name;
  private int size;
  // Method here 
}
