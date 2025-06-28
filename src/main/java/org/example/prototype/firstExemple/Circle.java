package org.example.prototype.firstExemple;

class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
        this.type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius: " + radius);
    }
}
