import java.util.Iterator;

public class GenericLinkedList<T> implements Iterable<T> {

  private class ListNode<T> {
    private T data;
    private ListNode<T> next;
    public ListNode() { }
    public ListNode(T s, ListNode<T> n) {
      data = s; next = n;
    }
    public void setData(T s) { data = s; }
    public void setNext(ListNode<T> n) { next = n; }
    public T getData() { return data; }
    public ListNode<T> getNext() { return next; }

  }

  private ListNode<T> head;

  public String toString() {
    String result = "";
    ListNode<T> pos = head;
    while (pos != null) {
      result += pos.data + " ";
      pos = pos.next;
    }
    return result;
  }

  public int size() {
    ListNode<T> pos = head;
    int count = 0;
    while (pos != null) {
      count++;
      pos = pos.next;
    }
    return count;
  }

  public void add(T s) {
    if (head == null) {
      head = new ListNode<T>(s, null);
      return;
    }
    ListNode<T> pos = head;
    while (pos.next != null) {
      pos = pos.next;
    }
    pos.next = new ListNode<T>(s, null);
  }

  public void remove(T s) {
    if (head == null) { return; }
    if (head.data.equals(s)) {
      if (head.next != null) { head = head.next; }
      else { head = null; }
      return;
    }
    ListNode<T> pos = head;
    ListNode<T> previous = null;
    while (!pos.data.equals(s)) {
      if (pos.next != null) {
        previous = pos;
        pos = pos.next;
      }
      else { return; }
    }
    previous.next = pos.next;
  }

  public Iterator<T> iterator() { return new GenericLinkedListIterator(this); }

  private class GenericLinkedListIterator implements Iterator<T> {
    private GenericLinkedList<T> list;
    private ListNode<T> itCurrent;
    private ListNode<T> itPrevious;
    public GenericLinkedListIterator(GenericLinkedList<T> l) { list = l; }

    // hasNext() returns whether or not there is another element in the collection
    // If the iterator has not been used before, it determines whether there is a head
    public boolean hasNext() {
      if (itCurrent == null) { return list.head != null; }
      return itCurrent.next != null;
    }

    // next() returns the next element in the collection and advances the current reference
    public T next() {
      if (!hasNext()) { return null; }
      if (itCurrent == null) { itCurrent = list.head; }
      else {
        itPrevious = itCurrent;
        itCurrent = itCurrent.next;
      }
      return itCurrent.data;
    }

    // remove() removes the element last returned by this iterator
    // this means that if next() has not been called, ever, then nothing is
    // removed. To remove the first element of an iterator, it's necessary to
    // call next() and then remove().
    public void remove() {
      if (itPrevious != null) {
        itPrevious.next = itCurrent.next;
      }
      else {
        list.head = itCurrent.next;
      }
    }

  }


}

