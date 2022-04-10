package Exercises.Ex13_11_Ex12_5;

public class Test {
    public static void main(String[] args) {
        Octagon octagon = new Octagon(5);
        Octagon octagon2 = new Octagon(6);
        Octagon octagonCopy = octagon.clone();
        System.out.println("octagon vs octagonCopy: " + octagon.compareTo(octagonCopy));
        System.out.println("octagon2 vs octagonCopy: " + octagon2.compareTo(octagonCopy));


        GeometricObject[] geometricObjects = {
                new Circle(2),
                new Circle(4),
                new Rectangle(1, 2),
                new Rectangle(4, 5)
        };
        System.out.println("total area: " + sumArea(geometricObjects));

        try {
            Triangle triangle = new Triangle(1, 2, 500);
        } catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }

    }

    public static double sumArea(GeometricObject[] objects){
        double sum = 0;
        for (GeometricObject go :
                objects) {
            sum += go.getArea();
        }
        return sum;
    }
}
