package scheduler;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Service {
    private final ScheduledExecutorService scheduler =
            Executors.newScheduledThreadPool(1);

    public void doSomethingPeriodically(){
        System.out.println("Let's do this!");

        final Runnable doSomethingPeriodically = this::doSomethingPeriodically;

        final ScheduledFuture<?> doSomethingHandler =
                scheduler.scheduleAtFixedRate(doSomethingPeriodically, 10, 10, SECONDS);

    }
}
