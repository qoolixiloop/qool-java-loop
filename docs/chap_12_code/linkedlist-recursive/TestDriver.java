import java.util.Iterator;

public class TestDriver {
  public static void main(String[] args) {
    RecursiveLinkedList<String> list = new RecursiveLinkedList<String>();
    list = list.append("Hello");
    list = list.append("strange");
    list = list.append("World");
    System.out.println(list.size());
    System.out.println(list.toString());
    list = list.remove("strange");
    System.out.println(list.toString());
    for (String s : list) { System.out.println(s); }

    RecursiveLinkedList<String> list2 = new RecursiveLinkedList<String>();
    list2 = list2.append("Hello");
    list2 = list2.append("strange");
    list2 = list2.append("World");
    Iterator<String> it = list2.iterator();
    String s1 = it.next();
    it.next();
    it.remove();
    String s2 = it.next();
    for (String s : list2) { System.out.println(s); }

    System.out.println("------------");
    System.out.println(list2.toString());

  }

}
