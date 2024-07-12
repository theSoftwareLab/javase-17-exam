package eu.thesoftwarelab.cert.collections;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestCollectors {

    public static void main(String[] args) {
        Collectors.joining("test");

        IntStream intStream = IntStream.range(1, 5);
        double avg = intStream.boxed().collect(Collectors.averagingInt(i->i));
        System.out.println(avg);
    }

}
