package eu.thesoftwarelab.cert.fc;

/**
 * This class shows a usage of labels for loops.
 *
 * @author Manolis Georgopoulos
 */
class TestLabels {

    public static void main(String[] args) {
        outer:
        for (var i = 0; i < 5; i++) {
            System.out.printf("i: %d \n", i);
            inner:
            for (var j = 0; j < 5; j++) {
                if (i == j) {
                    break inner;
                }
                System.out.printf("j: %d \n", j);
            }
        }
    }


}
