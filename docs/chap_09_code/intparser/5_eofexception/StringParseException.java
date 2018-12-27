public class StringParseException extends Exception {
  private String provided;
  public StringParseException(String message, String p) { super(message); provided = p; }
  public String getProvided() { return provided; }
}
