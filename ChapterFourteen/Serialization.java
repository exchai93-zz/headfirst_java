// Writing a serialized object to a file

// Make a FileOutputStream
FileOutputStream fileStream = new FileOutputStream("MyGame.ser");
// Make an ObjectOutputStream
ObjectOutputStream os = new ObjectOutputStream(fileStream);
// Write the object
os.writeObject(characterOne);
os.writeObject(characterTwo);
os.writeObject(characterThree);
// Close the ObjectOutputStream
os.close();

// Implement Serializable if you want your class to be serializable

import java.io.*;

public class Bos implements Serializable {
  private int width;
  private int height;

  public void setWidth(int w) {
    width = w;
  }
  public void setHeight(int h) {
    height = h; 
  }
}
