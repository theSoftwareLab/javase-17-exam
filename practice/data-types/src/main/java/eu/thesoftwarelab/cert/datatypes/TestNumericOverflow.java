package eu.thesoftwarelab.cert.datatypes;

/**
 * Test Numeric overflow.
 *
 * @author mgeorgopoulos
 */
public class TestNumericOverflow {

  public static void main(String[] args) {
    int i1 = Integer.MIN_VALUE;
    int i2 = -Integer.MIN_VALUE;
    int i3 = Integer.MAX_VALUE + 1;
    System.out.println(i1==i2);
    System.out.println(i1==i3);
  }

}
