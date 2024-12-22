import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ConnectionPoolFutureTest {
    public static void main(String[] args) {
        ConnectionPool pool = ConnectionPool.getInstance();
        ExecutorService executor = Executors.newFixedThreadPool(7);
        Future<?>[] futures = new Future<?>[7];
        for (int i = 0; i < 7; i++) {
            futures[i] = executor.submit(() -> {
                try {
                    Connection connection = pool.getConnection();
                    System.out.println(Thread.currentThread().getName() + " acquired a connection");
                    Thread.sleep(2000); 
                    pool.releaseConnection(connection);
                    System.out.println(Thread.currentThread().getName() + " released a connection");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        for (Future<?> future : futures) {
            try {
                future.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Using CompletionStage
        CompletableFuture<Void>[] stages = new CompletableFuture[7];
        for (int i = 0; i < 7; i++) {
            stages[i] = CompletableFuture.runAsync(() -> {
                try {
                    Connection connection = pool.getConnection();
                    System.out.println(Thread.currentThread().getName() + " acquired a connection");
                    Thread.sleep(2000); 
                    pool.releaseConnection(connection);
                    System.out.println(Thread.currentThread().getName() + " released a connection");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, executor);
        }

        CompletableFuture.allOf(stages).join();

        executor.shutdown();
    }
}