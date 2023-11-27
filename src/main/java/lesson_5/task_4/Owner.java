package lesson_5.task_4;

import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "owner")
@XmlAccessorType(XmlAccessType.FIELD)
public class Owner {

  @XmlAttribute(name = "first_name")
  private String name;
  @XmlElement(name = "cellphone")
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
