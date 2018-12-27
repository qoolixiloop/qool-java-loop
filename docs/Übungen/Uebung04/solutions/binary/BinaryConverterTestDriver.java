public class BinaryConverterTestDriver {

  public static void main(String[] args) {

    BinaryConverter binaryConverter = new BinaryConverter();

    int dNumber = 4;
    System.out.println("Test 1 : dNumber -> " + dNumber + " -> binary number: " + binaryConverter.convert(dNumber));

    dNumber = -4;
    System.out.println("Test 1 : dNumber -> " + dNumber + " -> binary number: " + binaryConverter.convert(dNumber));

    dNumber = 352;
    System.out.println("Test 1 : dNumber -> " + dNumber + " -> binary number: " + binaryConverter.convert(dNumber));
    
    dNumber = -352;
    System.out.println("Test 1 : dNumber -> " + dNumber + " -> binary number: " + binaryConverter.convert(dNumber));
  
    dNumber = 88;
    System.out.println("Test 1 : dNumber -> " + dNumber + " -> binary number: " + binaryConverter.convert(dNumber));
    
    dNumber = -88;
    System.out.println("Test 1 : dNumber -> " + dNumber + " -> binary number: " + binaryConverter.convert(dNumber));
  }
}
