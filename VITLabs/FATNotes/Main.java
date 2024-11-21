class NewThread implements Runnable {
    String name; // name of thread
    Thread t;

    // Constructor to initialize thread name and start it
    NewThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        t.start(); // Start the thread
    }

    // This is the entry point for thread.
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000); // Sleep for 1 second
            }
        } catch (Exception e) {
            System.out.println(name + " Interrupted");
        }
        System.out.println(name + " exiting.");
    }

    // Method to join the thread
    public void join() throws InterruptedException {
        t.join(); // Calls Thread's join method
    }
}

public class Main {
    public static void main(String args[]) {
        // Start threads
        NewThread t1 = new NewThread("One");
        NewThread t2 = new NewThread("Two");
        NewThread t3 = new NewThread("Three");

        try {
            // Wait for other threads to finish
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }

        System.out.println("Main thread exiting.");
    }
}
