public class thread_type3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                System.out.println("t1 is running");
            }
        });
        
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                System.out.println("t2 is running");
            }
        });
        
        t1.start();
        t2.start();
    }
}
