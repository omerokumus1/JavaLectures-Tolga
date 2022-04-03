package Ch11_InheritanceAndPolymorphism.Ch11_1_SuperAndSubClasses;

public class Test {
    public static void main(String[] args) {
        Circle circle =
                new Circle(1);
        System.out.println("A circle " + circle);
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());
        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println("\nA rectangle " + rectangle);
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());

        Circle c1 = new Circle(1);
        GeometricObject[] gos = new GeometricObject[3];
        gos[0] = c1; // c1 go'ya implicit olarak cast edilir. -> upcasting
        gos[1] = new Rectangle(3, 5);
        gos[2] = new Circle(2);

        for (GeometricObject go :
                gos) {
            if (go instanceof Circle) { // Java buradaki if koşuluna bakarak karar veremez. Onun için hala 2 seçenek vardır. Bu koşul bizim içindir
                // explicit casting gerekli çünkü go objesinin Circle olduğu java için kesin değil -> downcasting
                System.out.println("radius: " + ((Circle) go).getRadius());
            } else if (go instanceof Rectangle) {
                // explicit casting gerekli çünkü go objesinin Circle olduğu java için kesin değil -> downcasting
                System.out.println("width: " + ((Rectangle)go).getWidth() + ", height: " + ((Rectangle)go).getHeight());
            }
        }

    }
}
