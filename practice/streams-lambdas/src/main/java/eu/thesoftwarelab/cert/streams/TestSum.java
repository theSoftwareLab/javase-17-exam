package eu.thesoftwarelab.cert.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author mgeorgopoulos
 */
public class TestSum {

  public static void main(String[] args) {
    List<Double> grades = new ArrayList<>(List.of(5.50, 6.00, 7.00));
    double sumDouble = grades.stream().mapToDouble(g -> g).sum();
    int sumInt = grades.stream().mapToInt(Double::intValue).sum();
    System.out.println(sumDouble + " " + sumInt);

    IntStream intStream = IntStream.range(1, 5);
    double avg = intStream.average().getAsDouble();
    System.out.println(avg);
  }

}
