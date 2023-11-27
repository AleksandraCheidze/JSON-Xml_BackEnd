package lesson_5.task_2;

import java.util.Objects;

public class Owner {

  private String name;
  private String phone;

  public Owner(String name, String phone) {
    this.name = name;
    this.phone = phone;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Owner)) {
      return false;
    }
    Owner owner = (Owner) o;
    return Objects.equals(name, owner.name) && Objects.equals(phone, owner.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, phone);
  }

  @Override
  public String toString() {
    return String.format("Owner: name - %s, phone number - %s.", name, phone);
  }

  public Owner() {
  }
}
