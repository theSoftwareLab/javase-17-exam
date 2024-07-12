package eu.thesoftwarelab.cert.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Emmanouil Georgopoulos
 */
class TestAtomicInteger {

    static AtomicInteger ai = new AtomicInteger(0);

    public static void main(String[] args) {
        boolean updated = ai.compareAndSet(0, 1);
        System.out.println(updated + " " + ai.get());
    }

}
