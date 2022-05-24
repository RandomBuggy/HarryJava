// practice problem 1
class Employee {
        int salary = 0;
        String name;
        public int getSalary() {
            return salary;
        }

        public String getName() {
            return name;
        }
        public void setName(String n) {
            name = n;
        }
    }
 
class Cellphone {
    public void ring() {
        System.out.println("Ringing...");
    }
    public void vibrate() {
        System.out.println("Vibrating...");
    }
    public void callFrined(String name) {
        System.out.println("Calling to " + name);
    }
}

// practice problem 3
class Square {
    int side;

    public int area() {
        return side * side;
    }
    public int perimeter() {
        return 4 * side;
    }
}

// practice problem 4
class Rectangle {
    int length;
    int breadth;

    public int area() {
        return length * breadth;
    }
    public int perimeter() {
        return 2 * (length * breadth);
    }
}

//practice problem 5
class Circle {
    float radius;

    public float area() {
        return 3.1416f * radius * radius;
    }

    public float perimeter() {
        return 2f * 3.1416f * radius;
    }
}

// practice problem 6
class Tommy {
    public void hit() {
        System.out.println("Hitting the Enemy...");
    }
    public void run() {
        System.out.println("Running from the Enemy...");
    }
    public void fire() {
        System.out.println("Firing on the Enemy...");
    }
}

public class practice_set_8 {
   public static void main(String[] args) {
        Employee john = new Employee();
        john.salary = 12000;
        // System.out.println("Salary: " + john.getSalary);
        System.out.println("Name: " + john.getName());
        john.setName("Harry");
        System.out.println("Name: " + john.getName());


        Cellphone phone = new Cellphone();
        phone.vibrate();
        phone.callFrined("MySelf");
        phone.ring();


        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());


        Rectangle rect = new Rectangle();
        rect.length = 12;
        rect.breadth = 8;
        rect.area();
        rect.perimeter();

        Circle circle = new Circle();
        circle.radius = 13f;
        System.out.println(circle.area());
        System.out.println(circle.perimeter());

        Tommy player = new Tommy();
        player.hit();
        player.fire();
        player.run();
    }
}

