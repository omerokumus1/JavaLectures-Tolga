package Exercises.Ex13_11_Ex12_5;

public class Triangle extends GeometricObject {
    private double side1, side2, side3;

    public Triangle() {
        side1 = 1;
        side2 = 1;
        side3 = 1;
    }

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (areSidesIllegal(side1, side2, side3))
            throw new IllegalTriangleException("illegal triangle sides");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    private boolean areSidesIllegal(double side1, double side2, double side3) {
        double dif12 = Math.abs(side1 - side2);
        double dif13 = Math.abs(side1 - side3);
        double dif23 = Math.abs(side2 - side3);

        double sum12 = side1 + side2;
        double sum13 = side1 + side3;
        double sum23 = side2 + side3;

        if (dif12 > side3 || sum12 < side3)
            return true;

        if (dif13 > side2 || sum13 < side2)
            return true;

        if (dif23 > side1 || sum23 < side1)
            return true;

        return false;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double u = (side1 + side2 + side3) / 2;
        double inner = (u - side1) * (u - side2) * (u - side3);
        return Math.sqrt(u * inner);
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }


    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
