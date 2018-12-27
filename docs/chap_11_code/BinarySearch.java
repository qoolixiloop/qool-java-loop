public class BinarySearch {
  public static int iterativeBinarySearch(int x, int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    int middle = end / 2;
    int value = arr[middle];
    while (value != x) {
      if (x < value) { end = middle; }
      else if (x > value) { start = middle; }
      middle = start + (end - start) / 2;
      value = arr[middle];
    }
    return middle;
  }

  public static int recursiveBinarySearch(int x, int[] arr) {
    return recursiveBinarySearch(x, arr, 0, arr.length - 1);
  }

  private static int recursiveBinarySearch(
      int x, int[] arr, int start, int end) {
    int middle = start + (end - start) / 2;
    int value = arr[middle];
    if (x == value) { return middle; }
    else if (value < x) {
      return recursiveBinarySearch(x, arr, middle, end);
    }
    else {
      return recursiveBinarySearch(x, arr, start, middle);
    }
  }


}
