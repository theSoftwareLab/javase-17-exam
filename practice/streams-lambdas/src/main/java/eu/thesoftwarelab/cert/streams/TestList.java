package eu.thesoftwarelab.cert.streams;

import java.util.Arrays;
import java.util.List;

/**
 * @author Emmanouil Georgopoulos
 */
class TestList {

    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3);
        ints.forEach(x -> x = x + 1);
        ints.forEach(System.out::println);

        List<Integer> ints2 = Arrays.asList(1, 2, 3);
        ints2.stream().map(x -> x = x + 1).forEach(System.out::println);
        ints2.forEach(System.out::println);
    }

}
