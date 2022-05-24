class InvalidInputException extends Exception {
    @Override
    public String toString() {
        return "Cannot add 8 and 9";
    }
    @Override
    public String getMessage() {
        return "";
    }
}

class CannotDivideByZeroException extends Exception {
    @Override
    public String toString() {
        return "Cannot divide by zero";
    }
    @Override
    public String getMessage() {
        return "";
    }
}

class MaxInputException extends Exception {
    @Override
    public String toString() {
        return "Cannot not be greater than 100000";
    }
    @Override
    public String getMessage() {
        return "";
    }
}

class MaxMultiplyInputException extends Exception {
    @Override
    public String toString() {
        return "Input cannot be greater than 7000 while multiplying";
    }
    @Override
    public String getMessage() {
        return "";
    }
}

class CustomCalculator {
    public double add(double a, double b) throws InvalidInputException, MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        if (a==8 || b==9) {
            throw new InvalidInputException();
        }
        return a + b;
    }
    public double subtract(double a, double b) throws MaxInputException {
        if (a >= 100000 || b >= 100000) {
            throw new MaxInputException();
        }
        return a - b;
    }
    public double multiply(double a, double b) throws MaxMultiplyInputException, MaxInputException {
        if (a >= 7000 || b >= 7000) {
            throw new MaxMultiplyInputException();
        }
        if (a >= 100000 || b >= 100000) {
            throw new MaxInputException();
        }
        return a * b;
    }
    public double divide(double a, double b) throws CannotDivideByZeroException, MaxInputException {
        if (a >= 100000 || b >= 100000) {
            throw new MaxInputException();
        }
        if (b==0) {
            throw new CannotDivideByZeroException();
        }
        return a / b;
    }
}

public class exer_6_sol {
    public static void main(String[] args) throws InvalidInputException, MaxInputException {
        CustomCalculator calculator = new CustomCalculator();
        try {
            // calculator.add(8, 9);
            // calculator.divide(6, 0);
            // calculator.multiply(2000000, 2000000);
            // calculator.multiply(7000, 7000);
            calculator.subtract(20000000, 3774477);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}

