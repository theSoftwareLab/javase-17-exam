package eu.thesoftwarelab.cert.io;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Emmanouil Georgopoulos
 */
class TestPath {

  public static void main(String[] args) {
    testNames();
    testRelativize();
  }

  private static void testNames() {
    Path path = Paths.get("c:\\java\\TestPath.java");
    System.out.println(path.getRoot());
    System.out.println(path.getNameCount());
    System.out.println(path.getName(0));
    System.out.println(path.getName(1));
    // System.out.println(path.getName(2)); // IllegalArgumentException
  }

  private static void testRelativize() {
    Path p1 = Paths.get("x\\y");
    Path p2 = Paths.get("z");
    Path p3 = p1.relativize(p2);
    System.out.println(p3);
  }

}
