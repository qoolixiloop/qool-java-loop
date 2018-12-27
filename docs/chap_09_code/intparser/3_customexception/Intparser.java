import java.util.Scanner;
public class Intparser {

  public static int parseInt(String s) throws ParseException {
    // string is too long
    if (s.length() > 1) { throw new ParseException("String is too long", s); }
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
      case "": throw new ParseException("String is empty", s);
      // string is not a number
      default: throw new ParseException("Not a number", s);
    }
  }

}
