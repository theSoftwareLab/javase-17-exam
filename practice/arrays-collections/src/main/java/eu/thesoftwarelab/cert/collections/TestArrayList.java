package eu.thesoftwarelab.cert.collections;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author mgeorgopoulos
 */
public class TestArrayList {

  public static void main(String[] args) {
    Stream<Integer> stream = Stream.iterate(0, i -> ++i).limit(1000000);
    List<Integer> list = stream.collect(Collectors.toList());
    System.out.println(list.getClass());
    System.out.println(list.size());
  }

}
