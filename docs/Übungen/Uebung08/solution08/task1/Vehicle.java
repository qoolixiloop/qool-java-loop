package task1;

/**
 * Represents a vehicle.
 */
public abstract class Vehicle {

  private String owner;
  private boolean motorized;
  private int serialNumber;

  public Vehicle(String owner, int serialNumber, boolean motorized) {
    setOwner(owner);
    setSerialNumber(serialNumber);
    setMotorized(motorized);
  }

  public int getSerialNumber() {
    return serialNumber;
  }

  public boolean isMotorized() {
    return motorized;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public void setMotorized(boolean motorized) {
    this.motorized = motorized;
  }

  public void setSerialNumber(int serialNumber) {
    this.serialNumber = serialNumber;
  }

  /**
   * Prints a description of this object on the console.
   */
  public void printDescription() {
    String motor = motorized ? "motorized" : "not motorized";
    System.out.print("This vehicle's owner's name is " + getOwner() + ", it's serial number is " + getSerialNumber() + " and it is " + motor);
  }

}
