public class Library {
  private Book[] books = new Book[5];
  private int numberOfBooks = 0;

  private boolean isLibraryFull() {
    return books.length <= numberOfBooks;
  }

  public void addBook(Book book) {
    if (isLibraryFull()) {
      Book[] copy = new Book[books.length*2];
      for (int i = 0; i<books.length; i++) {
        copy[i] = books[i];
      }
      books = copy;
    }
    books[numberOfBooks++] = book;
  }

  public void printLibrary() {
    for (Book b : books) {
      if (b != null) {
        System.out.println(b.getAuthor() + ": " + b.getTitle());
      }
    }
  }
}
