public class Change {
  public String compute(int cents) {
    int remaining = cents;

    int quarters = remaining / 25;
    remaining    = remaining % 25;

    int dimes    = remaining / 10;
    remaining    = remaining % 10;

    int nickels  = remaining / 5;
    remaining    = remaining % 5;

    String result = cents + " cents in coins:\n" +
                    "  " + quarters + " quarters\n" +
                    "  " + dimes + " dimes\n" +
                    "  " + nickels + " nickels\n" +
                    "  " + remaining + " pennies\n";

    return result;
  }
}
