class MyThread extends Thread {
    public void run() {
        int i=0;
        while (i<10) {
            System.out.println("t1 is running");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        int i=0;
        while (i<10) {
            System.out.println("t2 is running");
            i++;
        }
    }
}

public class pr27_1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        
        t1.start();
        t2.start();
    }
}

/*
 output:
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
    t1 is running
    t1 is running
    t1 is running
    t1 is running
    t1 is running
    t2 is running
    t2 is running
    t2 is running
    t2 is running
 */