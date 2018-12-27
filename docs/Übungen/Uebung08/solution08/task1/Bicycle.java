package task1;

/**
 * Bicycle is a subclass of Vehicle.
 */
public class Bicycle extends Vehicle {

  public Bicycle(String owner, int serialNumber, boolean motorized) {
    super(owner, serialNumber, motorized);
  }

  /**
   * Prints a description on the console. Overrides Vehicle's printDescription.
   */
  public void printDescription() {
    super.printDescription();
    System.out.println(" and it is a bicycle.");
  }

  /**
   * Sets the serial number. Overrides Vehicle's setSerialNumber(int)-method.
   * 
   * @param serialNumber
   *          the serial number to set. Must not be more than 5 digits.
   */
  public void setSerialNumber(int serialNumber) {
    if (serialNumber > 99999) {
      System.out.println("The serial number must not be longer than 5 digits.");
    }
    else {
      super.setSerialNumber(serialNumber);
      System.out.println("The serial number has been correctly set.");
    }
  }
}
