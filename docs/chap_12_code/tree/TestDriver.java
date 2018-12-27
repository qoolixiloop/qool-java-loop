public class TestDriver {
  public static void main(String[] args) {
    Tree<Integer> t6 = new Tree<Integer>(6, null, null);
    Tree<Integer> t29 = new Tree<Integer>(29, null, null);
    Tree<Integer> t41 = new Tree<Integer>(41, null, null);
    Tree<Integer> t140 = new Tree<Integer>(140, null, null);

    Tree<Integer> t25 = new Tree<Integer>(25, t6, t29);
    Tree<Integer> t60 = new Tree<Integer>(60, t41, t140);

    Tree<Integer> root = new Tree<Integer>(50, t25, t60);
    root.print();

    Tree<String> leaf1 = new Tree<String>("John", null, null);
    Tree<String> leaf2 = new Tree<String>("Jim", null, null);
    Tree<String> leaf3 = new Tree<String>("Anne", null, null);
    Tree<String> leaf4 = new Tree<String>("Jane", null, null);

    Tree<String> mid1 = new Tree<String>("Team1", leaf1, leaf2);
    Tree<String> mid2 = new Tree<String>("Team2", leaf3, leaf4);

    Tree<String> root2 = new Tree<String>("Everyone", mid1, mid2);
    root2.print();

  }
}
