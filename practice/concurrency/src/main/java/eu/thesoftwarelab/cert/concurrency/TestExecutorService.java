package eu.thesoftwarelab.cert.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * This class shows various the available submit methods of {@link java.util.concurrent.ExecutorService}. <br/>
 * <code>Future<?> submit(Runnable task)</code>
 * Submits a Runnable task for execution and returns a Future representing that task.
 * <br/>
 * <code><T> Future<T> submit(Runnable task, T result)</code>
 * Submits a Runnable task for execution and returns a Future representing that task.
 * <br/>
 * <code><T> Future<T> submit(Callable<T> task)</code>
 * Submits a value-returning task for execution and returns a Future representing the pending results of the task.<br/>
 * @author Manolis Georgopoulos
 */
class TestExecutorService {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        var es = Executors.newSingleThreadExecutor();
        Future<?> f1 = es.submit(() -> { System.out.println("running 1"); }); // Runnable
        Future<String> f2 = es.submit(() -> { System.out.println("running 2"); }, "success"); // Runnable with result
        Future<Integer> f3 = es.submit(() -> { System.out.println("running 3"); return 100; }); // Callable

        Object f1Result = f1.get();
        String f2Result = f2.get();
        Integer f3Result = f3.get();
        es.shutdown();
    }

}
