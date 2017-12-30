// To write a serialized object
objectOutputStream.writeObject(someObject);
// To write a String
fileWriter.write("My first String to save");

import java.io.*;

class WriteAFile {
  public static void main(String[] args) {
    try {
      FileWriter writer = new FileWriter("Foo.txt");
      writer.write("Hello foo!");
      writer.close();
    } catch(IOException ex) {
        ex.printStackTrace();
    }
  }
}
