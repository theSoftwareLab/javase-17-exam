package eu.thesoftwarelab.cert.fc;

/**
 * This class shows a simple usage of do-while.
 *
 * @author Manolis Georgopoulos
 */
class TestDoWhile {

    public static void main(String[] args) {
        // do-while executes at least once. this is not true for normal while
        var x = 1;
        do {
            System.out.println(x);
        } while (x < 0);

        var y = 1;
        while (y < 0) {
            System.out.println(y);
        }
    }

}
