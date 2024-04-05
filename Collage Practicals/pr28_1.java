class MyThread1 extends Thread {
    public synchronized void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("t1 is running");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    public synchronized void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("t2 is running");
            i++;
        }
    }
}

public class pr28_1 {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        
        t1.start();
        t1.join(); // Wait for t1 to complete before starting t2
        t2.start();
    }
}

/*
 Output : 
    t1 is running
    t1 is running
    t1 is running
    t1 is running
    t1 is running
    t1 is running
    t1 is running
    t1 is running
    t1 is running
    t1 is running
    t2 is running
    t2 is running
    t2 is running
    t2 is running
    t2 is running
    t2 is running
    t2 is running
    t2 is running
    t2 is running
    t2 is running
 */