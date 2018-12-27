package task1;

/**
 * Motorcycle is a subclass of Vehicle.
 */
public class Motorcycle extends Vehicle {

  public Motorcycle(String owner, int serialNumber, boolean motorized) {
    super(owner, serialNumber, motorized);
  }

  /**
   * Prints a description on the console. Overrides Vehicle's printDescription.
   */
  public void printDescription() {
    super.printDescription();
    System.out.println(" and it's a motorcycle.");
  }

  public void burnout() {
    System.out.println("My tires are melting!");
  }
}
