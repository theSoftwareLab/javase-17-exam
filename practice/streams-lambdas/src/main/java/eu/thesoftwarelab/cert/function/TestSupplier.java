package eu.thesoftwarelab.cert.function;

import java.util.function.Supplier;

/**
 * @author mgeorgopoulos
 */
public class TestSupplier {

  public static void main(String[] args) {
    Supplier<String> supplier = () -> getString();
    String result = supplier.get();
  }

  private static String getString() {
    return "Hello World!!";
  }

}
