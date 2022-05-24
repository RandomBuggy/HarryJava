import java.io.FileWriter;
import java.io.IOException;

class MyDepracated {
    @Deprecated
    public void method() {
        System.out.println("I am Deprecated method");
    }
}
interface MyInterface {
    void display();
}
public class practice_set_16 {
    public static void main(String[] args) {
        System.out.println("");
        // problem 1
        // generate javadoc - with intellijIdea and with the `javadoc` command
        // problem 2
        MyDepracated dep = new MyDepracated();
        // problem 3
        // @SuppressWarnings
        dep.method();
        // problem 4
        MyInterface instance = new MyInterface() {
            @Override
            public void display() {
                System.out.println("I am display");
            }
        };
        // problem 5
        int i = 5;
        String table = "";
        for (int j=1; j <= 10; j++) {
            table += i + " X " + j + " = " + (i*j);
            table += '\n';
            try {
                FileWriter writer = new FileWriter("./myfile.txt");
                writer.write(table);
                writer.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
