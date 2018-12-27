public class Strings {
  public static void main(String[] args) {


    // concatenation
    String greeting = "Hello" + " officer";


    // length
    int greetingLength = greeting.length();
    System.out.println("The greeting is " + greetingLength + " characters long");

    greeting = "Hello again, officer";
    System.out.println("The greeting is " + greeting.length() + " characters long");


    // substrings
    String fun = "Java is fun.";
    // Index:     0   4   8
    char c = fun.charAt(8);
    System.out.println(c); // prints f
    String sub = fun.substring(8,11);
    System.out.println(sub); // prints fun


    // strings cannot be changed, but new strings can be created out of existing ones
    String original = fun;           // assigning an existing string!
    System.out.println(original);
    String new1 = "They say that " + original;
    System.out.println(new1);
    System.out.println(original);    // still the same string
    String new2 = original.substring(0, 11) + "???";
    System.out.println(new2);
    System.out.println(original);    // still the same string


    // Special characters and "escape sequences"
    System.out.println("This String contains \"quotes\"");



  }
}
