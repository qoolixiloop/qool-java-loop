public class CharParseException extends Exception {
  private char provided;
  public CharParseException(String message, char p) { super(message); provided = p; }
  public char getProvided() { return provided; }
}
