class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Thank You " + this.getName());
        }
    }
}

public class thread_priorities {
    public static void main(String[] args) {
        // in jvm :- 
        // java.lang.Thread
        // 1. thread scheduler maintains threads
        // 2. Ready Queue have ready-to-run threads :- T1, T2, T3, T4, T5, T6, T7, T8, T9
        // 3. three category priority :- min - 1, normal - 5, max - 10
        MyThread t1 = new MyThread("Harry-1 (least important)");
        MyThread t2 = new MyThread("Harry-2");
        MyThread t3 = new MyThread("Harry-3");
        MyThread t4 = new MyThread("Harry-4");
        MyThread t5 = new MyThread("Harry-5 (most important)");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
    }
}

