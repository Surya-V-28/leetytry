
class SharedValues {

    public int aLock = 1;
    int a = 5;
    int b = 0;
    int c = 2;
}

public class EmployeeDAO {

    public static void main(String[] args) {
        SharedValues sharedValues = new SharedValues();

        Thread thread0 = new Thread() {
            public void run() {
                while (true) {
                    while (sharedValues.aLock <= 0) {
                        --sharedValues.aLock;
                    }

                    if (sharedValues.a != 0) {
                        sharedValues.b = sharedValues.c / sharedValues.a;
                    }

                    ++sharedValues.aLock;

                    System.out.println("a = " + sharedValues.a);
                }
            }
        };

        Thread thread1 = new Thread() {
            public void run() {
                for (int i = 5; i >= 0; --i) {
                    while (sharedValues.aLock <= 0) {
                        --sharedValues.aLock;
                    }

                    sharedValues.a = i;

                    ++sharedValues.aLock;

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException exception) {
                        throw new RuntimeException(exception);
                    }
                }
            }
        };

        thread0.start();
        thread1.start();

        try {
            thread0.join();
            thread1.join();
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }
}
