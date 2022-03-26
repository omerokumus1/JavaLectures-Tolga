package Ch13_AbstractClassesAndInterfaces.Ch13_1_Intro;

import javax.sound.sampled.Port;

public class InterfaceIntro {
    /*
        2 şekilde kullanılır:
                1. Bir objeye bir özellik/sıfat ekleyebilmek için
                2. İki objenin haberleşmesini sağlamak için
                3. polimorfik yapı oluşturmak için
     */

    public static void main(String[] args) {
        // 1. Bir objeye bir özellik/sıfat ekleyebilmek için
        Laptop laptop = new Laptop();
        System.out.println("Laptop is Portable? " + (laptop instanceof Portable));
    }
}

abstract class Product {
    private String brand;
    private String category;
    private String name;
    private double price;

    protected Product() {
    }

    protected Product(String brand, String category, String name, double price) {
        this.brand = brand;
        this.category = category;
        this.name = name;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    abstract void raisePrice();

    void discount(double percent) {
        price = price - price * percent;
    }
}

class Computer extends Product {

    @Override
    void raisePrice() {
        setPrice(getPrice() * 0.2);
    }
}

class Laptop extends Computer implements Portable {
    @Override
    public void move() {
        System.out.println("I move around easily");
    }

}

class Desktop extends Computer {

}

interface Portable {
    void move();
}


