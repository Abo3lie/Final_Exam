// Name: Sultan Ali Alhasani
// ID:   444004481

class MyThread_1 extends Thread {
    public void run() {
        System.out.println("Thread is running. Name: " + getName());
    }
}

public class Task1 {
    public static void main(String[] args) {
        MyThread_1 t1 = new MyThread_1();
        t1.setName("MyFirstThread");
        t1.start();
    }
}
