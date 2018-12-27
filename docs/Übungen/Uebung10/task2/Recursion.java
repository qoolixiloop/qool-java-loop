public class Recursion {

  public static int[] fibonacci(int length, int k1, int k2){
	  int[] sequence = new int[length];
	  sequence[0] = k1;
	  sequence[1] = k2;
	  length -= 2;
	  return fibonacci(length, k1, k2, sequence);
  }
  public static int[] fibonacci(int length, int k1, int k2, int[] sequence) {		
    if (length <= 0){
    	return sequence;
    }
    else{
    	sequence[sequence.length - length] = k1 + k2;
    	return fibonacci(length - 1, k2, k1 + k2, sequence);
    }
  }

  public static void printAnagrams(String word) {
    printAnagrams("", word);
  }

  private static void printAnagrams(String prefix, String word) {
    if (word.length() <= 1) {
      System.out.println(prefix + word);
    }
    else {
      for (int i = 0; i < word.length(); i++) {
        String currentChar = word.substring(i, i + 1);
        String beforeCurrent = word.substring(0, i);
        String afterCurrent = word.substring(i + 1);
        printAnagrams(prefix + currentChar, beforeCurrent + afterCurrent);
      }
    }
  }

  public static void main(String[] args) {
	int[] fibonacciSequence = fibonacci(6,0,1);
	String fibonacciString = "";
	for (int i = 0; i < fibonacciSequence.length; i++) {
		fibonacciString += fibonacciSequence[i] + ", ";
	}
    System.out.println("fibonacci(6,0,1) = " + fibonacciString);
    printAnagrams("Hello");
  }
}
