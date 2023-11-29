class SharedResource {
    
    private boolean flag = false;

    
    public synchronized void setFlag() {
        this.flag = true;
        System.out.println("Flag set to true");
        notify(); 
    }

    
    public synchronized void checkFlag() throws InterruptedException {
        while (!flag) {
            System.out.println("Waiting for flag to be set...");
            wait(); 
        }
        System.out.println("Flag is now true");
    }
}

class SleepThread extends Thread {
    private SharedResource sharedResource;

    public SleepThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000); 
            sharedResource.setFlag();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class WaitThread extends Thread {
    private SharedResource sharedResource;

    public WaitThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        try {
            sharedResource.checkFlag();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class sleepandwait {

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        SleepThread sleepThread = new SleepThread(sharedResource);
        WaitThread waitThread = new WaitThread(sharedResource);

        sleepThread.start();
        waitThread.start();
    }
}
