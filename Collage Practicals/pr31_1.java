public class pr31_1 {
    static Object lock1 = new Object();
    static Object lock2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (true) {
                synchronized (lock1) {
                    System.out.println("Thread 1: Holding lock 1...");
                    try {
                        Thread.sleep(2000); // Sleep for 2 seconds
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread 1: Releasing lock 1...");
                }

                while (true) {
                    synchronized (lock2) {
                        System.out.println("Thread 1: Holding lock 2...");
                        break; // Exit the loop if lock2 is acquired
                    }
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                synchronized (lock2) {
                    System.out.println("Thread 2: Holding lock 2...");
                    try {
                        Thread.sleep(2000); // Sleep for 2 seconds
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread 2: Releasing lock 2...");
                }

                while (true) {
                    synchronized (lock1) {
                        System.out.println("Thread 2: Holding lock 1...");
                        break; // Exit the loop if lock1 is acquired
                    }
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}


/*
 Output : 
Thread 1: Holding lock 1...
Thread 2: Holding lock 2...
Thread 2: Releasing lock 2...
Thread 1: Releasing lock 1...
Thread 1: Holding lock 2...
Thread 2: Holding lock 1...
Thread 2: Releasing lock 2...
Thread 1: Releasing lock 1...
Thread 2: Holding lock 2...
Thread 1: Holding lock 1...
Thread 2: Releasing lock 2...
Thread 1: Releasing lock 1...
 */