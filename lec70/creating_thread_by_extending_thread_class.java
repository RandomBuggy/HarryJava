// by extending thread class

class MyThread1 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Thread 1 is running...");
        }
    }
}



class MyThread2 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Thread 2 is running...");
        }
    }
}

public class creating_thread_by_extending_thread_class {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}

