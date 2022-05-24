// practice problem 1
class Circle {
    public float radius;

    public Circle(float radius) {
        this.radius = radius;
    }
    public float area() {
        return (float) Math.PI * this.radius * this.radius;
    }
}

class Cylinder extends Circle {
    public float height;

    public Cylinder(float radius, float height) {
        super(radius);
        this.height = height;
    }
    @Override
    public float area() {
        return (float) Math.PI * 2f * this.radius * (this.radius + this.height);
    }
    public float volume() {
        return (float) Math.PI * this.radius * this.radius * this.height;
    }
}

public class practice_set_10 {
    public static void main(String[] args) {
        Circle circle = new Circle(12f);
        System.out.println("The Circle Area is " + circle.area());

        Cylinder cylinder = new Cylinder(8f, 13f);
        System.out.println("The Cylinder Area is " + cylinder.area());
        System.out.println("The Cylinder Volume is " + cylinder.volume());
    }
}

