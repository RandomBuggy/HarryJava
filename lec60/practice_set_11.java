// problem 1
abstract class Pen {
    abstract void write();
    abstract void refill();
}

// problem 2
class FountainPen extends Pen {
    public void write() {
        System.out.println("WRITE");
    }
    public void refill() {
        System.out.println("REFILL");
    }
    public void changeNib() {
        System.out.println("Changing the NIB...");
    }
}

// problem 3

class Monkey {
    public void jump() {
        System.out.println("Jumping...");
    }
    public void bite() {
        System.out.println("Biting...");
    }
}

interface BasicAnimal {
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal {
    public void eat() {
        System.out.println("Eating...");
    }
    public void sleep() {
        System.out.println("Sleeping...");
    }
    public void speak() {
        System.out.println("Hello Sir");
    }
}

public class practice_set_11 {
    public static void main(String[] args) {
        FountainPen pen = new FountainPen();
        pen.write();
        pen.refill();
        pen.changeNib();



        Human human = new Human();
        human.jump();
        human.bite();
        human.eat();
        human.sleep();
        human.speak();

        // problem 5

        BasicAnimal lovish = new Human();
        lovish.eat();
        lovish.sleep();
        // lovish.speak(); /* throws error */
    }
}

