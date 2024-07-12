package eu.thesoftwarelab.cert.collections;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * This class explores the API of Deque interface.
 */
class TestDeque {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        // *** Queue methods ***
        deque.add(1);
        deque.offer(2);
        deque.offerFirst(0);
        deque.offerLast(3);
        deque.remove();
        deque.poll();
        deque.element();
        deque.peek();

        // *** Stack methods ***
        deque.push(1);
        deque.pop();
        deque.peek();
    }

}
