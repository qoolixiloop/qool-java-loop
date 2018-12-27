public class Car {
  String make;
  String model;
  double speed = 0.0;

  public Car(String make_, String model_) {
    make = make_;
    model = model_;
  }

  public void increaseSpeed() {
    speed += 1;
  }

  public void reduceSpeed() {
    speed -= 1;
  }

}
