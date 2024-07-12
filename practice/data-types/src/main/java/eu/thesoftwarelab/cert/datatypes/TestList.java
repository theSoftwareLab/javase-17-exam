package eu.thesoftwarelab.cert.datatypes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mgeorgopoulos
 */
public class TestList {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(0);
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    Integer removedElement = list.remove(1); // E List.remove(int index);
    boolean result = list.remove(Integer.valueOf(4)); // boolean remove(Object o);
  }

}
