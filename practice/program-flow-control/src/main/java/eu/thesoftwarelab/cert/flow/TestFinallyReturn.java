package eu.thesoftwarelab.cert.flow;

/**
 * This program shows a usage of finally block.
 *
 * @author Manolis Georgopoulos
 */
public class TestFinallyReturn {

    public static void main(String[] args) {
        System.out.println(getValue());
    }

    private static int getValue() {
        try {
            return 1;
        } finally {
            return 2;
        }
    }
}
