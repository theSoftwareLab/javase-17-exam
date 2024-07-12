package eu.thesoftwarelab.cert.datatypes;

/**
 * @author mgeorgopoulos
 */
public class TestAutoboxing {

    public static void main(String[] args) {
        Integer i1 = 4;
        Long l1 = 5L;
        System.out.println(6+""); // 6 is first boxed into an Integer object and then Integer object is used to produce String "6"
    }

}
