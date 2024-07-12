package eu.thesoftwarelab.cert.exceptions;

/**
 * @author Emmanouil Georgopoulos
 */
public class TestCatch {

    public static void main(String[] args) {
        testCatchException();
        testCatchCheckedException();
    }

    private static void testCatchException() {
        try {
            // do nothing
        } catch (Exception e) {
            // compiles OK
        }
    }

    private static void testCatchCheckedException() {
        // below code does not compile. The catch block is unreachable when
        // the checked exception cannot be thrown in the try block
//        try {
//            // do nothing
//        } catch (IOException ioe) {
//        }
    }

}
