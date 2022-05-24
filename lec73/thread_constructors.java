class CustomThread extends Thread {

    public CustomThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thank You");
        // while (false) {
        //     System.out.println("I am a thread");
        // }
    }
}
public class thread_constructors {
    public static void main(String[] args) {
        // 1. constructor();
        // 2. constructor(String name);
        // 3. constructor(Runnable r, String name)
        // 4. constructor(Runnable r)
        CustomThread t1 = new CustomThread("t1");
        CustomThread t2 = new CustomThread("t2");
        t1.start();
        t2.start();
        System.out.println("Current Thread ID : " + t1.getId());
        System.out.println("Current Thread Name : " + t1.getName());
        System.out.println("Current Thread ID : " + t2.getId());
        System.out.println("Current Thread Name : " + t2.getName());
    }
}

