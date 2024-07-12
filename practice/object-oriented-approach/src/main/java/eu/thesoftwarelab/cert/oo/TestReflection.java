package eu.thesoftwarelab.cert.oo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author mgeorgopoulos
 */
public class TestReflection {

  public static void main(String[] args)
      throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    Method test = TestReflection.class.getMethod("test");
    Object result = test.invoke(null);
    System.out.println(result == Boolean.TRUE);
    System.out.println(result.equals(Boolean.TRUE));
  }

  public static boolean test() {
    return true;
  }

}
