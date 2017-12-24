public class PhraseMatic {
  public static void main (String[] args) {

    String[] colours = {"Pink", "Yellow", "Orange", "Blue", "Purple", "Silver", "Gold"};
    String[] animals = {"Pig", "Dolphin", "Bear", "Tiger", "Leopard", "Owl", "Seal"};
    String[] food = {"Crisps", "Burrito", "Sushi", "Noodles", "Peanuts", "Bananas",
                      "Pancakes", "Avocado", "Ice cream"};

    int coloursLength = colours.length;
    int animalsLength = animals.length;
    int foodLength = food.length;

    int coloursRand = (int) (Math.random() * coloursLength);
    int animalsRand = (int) (Math.random() * animalsLength);
    int foodRand = (int) (Math.random() * foodLength);

    String phrase = "a " + colours[coloursRand] + " " + animals[animalsRand] + " eat " + food[foodRand];

    System.out.println("I just saw a " + phrase);

  }
}
