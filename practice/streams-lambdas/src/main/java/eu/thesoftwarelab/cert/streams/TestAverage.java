package eu.thesoftwarelab.cert.streams;

import java.util.stream.IntStream;

/**
 * @author mgeorgopoulos
 */
public class TestAverage {

  public static void main(String[] args) {
    IntStream intStream = IntStream.range(1, 5);
    double avg = intStream.average().getAsDouble();
    System.out.println(avg);
  }

}
