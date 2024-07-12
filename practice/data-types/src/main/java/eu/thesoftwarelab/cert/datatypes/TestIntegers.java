package eu.thesoftwarelab.cert.datatypes;

/**
 * @author Emmanouil Georgopoulos
 */
class TestIntegers {

    public static void main(String[] args) {

        int i = 1;
        int j = i++;
        System.out.println(j);

        Integer i1 = new Integer(1_000_000);
        int i2 = 1_000_000;
        System.out.println(i1 == i2);

        Double d1 = 1_000_000.0;
        System.out.println(d1 == i2);

        System.out.println(1.0 == 1);
    }

}
