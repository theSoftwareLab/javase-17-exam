package eu.thesoftwarelab.cert.exceptions;

/**
 * @author Emmanouil Georgopoulos
 */
public class TestThrow {

    public static void main(String[] args) {
        testRuntimeException();
        testCheckedException();
    }

    private static void testRuntimeException() {
        RuntimeException runtimeException = null;
        throw runtimeException;
    }

    private static void testCheckedException() {
        Exception checkedException = null;
//        throw checkedException; // COMPILE ERROR
    }

}
