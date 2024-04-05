class MyRunnable implements Runnable {
    public void run() {
        System.out.println("t1 is running");
    }
}

class MyRunnable2 implements Runnable {
    public void run() {
        System.out.println("t2 is running");
    }
}

public class thread_type2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        Thread t2 = new Thread(new MyRunnable2());
        
        t1.start();
        t2.start();
    }
}
