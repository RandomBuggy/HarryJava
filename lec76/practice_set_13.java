// practice problem 1
class Thrd extends Thread {
    public Thrd(String name) {
        super(name);
    }
    @Override
    public void run() {
        while (true) {
            // practice problem 2
            try {
                Thread.sleep(0);
            }
            catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(this.getName());
        }
    }
}

public class practice_set_13 {
    public static void main(String[] args) {
        Thrd t1 = new Thrd("Good Morning");
        Thrd t2 = new Thrd("Welcome");

        // practice problem 3
        t1.setPriority(6);
        t2.setPriority(9);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        // practice problem 4
        System.out.println(t1.getState());
        System.out.println(t2.getState());

        // practice problem 5
        System.out.println(Thread.currentThread());

        // t1.start();
        // t2.start();
    }
}

