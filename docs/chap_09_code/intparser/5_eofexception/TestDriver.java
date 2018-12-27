import java.util.Scanner;
public class TestDriver {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    while (true) {
      System.out.print("Input: ");
      try {
        String next  = keyboard.nextLine();
        int parsed = Intparser.parseIntString(next);
        System.out.println("Parsed: " + parsed);
      }
      // insert catch (Exception e) for demo here
      catch (StringParseException e) {
        System.out.println(" >> An error occured (" + e.getMessage() + " for input " + e.getProvided() + ")");
      }
      catch (java.util.NoSuchElementException e) {
        System.out.println("No input, bye!");
        break;
      }
    }
  }
}
