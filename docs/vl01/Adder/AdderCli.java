import java.util.Scanner;

public class AdderCli {
  public static void main(String[] args) {
    int sum = 0;
    if (args.length < 2) {
      System.out.println("Pass at least two numbers as arguments to this program");
      System.exit(0);
    }
    for (String s : args) {
      int number = Integer.parseInt(s);
      sum += number;
    }
    System.out.println("The sum of all given numbers is " + sum);
  }
}
