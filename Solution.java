class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.run();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main: " + i);
        }
    }

    public static void Mains(String args[]){
        System.out.println("Working on the ANSWER ");
    }
}