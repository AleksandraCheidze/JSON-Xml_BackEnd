package lesson_5.task_2;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import lesson_5.task_01.Cat;

public class CatLoad {

  public static void main(String[] args) {
    try {
      File file = new File("cat.json");

      ObjectMapper mapper = new ObjectMapper();
      lesson_5.task_01.Cat cat = mapper.readValue(file, Cat.class);

      System.out.println(cat);
    }catch (Exception e){
      System.out.println(e.getMessage());
    }
  }

}
