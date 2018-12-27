import java.util.Scanner;
public class Intparser {

  public static int parseInt(String s) throws Exception {
    // string is too long
    if (s.length() > 1) { throw new Exception("String is too long"); }
    switch (s) {
      case "1": return 1;
      case "2": return 2;
      case "3": return 3;
      case "4": return 4;
      case "5": return 5;
      case "6": return 6;
      case "7": return 7;
      case "8": return 8;
      case "9": return 9;
      case "0": return 0;
      // string is empty
      case "": throw new Exception("String is empty");
      // string is not a number
      default: throw new Exception("Not a number");
    }
  }

}
