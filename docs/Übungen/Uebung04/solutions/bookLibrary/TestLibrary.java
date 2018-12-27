public class TestLibrary {
  public static void main(String[] args) {
    Library lib = new Library();
    for (int i = 1; i < 7; i++) {
      Book book = new Book();
      book.setAuthor("author" + i);
      book.setTitle("title" + i);
      lib.addBook(book);
    }
    lib.printLibrary();
  }
}
