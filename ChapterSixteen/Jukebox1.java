import java.util.*;
import java.io.*;

public class Jukebox1 {
  ArrayList<Song> songList = new ArrayList<Song>();

  public static void main(String[] args) {
    new Jukebox1().go();
  }
  // Create a new inner class that implements Comparator
  class ArtistCompare implements Comparator<Song> {
    public int compare(Song one, Song two) {
      // Letting the String variables (for artist) do the actual comparison
      return one.getArtist().compareTo(two.getArtist());
    }
  }

  public void go() {
    getSongs();
    System.out.println(songList);
    // Call the static Collections sort() method, then print the list again
    Collections.sort(songList);
    System.out.println(songList);
    HashSet<Song> songSet = new HashSet<Song>();
    songSet.addAll(songList);
    System.out.println(songSet);
    // Make an instance of the Comparator inner class
    // ArtistCompare artistCompare = new ArtistCompare();
    // Invoke sort(), passing it the list and a refrence to the new custom Comparator object
    // Collections.sort(songList, artistCompare);
  }

  void getSongs() {
    try {
      File file = new File("SongList.txt");
      BufferedReader reader = new BufferedReader(new FileReader(file));
      String line = null;
      while ((line = reader.readLine()) != null) {
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
