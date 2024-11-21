public class Welcome {
    public static void main(String[] args) {

        try {
            // Create thread0 to print "*"
            Thread thread0 = new Thread(() -> {
                try {
                    for (int i = 0; i < 5; ++i) {
                        System.out.println("*");
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    System.out.println("Thread 0 Interrupted");
                }
            });

            // Create thread1 to print "+"
            Thread thread1 = new Thread(() -> {
                try {
                    for (int i = 0; i < 5; ++i) {
                        Thread.sleep(1000);
                        System.out.println("+");
                    }
                } catch (InterruptedException e) {
                    System.out.println("Thread 1 Interrupted");
                }
            });

            // Start both threads
            thread0.start();
            thread1.start();

            // Join threads to ensure main waits for both threads to finish before exiting
            thread0.join();
            thread1.join();

        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
    }
}
