class MyThread extends Thread {
    public void run() {
        int i=0;
        while (i<5) {
            System.out.println("t1 is running");
            i++;
        }
    }
}

public class pr26_1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        
        t1.start();
    }
}

/*
 output:
    t1 is running
    t1 is running
    t1 is running
    t1 is running
    t1 is running
 */