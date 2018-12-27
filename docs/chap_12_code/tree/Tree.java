public class Tree<T> {
  T value;
  Tree<T> left;
  Tree<T> right;
  public Tree(T value, Tree<T> left, Tree<T> right) {
    this.value = value;
    this.left = left;
    this.right = right;
  }
  public void print() {
    System.out.println(value);
    if (left != null) { left.print(); }
    if (right != null) { right.print(); }
  }
}

