package Ch9_ObjectsAndClasses;

public class Circle {
    // özellikler, data field, properties
    double radius;

    // eylemler, methods,
    Circle(){
        radius = 1;
    }

    Circle(double newRadius){
        radius = newRadius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public void setRadius(double newRadius){
        radius = newRadius;
    }

    // static methods are independent of particular objects. They belong to the class.
    public static void introduce(){
        System.out.println("I am a circle");
    }
    // non-static methods are dependent on particular objects. They belong to the object itself.
    public void introduce2(){
        System.out.println("I am a circle");
    }


}
