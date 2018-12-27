import java.util.Scanner;
public class TestDriver {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    while (true) {
      System.out.print("Input: ");
      String next  = keyboard.nextLine();
      try {
        int parsed = Intparser.parseInt(next);
        System.out.println("Parsed: " + parsed);
      }
      catch (ParseException e) {
        System.out.println(" >> An error occured (" + e.getMessage() + " for input " + e.getProvided() + ")");
      }
    }
  }
}
