import java.util.List;

public class Ant {

  private static Crumb[] heapOfCrumbs;
  private List<Crumb> loadedUpCrumbs;
  private float liftingForce;

  public Ant() {
    loadedUpCrumbs = new java.util.ArrayList<Crumb>();
    liftingForce = 30;
    Ant.strewCrumbs();
  }

  public Crumb[] getHeapOfCrumbs() {
    return heapOfCrumbs;
  }

  public static void strewCrumbs() {
    java.util.Random r = new java.util.Random();
    heapOfCrumbs = new Crumb[10];
    for (int i = 0; i < heapOfCrumbs.length; i++) {
      float weight = r.nextInt(10) + 1;
      float calories = r.nextInt(10) + 1;
      heapOfCrumbs[i] = new Crumb(weight, calories);
    }
  }

  public void sortHeapOfCrumbs() {
    // Task: sort these crumbs according the proportion in descending order
    int positionOfBiggest;
    for (int outerPosition = 0; outerPosition < heapOfCrumbs.length; outerPosition++) {
      positionOfBiggest = outerPosition;
      for (int innerPosition = outerPosition + 1; innerPosition < heapOfCrumbs.length; innerPosition++) {
        if (heapOfCrumbs[innerPosition].getProportion() > heapOfCrumbs[positionOfBiggest].getProportion()) {
          positionOfBiggest = innerPosition;
        }
      }
      swapCrumbs(outerPosition, positionOfBiggest);
    }
  }

  private void swapCrumbs(int a, int b) {
    Crumb temp = heapOfCrumbs[a];
    heapOfCrumbs[a] = heapOfCrumbs[b];
    heapOfCrumbs[b] = temp;
  }

  public List<Crumb> loadUp() {
    sortHeapOfCrumbs();

    float sum = 0;
    loadedUpCrumbs.add(heapOfCrumbs[0]);
    sum += heapOfCrumbs[0].getWeight();

    for (int i = 1; i < heapOfCrumbs.length; i++) {
      if (sum + heapOfCrumbs[i].getWeight() <= liftingForce) {
        loadedUpCrumbs.add(heapOfCrumbs[i]);
        sum += heapOfCrumbs[i].getWeight();
      }
    }

    System.out.println("Run ant, run!");

    return loadedUpCrumbs;

  }

}