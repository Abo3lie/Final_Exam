// Name: Sultan Ali Alhasani
// ID:   444004481

class SharedResource {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}

class MyThread_4 extends Thread {
    SharedResource resource;

    MyThread_4(SharedResource res) {
        this.resource = res;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            resource.increment();
        }
    }
}

public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        SharedResource resource = new SharedResource();
        Thread t1 = new MyThread_4(resource);
        Thread t2 = new MyThread_4(resource);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final Count: " + resource.getCount());
    }
}
