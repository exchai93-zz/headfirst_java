class Song {
  // 4 instance variables for the song attributes in the file
  String title;
  String artist;
  String rating;
  String bpm;

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
