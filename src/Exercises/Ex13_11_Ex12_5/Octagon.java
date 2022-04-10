package Exercises.Ex13_11_Ex12_5;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {

    private double side;

    Octagon(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    Octagon(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    @Override
    public double getPerimeter() {
        return 8 * side;
    }

    public Octagon clone() {
        Octagon octagon = null;
        try {
            octagon = (Octagon) super.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println("Octagon cannot be cloned");
        }
        return octagon;

    }

    @Override
    public int compareTo(Octagon o) {
        double thisArea = getArea();
        double oArea = o.getArea();
        return Double.compare(thisArea, oArea);
    }
}
