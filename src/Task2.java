// Name: Sultan Ali Alhasani
// ID:   444004481

class MyThread_2 implements Runnable {
    public void run() {
        System.out.println("Task is running. Thread: " + 
            Thread.currentThread().getName());
    }
}

public class Task2 {
    public static void main(String[] args) {
        MyThread_2 task = new MyThread_2();
        Thread t1 = new Thread(task, "RunnableThread");
        t1.start();
    }
}
