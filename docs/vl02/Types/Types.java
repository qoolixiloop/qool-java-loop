public class Types {
  public static void main(String[] args) {

    ///////////////
    /* Variables */
    ///////////////

    // Declaring variables
    int number;
    String name;

    // Declaring and then assigning multiple variables of the same type
    int x, y, z;
    x = 1; y = 2; z = 3;

    // Assigning values to variables
    number = 0;
    name = "Mary";

    // Changing values
    number = 1;
    name = "Max";

    // Declaring AND assigning at the same time
    int anotherNumber = 200;
    String anotherName = "Jane";

    ///////////
    /* Types */
    ///////////

    // Primitive types
    int anInteger = 5;
    double aDouble = 5.5;
    char aCharacter = 'c';
    boolean aBoolean = true;

    // Class types
    String aString = "Hello";
    Car aCar = new Car("Ford", "Mustang");

    //////////
    /* Misc */
    //////////

    // double precision error
    double result = 1586.6 - 708.75; // should be 877.85
    System.out.println(result);      // actually prints 877.8499999999999

    // type cast
    double distance = 9.8;
    int intDistance = (int)distance;
    System.out.println(intDistance);      // prints 9
    System.out.println(distance);         // prints 9.8

    // division
    System.out.println(99/100);             // prints 0
    System.out.println(99.0/100);           // prints 0.99

  }
}
