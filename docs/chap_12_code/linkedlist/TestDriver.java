import java.util.Iterator;

public class TestDriver {
  public static void main(String[] args) {

    // ListNode
    ListNode n1 = new ListNode("Hello", null);
    ListNode n2 = new ListNode("World", null);
    ListNode n3 = new ListNode("!", null);
    n1.setNext(n2);
    n2.setNext(n3);
    System.out.println(n1);
    System.out.println(n1.getNext());
    System.out.println(n1.getNext().getNext());

    // LinkedList
    LinkedList l = new LinkedList();
    l.add("Hello");
    l.add("strange");
    l.add("world");
    System.out.println(l);

    l.remove("strange");
    l.remove("world");
    System.out.println(l);

    l.add("strange");
    l.add("world");
    System.out.println(l);

    // LinkedList implements Iterable<String>
    for (String s : l) { System.out.println(s); }

    Iterator<String> iter = l.iterator();
    do {
      System.out.println(iter.next());
    } while (iter.hasNext());

    LinkedList list2 = new LinkedList();
    list2.add("Hello");
    list2.add("strange");
    list2.add("World");
    Iterator<String> it = list2.iterator();
    String s1 = it.next();
    System.out.println("s1: " + s1);
    it.next();
    it.remove();
    String s2 = it.next();
    System.out.println("s2: " + s2);
    for (String s : list2) { System.out.println(s); }
    System.out.println(list2);


    // GenericLinkedList<T> implements Iterable<T>

    GenericLinkedList<Integer> intlist = new GenericLinkedList<Integer>();
    intlist.add(5);
    intlist.add(10);
    intlist.add(12);

    for (Integer s : intlist) { System.out.println(s); }

    Iterator<Integer> iter2 = intlist.iterator();
    do {
      System.out.println(iter2.next());
    } while (iter2.hasNext());

    Iterator<Integer> it2 = intlist.iterator();
    int i1 = it2.next();
    System.out.println("i1: " + i1);
    it2.next();
    it2.remove();
    it2.remove();
    int i2 = it2.next();
    System.out.println("i2: " + i2);
    for (int i : intlist) { System.out.println(i); }
    System.out.println(intlist);


  }
}
