import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class file_handling {
    public static void main(String[] args) {
        System.out.println("");
        /* use File class 
         * to create a new file use : createNewFile() method
         * use FileWriter class
         * to write to a file use : write() method
         * use both File and Scanner class
         * to read from a file use : nextLine() method
         */
        try {
            File myFile = new File("./file_path.txt");
            myFile.createNewFile();
        }
        catch (Exception e) {
            System.out.println("Unable to create the file");
            e.printStackTrace();
        }

        try {
            FileWriter Fwriter = new FileWriter("./file_path.txt");
            Fwriter.write("this is our first file from this java course\nOk bye now.\nTaTa\nHi\t\n");
            Fwriter.close();
        }
        catch (Exception e) {
            System.out.println("Write Error");
            e.printStackTrace();
        }
        try {
            File readFile = new File("./file_path.txt");
            Scanner sc = new Scanner(readFile);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        // deleting file
        try {
            File delFile = new File("./file_path.txt");
            if (delFile.delete()) {
                System.out.println(delFile.getName() + " : deletion successful");
            }
            else {
                System.out.println("Error : deletion failed!");
            }
        }
        catch (Exception e) {
        }
    }
}

