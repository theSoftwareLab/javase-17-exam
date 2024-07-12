package eu.thesoftwarelab.cert.concurrency;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * @author mgeorgopoulos
 */
public class TestScheduledExecutorService {

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    ScheduledExecutorService scheduledEx = Executors.newScheduledThreadPool(5);
    System.out.println(LocalDateTime.now());

    // one shot task
    ScheduledFuture<?> f1 = scheduledEx.schedule(
        () -> System.out.println(LocalDateTime.now() + " Runnable 1 after 30 seconds"), 30,
        TimeUnit.SECONDS);

    // one shot task
    ScheduledFuture<Long> f2 = scheduledEx.schedule(() -> {
      System.out.println(LocalDateTime.now() + " Callable 1 after 5 seconds");
      return 0L;
    }, 5, TimeUnit.SECONDS);

    // periodic task at fixed rate
    Runnable runnableAtFixedRate = () -> {
      System.out.println(LocalDateTime.now() + " Runnable FixedRate");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    };
    ScheduledFuture<?> f3 = scheduledEx.scheduleAtFixedRate(runnableAtFixedRate, 1, 5,
        TimeUnit.SECONDS);

    // periodic task with fixed delay
    Runnable runnableWithFixedDelay = () -> {
      System.out.println(LocalDateTime.now() + " Runnable FixedDelay");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }

    };
    ScheduledFuture<?> f4 = scheduledEx.scheduleWithFixedDelay(runnableWithFixedDelay, 1, 5,
        TimeUnit.SECONDS);

    Object f1Result = f1.get();
    Long f2Result = f2.get();

    scheduledEx.shutdown();
  }

}
