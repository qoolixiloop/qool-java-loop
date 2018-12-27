public class TestDriver {
  public static void main(String[] args) {
    int[] arr = {1,3,5,6,8,12,15,17,18,21,30,45};
    // static methods can be called by specifying the class directly, no
    // instance required!
    int indexOfValue1 = BinarySearch.iterativeBinarySearch(21, arr);
    int indexOfValue2 = BinarySearch.recursiveBinarySearch(21, arr);
    System.out.println(indexOfValue1);
    System.out.println(indexOfValue2);

    System.out.println("-------------------------------");

    Tree t6 = new Tree(6, null, null);
    Tree t29 = new Tree(29, null, null);
    Tree t41 = new Tree(41, null, null);
    Tree t140 = new Tree(140, null, null);

    Tree t25 = new Tree(25, t6, t29);
    Tree t60 = new Tree(60, t41, t140);

    Tree root = new Tree(50, t25, t60);
    root.print();
    System.out.println(root.sum());
  }
}
