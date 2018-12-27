public class ListNode {
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
  public String toString() { return data; }
}

