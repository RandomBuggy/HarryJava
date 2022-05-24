class WxThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Thank You");
        }
    }
}
public class thread_methods {
    public static void main(String[] args) {
        System.out.println("");
        WxThread t1 = new WxThread();
        WxThread t2 = new WxThread();

        t1.start();


        try {
            t1.join(); // t2 thread wait until t1 thread ends
        }

        catch (Exception e) {
            System.out.println(e);
        }

        try {
            Thread.sleep(478);
        }

        catch (Exception e) {
            System.out.println(e);
        }

        t2.start();
    }
}

