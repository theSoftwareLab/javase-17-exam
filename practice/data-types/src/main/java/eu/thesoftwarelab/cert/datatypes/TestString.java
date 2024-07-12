package eu.thesoftwarelab.cert.datatypes;

/**
 * @author Emmanouil Georgopoulos
 */
class TestString {
    public static void main(String[] args) {
        String sub = "Hello".substring(5);
        System.out.println(sub);

        String subOutOfBoundsException = "Hello".substring(6);
    }
}
