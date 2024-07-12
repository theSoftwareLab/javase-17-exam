package eu.thesoftwarelab.cert.datatypes;

/**
 * This class shows various examples related to operator precedence and expression evaluation.
 * @author Manolis Georgopoulos
 */
class TestOperatorPrecedence {

    public static void main(String[] args) {
        TestOperatorPrecedence op = new TestOperatorPrecedence();
        op.testPrecedence();
        op.testPrecedence2();
        op.testPrecedence3();
    }

    private void testPrecedence() {
        int k = 1;
        boolean b = k-- > 0;
        System.out.println("k-- > 0 = " + b);
    }

    private void testPrecedence2() {
        int a = 0;
        if (a++ == a++) {
            System.out.println("a++ == a++ true");
        } else {
            System.out.println("a++ == a++ false");
        }
    }

    private void testPrecedence3() {
        boolean a = false, b = false, c = false, d = false;
        boolean expression = (a = false) || (b = true) || (c = false) && (d = true);
        System.out.println("expression = " + expression);
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
    }

}
