package eu.thesoftwarelab.cert.security;

import java.io.FileWriter;
import java.io.IOException;
import java.security.AccessController;
import java.security.PrivilegedAction;

/**
 * @author mgeorgopoulos
 */
public class TestPrivilegedScope {

  public static void main(String[] args) {
    AccessController.doPrivileged((PrivilegedAction<String>) () -> {
      // privileged scope to write to a file without Security Manager checking permissions for the stack frame.
      try (FileWriter writer = new FileWriter("test.txt")) {
        writer.write("message");
      } catch (IOException e) {
        e.printStackTrace();
      }
      return "OK";
    });
  }

}
