public class pr25_1
 {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();

        System.out.println("Main thread name: " + mainThread.getName());
        System.out.println("Main thread priority: " + mainThread.getPriority());
        System.out.println("Main thread ID: " + mainThread.getId());
        System.out.println("Main thread state: " + mainThread.getState());
        System.out.println("Main thread is alive: " + mainThread.isAlive());
    }
}