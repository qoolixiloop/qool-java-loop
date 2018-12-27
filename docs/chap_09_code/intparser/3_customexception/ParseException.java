public class ParseException extends Exception {
  private String provided;
  public ParseException(String message, String p) { super(message); provided = p; }
  public String getProvided() { return provided; }
}
