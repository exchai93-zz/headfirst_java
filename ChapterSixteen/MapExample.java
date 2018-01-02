import java.util.*;

public class TestMap {
  public static void main(String [] args) {
    // HashMap needs 2 types of parameters - one for key and one for value
    HashMap<String, Integer> scores = new HashMap<String, Integer>();

    scores.put("Kathy", 42);
    scores.put("Bert", 343);
    scores.put("Skyler", 420);

    System.out.println(scores);
    Sysmtem.out.println(scores.get("Bert"));
  }
}
