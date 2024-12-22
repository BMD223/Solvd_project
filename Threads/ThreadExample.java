public class ThreadExample {
    public static void main(String[] args) {
        Runnable runnableTask = () -> {
            System.out.println("Runnable Task is running");
        };
        Thread thread1 = new Thread(runnableTask);
        thread1.start();
        Thread thread2 = new Thread() {
            public void run() {
                System.out.println("Thread Task is running");
            }
        };
        thread2.start();
    }
}