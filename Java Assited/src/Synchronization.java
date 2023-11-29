class SharedResource {
    private int count = 0;

    // Synchronized method to increment the count
    public synchronized void increment() {
        for (int i = 0; i < 5; i++) {
            count++;
            System.out.println(Thread.currentThread().getName() + ": Count = " + count);
        }
    }
}

class MyThread extends Thread {
    private SharedResource sharedResource;

    public MyThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        sharedResource.increment();
    }
}

public class Synchronization {

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        // Creating two threads sharing the same resource
        Thread thread1 = new MyThread(sharedResource);
        Thread thread2 = new MyThread(sharedResource);

        // Starting the threads
        thread1.start();
        thread2.start();
    }
}
