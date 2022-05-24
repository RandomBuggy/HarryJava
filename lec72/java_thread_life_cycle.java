// thread life cycle 
// 1. new - instance of thread but not .start() merhod invoked
// 2. runnable - .start() merhod invoked but thread scheduler haven't selected it
// 3. running - thread scheduler selected it
// 4. non-runnable - thread is alive but not eligible to run
// 5. terminated - .run() merhod has exited

public class java_thread_life_cycle {
    public static void main(String[] args) {
        System.out.println("");
    }
}

