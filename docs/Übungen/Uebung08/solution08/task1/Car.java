package task1;

/**
 * Car is a subclass of a Vehicle.
 */
public class Car extends Vehicle {

	int numOfSeats;
  public Car(String owner, int serialNumber, boolean motorized, int numOfSeats) {
    super(owner, serialNumber, motorized);
    setNumOfSeats(numOfSeats);
  }

  /**
   * Prints a description on the console. Overrides Vehicle's printDescription.
   */
  public void printDescription() {
	  super.printDescription();
	    String doors = numOfSeats == 1 ? " door" : " doors";
	    System.out.println(" and it s a car with " + numOfSeats + doors + ".");
  }
  
  public int getNumOfSeats() {
	  return numOfSeats;
  }
  
  public void setNumOfSeats(int numOfSeats) {
	  this.numOfSeats = numOfSeats;
  }
}
