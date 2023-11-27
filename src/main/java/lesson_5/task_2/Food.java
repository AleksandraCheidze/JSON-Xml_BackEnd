package lesson_5.task_2;

import java.util.Objects;

public class Food {

  private String label;
  private int requiredQuantity;

  public Food(String label, int requiredQuantity) {
    this.label = label;
    this.requiredQuantity = requiredQuantity;
  }

  public String getLabel() {
    return label;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Food)) {
      return false;
    }
    Food food = (Food) o;
    return requiredQuantity == food.requiredQuantity && Objects.equals(label, food.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, requiredQuantity);
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public int getRequiredQuantity() {
    return requiredQuantity;
  }

  public void setRequiredQuantity(int requiredQuantity) {
    this.requiredQuantity = requiredQuantity;
  }

  public Food() {
  }

  @Override
  public String toString() {
    return String.format("Label - %s, required quantity - %d", label, requiredQuantity);
  }
}
