import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ConnectionPoolTest {
    public static void main(String[] args) {
        ConnectionPool pool = ConnectionPool.getInstance();
        ExecutorService executor = Executors.newFixedThreadPool(7);

        for (int i = 0; i < 7; i++) {
            executor.submit(() -> {
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

        executor.shutdown();
    }
}