import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class Connection {
    // Mocked Connection class

    public Connection(){
        System.out.println("Hey, Connection Established!");
    }
}
public class ConnectionPool {
    private static ConnectionPool instance;
    private BlockingQueue<Connection> pool;
    private static final int POOL_SIZE = 5;

    private ConnectionPool() {
        pool = new LinkedBlockingQueue<>(POOL_SIZE);
        for (int i = 0; i < POOL_SIZE; i++) {
            pool.add(new Connection());
        }
    }

    public static synchronized ConnectionPool getInstance() {
        if (instance == null) {
            instance = new ConnectionPool();
        }
        return instance;
    }

    public Connection getConnection() throws InterruptedException {
        return pool.take();
    }

    public void releaseConnection(Connection connection) {
        pool.offer(connection);
    }
}