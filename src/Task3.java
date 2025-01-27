// Name: Sultan Ali Alhasani
// ID:   444004481

class MyThread_3 extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread running: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Task3 {
    public static void main(String[] args) {
        MyThread_3 thread = new MyThread_3();
        thread.start();
    }
}
