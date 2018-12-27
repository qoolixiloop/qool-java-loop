import java.util.Iterator;

public class LinkedList implements Iterable<String> {

  private class ListNode {
    private String data;
    private ListNode next;
    public ListNode() { }
    public ListNode(String s, ListNode n) {
      data = s; next = n;
    }
    public void setData(String s) { data = s; }
    public void setNext(ListNode n) { next = n; }
    public String getData() { return data; }
    public ListNode getNext() { return next; }

  }

  private ListNode head;

  public String toString() {
    String result = "";
    ListNode pos = head;
    while (pos != null) {
      result += pos.data + " ";
      pos = pos.next;
    }
    return result;
  }

  public int size() {
    ListNode pos = head;
    int count = 0;
    while (pos != null) {
      count++;
      pos = pos.next;
    }
    return count;
  }

  public void add(String s) {
    if (head == null) {
      head = new ListNode(s, null);
      return;
    }
    ListNode pos = head;
    while (pos.next != null) {
      pos = pos.next;
    }
    pos.next = new ListNode(s, null);
  }

  public void remove(String s) {
    if (head == null) { return; }
    if (head.data.equals(s)) {
      if (head.next != null) { head = head.next; }
      else { head = null; }
      return;
    }
    ListNode pos = head;
    ListNode previous = null;
    while (!pos.data.equals(s)) {
      if (pos.next != null) {
        previous = pos;
        pos = pos.next;
      }
      else { return; }
    }
    previous.next = pos.next;
  }

  public Iterator<String> iterator() { return new LinkedListIterator(this); }

  private class LinkedListIterator implements Iterator<String> {
    private LinkedList list;
    private ListNode itCurrent;
    private ListNode itPrevious;
    public LinkedListIterator(LinkedList l) { list = l; }

    // hasNext() returns whether or not there is another element in the collection
    // If the iterator has not been used before, it determines whether there is a head
    public boolean hasNext() {
      if (itCurrent == null) { return list.head != null; }
      return itCurrent.next != null;
    }

    // next() returns the next element in the collection and advances the current reference
    public String next() {
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
