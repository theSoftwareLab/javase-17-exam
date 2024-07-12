package eu.thesoftwarelab.cert.datatypes;

/**
 * This class shows various examples related to numeric promotion.
 * Read <a href="https://docs.oracle.com/javase/specs/jls/se11/html/jls-5.html#jls-5.6">Numeric Contexts</a>
 *
 * @author Emmanouil Georgopoulos
 */
class TestNumericPromotion {

    public static void main(String[] args) {
        TestNumericPromotion numericPromotion = new TestNumericPromotion();
        numericPromotion.testUnaryNumericPromotion();
        numericPromotion.testBinaryNumericPromotion();
    }

    private void testUnaryNumericPromotion() {
        byte b = 1;
        byte b1 = ++b;
        int b2 = +b; // unary plus operator + promotes byte to int
        System.out.println("b: "+ b + ", b1: " + b1 + ", b2: " + b2);
    }

    private void testBinaryNumericPromotion() {
        int i1 = 1;
        double d1 = 2;
        double result1 = i1 * d1; // i1 is promoted to double

        int i2 = 1;
        long l2 = 2;
        long result2 = i2 * l2; // i1 is promoted to long

        byte b3 = 1;
        int i3 = 2;
        int result3 = b3 * i3; // b3 is promoted to int
    }

}
