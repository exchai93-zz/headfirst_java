// Song objects can be compared to other Song objects for the purpose of sorting
class Song implements Comparable<Song> {
  // 4 instance variables for the song attributes in the file
  String title;
  String artist;
  String rating;
  String bpm;
  // The HashSet sends it another Song
  public boolean equals(Object aSong) {
    Song s = (Song) aSong;
    return getTitle().equals.(s.getTitle());
  }
  // String class has an overridden hashCode() method 
  public int hashCode() {
    return title.hashCode()
  }
  // Sort() method sends a Song to compareTo() to see how that Song compares to the Song on which the method was invoked
  public int compareTo(Song s) {
    // Pass the work on to the title String objects, since we know Strings have a CompareTo() method
    return title.compareTo(s.getTitle());
 }

  Song(String t, String a, String r, String b) {
    title = t;
    artist = a;
    rating = r;
    bpm = b;
  }
  // Getting methods for the four song attributes
  public String getTitle() {
    return title;
  }
  public String getArtist() {
    return artist;
  }
  public String getRating() {
    return rating;
  }
  public String getBpm() {
    return bpm;
  }
  // Override toString() becuase when you println(aSongObject), want to see the title.
  // When you do println(aListOfSongs), it calls the toString() method of EACH element in the list
  public String toString() {
    return title;
  }
}
