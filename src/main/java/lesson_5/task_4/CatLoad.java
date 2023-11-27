package lesson_5.task_4;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;


public class CatLoad {

  public static void main(String[] args) {
    try {
      File file = new File("cat.xml");

      JAXBContext context = JAXBContext.newInstance(Cat.class);
      Unmarshaller unmarshaller = context.createUnmarshaller();
      Object cat = unmarshaller.unmarshal(file);
      System.out.println(cat);

    }catch (Exception e){
      System.out.println(e.getMessage());
    }
  }

}
