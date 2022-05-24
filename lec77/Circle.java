package com.shape;

public class Circle extends Shape{
    Circle(int dim1) {
        super(dim1, -1);
    }

    public double area() {
        return 2 * Math.PI * this.dim1 * this.dim1;
    }
}

