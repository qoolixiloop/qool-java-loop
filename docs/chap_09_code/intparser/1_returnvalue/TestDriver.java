import java.util.Scanner;
public class TestDriver {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    while (true) {
      System.out.print("Input: ");
      String next  = keyboard.nextLine();
      int parsed = Intparser.parseInt(next);
      if (parsed < 0) {
        System.out.println(" >> An error occured (code " + parsed + ")");
      }
      else {
        System.out.println("Parsed: " + parsed);
      }
    }
  }
}
