package eu.thesoftwarelab.cert.arrays;

import java.util.Arrays;

/**
 * @author mgeorgopoulos
 */
class TestArray {

  public static void main(String[] args) {
    int[] a = new int[10];
    boolean[] b = new boolean[10];
    char[] c = new char[10];
    String[] d = new String[10];
    int[] aShallowCopy = a.clone();

    System.out.println(a.getClass().getName() + ", " + a.getClass().getSuperclass().getName());
    System.out.println(aShallowCopy.getClass().getName() + ", " + aShallowCopy.getClass().getSuperclass().getName());
    System.out.println(b.getClass().getName() + ", " + b.getClass().getSuperclass().getName());
    System.out.println(c.getClass().getName() + ", " + c.getClass().getSuperclass().getName());
    System.out.println(d.getClass().getName() + ", " + d.getClass().getSuperclass().getName());

    compare();
  }

  private static void compare() {
    int[] a1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] a2 = {0, 1, 2, 3};
    int[] a3 = {0, 1, 2, 5};
    System.out.println(Arrays.compare(a1, a2)); // compares array lengths
    System.out.println(Arrays.compare(a1, a3)); // compares 3 with 5

    System.out.println(Arrays.mismatch(a1, a2));
    System.out.println(Arrays.mismatch(a1, a3));
  }

}
