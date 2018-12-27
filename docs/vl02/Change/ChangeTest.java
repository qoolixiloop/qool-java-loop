import java.util.Scanner;

public class ChangeTest {
  public static void main(String[] args) {
    System.out.println("Enter an integer number from 1 to 99 and hit Enter");

    Scanner keyboard = new Scanner(System.in);
    int coins = keyboard.nextInt();

    Change change = new Change();
    System.out.println(change.compute(coins));

  }
}
