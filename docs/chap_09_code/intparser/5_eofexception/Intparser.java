import java.util.Scanner;
public class Intparser {

  public static int parseIntChar(char c) throws CharParseException {
    // string is too long
    switch (c) {
      case '1': return 1;
      case '2': return 2;
      case '3': return 3;
      case '4': return 4;
      case '5': return 5;
      case '6': return 6;
      case '7': return 7;
      case '8': return 8;
      case '9': return 9;
      case '0': return 0;
      default: throw new CharParseException("Not a number", c);
    }
  }

  public static int parseIntString(String s) throws StringParseException {
    if (s.length() == 0) { throw new StringParseException("Empty string", s); }
    boolean negative = false;
    if (s.startsWith("-")) {
      negative = true;
      s = s.substring(1);
    }
    s = new StringBuilder(s).reverse().toString();
    int result = 0;
    for (int i = 0; s.length() > 0; i++) {
      try {
        result += (parseIntChar(s.charAt(0))) * (Math.pow(10, i));
      }
      catch (CharParseException e) {
        throw new StringParseException(e.getMessage(), s);
      }
      if (s.length() > 0) { s = s.substring(1); }
    }
    if (negative) { return result * -1; }
    return result;
  }


}
