package eu.thesoftwarelab.cert.oo;

import java.util.ArrayList;
import java.util.List;

/**
 * reference : <a href="https://stackoverflow.com/questions/4343202/difference-between-super-t-and-extends-t-in-java">super extends stackoverflow</a>
 *
 * @author mgeorgopoulos
 */
public class TestGenerics {

    public static void main(String[] args) {

        List<? extends Number> l1 = new ArrayList<Number>(); // Number extends Number
        List<? extends Number> l2 = new ArrayList<Integer>(); // Integer extends Number
        List<? extends Number> l3 = new ArrayList<Double>(); // Double extends Number

        List<? super Integer> l4 = new ArrayList<Integer>(); // Integer is a superclass of Integer
        List<? super Integer> l5 = new ArrayList<Number>(); // Number is a superclass of Integer
        List<? super Integer> l6 = new ArrayList<Object>(); // Object is a superclass of Integer

    }

}
