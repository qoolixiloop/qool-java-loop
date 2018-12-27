public class Tree {
  int value;
  Tree left;
  Tree right;
  public Tree(int value, Tree left, Tree right) {
    this.value = value;
    this.left = left;
    this.right = right;
  }
  public void setChildren(Tree left, Tree right) {
    this.left = left;
    this.right = right;
  }
  public void print() {
    System.out.println(value);
    if (left != null) { left.print(); }
    if (right != null) { right.print(); }
  }
  public int sum() {
    int sum = value;
    if (left != null) { sum += left.sum(); }
    if (right != null) { sum += right.sum(); }
    return sum;
  }
}

