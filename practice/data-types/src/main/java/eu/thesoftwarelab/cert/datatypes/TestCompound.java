package eu.thesoftwarelab.cert.datatypes;

/**
 * @author mgeorgopoulos
 */
public class TestCompound {

    public static void main(String[] args) {
        int i = 1;
        i += (i = 2) * (i + 5);
        System.out.println(i);
    }

}
