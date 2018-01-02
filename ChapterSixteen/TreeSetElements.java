// TreeSet elements must be comparable

// The elements in the list must be of a type that implements Comparable
class Book implements Comparable {
  String title;
  public Book(String t) {
    title = t;
  }
  public int compareTo(Object b) {
    Book book = (Book) b;
    return (title.compareTo(book.title));
  }
}

// Or use the TreeSet's overloaded constructor that takes a Comparator
public class BookCompare implements Comparator<Book> {
  public int compare(Book one, Book two) {
    return (one.title.compareTo(two.title));
  }
}

class Test {
  public void go() {
    Book b1 = new Book("How Cats Work");
    Book b2 = new Book("Remix your Body");
    Book b3 = new Book("Finding Emo");
    BookCompare bCompare = new BookCompare();
    TreeSet<Book> tree = new TreeSet<Book>(bCompare);
    tree.add(new Book("How Cats Work"));
    tree.add(new Book("Finding Emo"));
    tree.add(new Book("Remix your body"));
    System.out.println(tree);
  }
}
