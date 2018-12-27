class Crumb {
  private float weight;
  private float calories;

  public Crumb(float weight, float calories) {
    this.weight = weight;
    this.calories = calories;
  }

  public float getWeight() {
    return weight;
  }

  public float getCalories() {
    return calories;
  }

  public float getProportion() {
    return calories / weight;
  }
}