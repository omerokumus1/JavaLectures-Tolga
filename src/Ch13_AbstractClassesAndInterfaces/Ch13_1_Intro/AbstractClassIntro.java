package Ch13_AbstractClassesAndInterfaces.Ch13_1_Intro;

public class AbstractClassIntro {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle() { // anonymous class: bir kaç kez ihtiyaç duyduğun obje için class yazmanı engeller
            @Override
            void speedUp() {
                System.out.println("anonymous class speeding up");
            }

            @Override
            void slowDown() {
                System.out.println("anonymous class slowing down");
            }

            @Override
            void park() {
                System.out.println("anonymous class parking");
            }
        };

        Vehicle[] vehicles = new Vehicle[10];
        vehicles[0] = new SportCar();
        vehicles[1] = new Truck("Volvo", 15000, 1500);

//        SportCar[] sportCars = new SportCar[5];
//        sportCars[0] = new Truck("Volvo", 15000, 1500);



//        Calendar calendar = new Calendar() {
//            @Override
//            protected void computeTime() {
//
//            }
//
//            @Override
//            protected void computeFields() {
//
//            }
//
//            @Override
//            public void add(int field, int amount) {
//
//            }
//
//            @Override
//            public void roll(int field, boolean up) {
//
//            }
//
//            @Override
//            public int getMinimum(int field) {
//                return 0;
//            }
//
//            @Override
//            public int getMaximum(int field) {
//                return 0;
//            }
//
//            @Override
//            public int getGreatestMinimum(int field) {
//                return 0;
//            }
//
//            @Override
//            public int getLeastMaximum(int field) {
//                return 0;
//            }
//        }

        /*
            let obj = {
                "name": "Omer",
                "surname": "Okumus",
                "introduce": function(){ console.log(name + surname) }
            }
         */



    }
}

abstract class Vehicle {
    private String brand;
    private double price;

    protected Vehicle(String brand, double price){
        this.brand = brand;
        this.price = price;
    }

    Vehicle(){ // uml # -> protected

    }

    abstract void speedUp();

    abstract void slowDown();

    abstract void park(); // abstract methodlar için default tanım yoktur, bundan sebep concrete alt sınıfların bu methodu
        // implement etmesi zorunludur

    void introduce() { // default introduce methodu
        System.out.println("I am a vehicle");
    }

}

class SportCar extends Vehicle {

    @Override
    void speedUp() {
        System.out.println("Speeding up by 10 km/h");
    }

    @Override
    void slowDown() {
        System.out.println("Slowing down..");
    }

    @Override
    void park() {
        System.out.println("Time to park.");
    }
}

class Truck extends Vehicle {
    private int towCapacity;

    Truck(String brand, double price, int towCapacity) {
        super(brand, price);
        this.towCapacity = towCapacity;
    }

    @Override
    void speedUp() {
        System.out.println("Speeding up by 5 km/h");
    }

    @Override
    void slowDown() {
        System.out.println("Slowing down swiftly..");
    }

    @Override
    void park() {
        System.out.println("Parking is going to take some time.");
    }
}


