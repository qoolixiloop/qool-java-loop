package task1;

/**
 * Test driver for class Vehicle and it's subclasses.
 */
public class VehicleTest {

  public static void main(String[] args) {
    Vehicle[] list = new Vehicle[5];
    list[0] = new Motorcycle("Alice", 324565, true);
    list[1] = new Car("Anita", 213948213, true, 5);
    list[2] = new Bicycle("Michael", 39392, false);
    list[3] = new Bicycle("Hans", 23405234, false);
    list[4] = new Motorcycle("Peter", 35998, true);

    for (Vehicle vehicle : list) {
      vehicle.printDescription();
    }

    // person[0].burnout();
    // --> error: The method play() is undefined for the type Vehicle.
    // --> reason: burnout() is not a behavior (i.e. a method) that the vehicle object owns
    // --> solution: casting:
    Motorcycle motorcycle = (Motorcycle) list[0];
    motorcycle.burnout();
  }
}
