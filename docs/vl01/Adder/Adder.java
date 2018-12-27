import java.util.Scanner;

public class Adder {
  public static void main(String[] args) {
    System.out.println("Enter two numbers separated by spaces and hit Enter");

    Scanner keyboard = new Scanner(System.in);

    int n1 = keyboard.nextInt();
    int n2 = keyboard.nextInt();

    System.out.println("The sum of these two numbers is " + (n1 + n2));
  }
}
