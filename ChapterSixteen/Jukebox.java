import java.util.*;
import java.io.*;

public class Jukebox1 {
  ArrayList<Song> songList = new ArrayList<Song>();

  public static void main(String[] args) {
    new Jukebox1().go();
  }

  public void go() {
    getSongs();
    System.out.println(songList);
    // Call the static Collections sort() method, then print the list again
    Collections.sort(songList);
    System.out.println(songList);
  }

  public void go() {
    getSongs();
    try {
      File file = new File("SongList.txt");
      BufferedReader reader = new BufferedReader(new FileReader(file));
      String line = null;
      while ((line = reader.readline()) != null) {
        addSong(line);
      }
    } catch(Exception ex) {
        ex.printStackTrace();
    }
  }
  void addSong(String lineToParse) {
    String[] tokens = lineToParse.split("/");
    // Create a new Song object using the four tokens then add the Song to the list 
    Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
    songList.add(nextSong);
  }
}
