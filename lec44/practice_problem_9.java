// practice problem 1
class Cylinder {
    private int radius;
    private int height;

    // practice problem 3
    public Cylinder(int r, int h) {
        radius = r;
        height = h;
    }

    //setters
    public void setRadius(int r) {
        radius = r;
    }
    public void setHeight(int h) {
        height = h;
    }
    //getters
    public int getRadius() {
        return radius;
    }
    public int getHeight() {
        return height;
    }
    // practice problem 2
    public float surfaceArea() {
        return 2f * (float) Math.PI * (float) radius * ((float) radius + (float) height);
    }
    public float volume() {
        return (float) Math.PI * (float) radius * (float) radius * (float) height;
    }

}

// practice problem 4
class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {
        length = 0;
        breadth = 0;
    }
    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
}


public class practice_problem_9 {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(0, 0);
        cylinder.setRadius(12);
        cylinder.setHeight(9);
        System.out.println(cylinder.getRadius());
        System.out.println(cylinder.getHeight());
        System.out.println(cylinder.surfaceArea());
        System.out.println(cylinder.volume());


        Rectangle r = new Rectangle();
    }
}

