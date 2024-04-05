import java.util.LinkedList;

class ProducerConsumer {
    private LinkedList<Integer> buffer = new LinkedList<>();
    private final int capacity = 5;

    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (buffer) {
                while (buffer.size() == capacity)
                    buffer.wait();

                System.out.println("Producer produced: " + value);
                buffer.add(value++);
                buffer.notifyAll();

                Thread.sleep(1000);
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (buffer) {
                while (buffer.isEmpty())
                    buffer.wait();

                int consumedValue = buffer.removeFirst();
                System.out.println("Consumer consumed: " + consumedValue);
                buffer.notifyAll();

                Thread.sleep(1000);
            }
        }
    }
}

public class pr30_1 {
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();

        Thread producerThread = new Thread(() -> {
            try {
                pc.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                pc.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}


/*
 Output : 
    Producer produced: 0
    Producer produced: 1
    Producer produced: 2
    Producer produced: 3
    Producer produced: 4
    Consumer consumed: 0
    Consumer consumed: 1
    Consumer consumed: 2
    Consumer consumed: 3
    Consumer consumed: 4
    Producer produced: 5
    Producer produced: 6
    Producer produced: 7
    Producer produced: 8
    Producer produced: 9
    Consumer consumed: 5
    Consumer consumed: 6
    Consumer consumed: 7
    Consumer consumed: 8
    Consumer consumed: 9
    Producer produced: 10
    Producer produced: 11
    Producer produced: 12
 */