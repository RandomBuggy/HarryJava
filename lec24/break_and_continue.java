public class break_and_continue {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println("Java is great!!");

            if (i == 3) {
                System.out.println("Ending the loop");
                break;
            }

            if (i == 2) {
                System.out.println("Skipping one iteration");
                continue;
            }

            System.out.println("Ending loop here");

            System.out.println("Starting while loop");

            while (i <= 12) {
                System.out.println("while loop");
                System.out.println(i);
                i++;

                if (i == 8) {
                    System.out.println("Skipping one iteration");
                    continue;
                }
            }

            System.out.println("Ending while loop");
            System.out.println("With do-while loop");

            int j = 0;
            do {
                j++;

                if (j == 13) {
                    System.out.println("Skipping one iteration");
                    continue;
                }

                System.out.println(j);
                System.out.println("Java is great");
            } while (j < 20);
        }
    }
}

