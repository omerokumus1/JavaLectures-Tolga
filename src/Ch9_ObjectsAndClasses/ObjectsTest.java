package Ch9_ObjectsAndClasses;

public class ObjectsTest {
    public static void main(String[] args) {
        int x = 5;
        int[] intArr = new int[5];
        String str = "str";
        String str2 = new String("str");
        Circle circle = new Circle();
        System.out.println(circle.radius);
        System.out.println(circle);

        double area = circle.getArea();
        double perimeter = circle.getPerimeter();
        System.out.println("area: " + area);
        System.out.println("perimeter: " + perimeter);

        circle.setRadius(3);
        System.out.println("radius: " + circle.radius);

        // static methods are accessed via class name as ClassName.MethodName
        Circle.introduce();

        // non-static methods are accessed via object reference as objectReference.MethodName
        circle.introduce2();

        TV tv = new TV();
        System.out.println(tv.toString());
        tv.turnOn();
        System.out.println(tv.toString());
        tv.channelUp();
        tv.setVolume(5);
        System.out.println(tv);

        tv.setChannel(244);
        System.out.println(tv);


    }
}
