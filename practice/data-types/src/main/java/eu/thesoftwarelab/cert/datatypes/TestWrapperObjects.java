package eu.thesoftwarelab.cert.datatypes;

/**
 * @author mgeorgopoulos
 */
public class TestWrapperObjects {

  public static void main(String[] args) {
    short s = 10;
    Short s1 = new Short(s);
    Short s2 = s;
    Short s3 = Short.valueOf("10");

    testCaching();
  }

  private static void testCaching() {
    Integer i1 = 100;
    Integer i2 = 100;
    System.out.println(i1.equals(i2));
    System.out.println(i1 == i2); // false because i3 and i4 point to same objects (due to caching)

    Integer i3 = 1_000;
    Integer i4 = 1_000;
    System.out.println(i3.equals(i4));
    System.out.println(i3 == i4); // false because i3 and i4 point to different objects
  }


}
