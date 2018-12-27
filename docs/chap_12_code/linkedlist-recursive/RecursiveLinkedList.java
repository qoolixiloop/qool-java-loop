import java.util.Iterator;

public class RecursiveLinkedList<T> implements Iterable<T> {
  private T data;
  private RecursiveLinkedList<T> tail;

  // if data is null, this is an empty list
  // the empty list does neither have a value nor a tail!
  private boolean isEmpty() { return data == null; }

  // constructor for the empty list
  public RecursiveLinkedList() { data = null; tail = null; }
  // concstructor for regular lists
  public RecursiveLinkedList(T s, RecursiveLinkedList<T> t) {
    if (s == null) { throw new IllegalArgumentException(); }
    if (t == null) { throw new IllegalArgumentException(); }
    data = s;
    tail = t;
  }

  public String toString() {
    if (isEmpty()) { return ""; }
    return data.toString() + " " + tail.toString();
  }

  public int size() {
    if (isEmpty()) { return 0; }
    return 1 + tail.size();
  }

  public RecursiveLinkedList<T> add(T s) {
    return new RecursiveLinkedList<T>(s, this);
  }

  public RecursiveLinkedList<T> append(T s) {
    if (isEmpty()) {
      return new RecursiveLinkedList<T>(s, new RecursiveLinkedList<T>());
    }
    return new RecursiveLinkedList<T>(data, tail.append(s));
  }

  public RecursiveLinkedList<T> remove(T s) {
    if (isEmpty()) { return this; }
    if (data.equals(s)) { return tail; }
    return new RecursiveLinkedList<T>(data, tail.remove(s));
  }

  public Iterator<T> iterator() { return new RecursiveLinkedListIterator(this); }

  private class RecursiveLinkedListIterator implements Iterator<T> {
    private RecursiveLinkedList<T> list;
    private RecursiveLinkedList<T> current;
    private RecursiveLinkedList<T> previous;
    public RecursiveLinkedListIterator(RecursiveLinkedList<T> l) { list = l; }

    // hasNext() returns whether or not there is another element in the collection
    // If the iterator has not been used before, it determines whether there is a head
    public boolean hasNext() {
      if (current == null) { return !list.isEmpty(); }
      return !current.tail.isEmpty();
    }

    // next() returns the next element in the collection and advances the current reference
    public T next() {
      if (!hasNext()) { return null; }
      if (current == null) { current = list; }
      else {
        previous = current;
        current = current.tail;
      }
      return current.data;
    }

    // remove() removes the element last returned by this iterator
    // this means that if next() has not been called, ever, then nothing is
    // removed. To remove the first element of an iterator, it's necessary to
    // call next() and then remove().
    public void remove() {
      if (previous != null) {
        previous.tail = current.tail;
      }
      else {
        list = list.tail;
      }
    }
  }

  // BONUS material, not relevant for exam:
  // This constructor accepts any number of arguments as Object instances, so
  // that we can quickly instantiate a list with multiple elements.
  public RecursiveLinkedList(Object... arguments) {
    if (arguments.length != 0) {
      T first = (T) arguments[0];
      data = first;
      Object[] rest = new Object[arguments.length-1];
      for (int i = 1; i < arguments.length; i++) {
        rest[i-1] = arguments[i];
      }
      tail = new RecursiveLinkedList<T>(rest);
    }
  }

}
