class MyThread extends Thread {
    public void run() {
        System.out.println("t1 is running");
    }
}

class MyThread2 extends Thread {
    public void run() {
        System.out.println("t2 is running");
    }
}

public class thread_type1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        
        t1.start();
        t2.start();
    }
}
