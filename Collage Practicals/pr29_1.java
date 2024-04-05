class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
    }
}

public class pr29_1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        // Set thread priorities
        t1.setPriority(Thread.MIN_PRIORITY); // Lowest priority
        t2.setPriority(Thread.MAX_PRIORITY); // Highest priority
        t3.setPriority(Thread.NORM_PRIORITY); // Normal priority

        // Start threads in the desired order
        t1.start();
        t2.start();
        t3.start();
    }
}

/*
 output :
    Thread-2 is running
    Thread-1 is running
    Thread-0 is running 
 */