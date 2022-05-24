/**
 * this is class description
 */
public class doctags_for_method {
    /**
     * @param args arguments supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("I am main method");
    }
    /**
     * this is the method and this line is demo description
     * @param i first argument
     * @param j second argument
     * @return i+j
     * @throws Exception if i is 0
     * @deprecated This method is deprecated. Please use + operator
     */
    public static int add(int i, int j) throws Exception {
        if (i==0) {
            throw new Exception();
        }
        return i+j;
    }
}

