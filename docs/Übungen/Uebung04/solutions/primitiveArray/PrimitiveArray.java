public class PrimitiveArray {
  public static void main(String[] args) {
    int[] arr = new int[10];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i;
    }
    int sum = 0;
    for (int n : arr) {
      sum += n;
    }
    System.out.println(sum);
  }
}
