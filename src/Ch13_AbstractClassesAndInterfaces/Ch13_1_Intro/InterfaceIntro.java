package Ch13_AbstractClassesAndInterfaces.Ch13_1_Intro;

import javax.management.monitor.MonitorMBean;
import javax.sound.sampled.Port;
import java.security.Key;
import java.security.Principal;

public class InterfaceIntro {
    /*
        2 şekilde kullanılır:
                1. Bir objeye bir özellik/sıfat ekleyebilmek için
                2. İki objenin haberleşmesini sağlamak için
                3. polimorfik yapı oluşturmak için
     */

    public static void main(String[] args) {
        // 1. Bir objeye bir özellik/sıfat ekleyebilmek için
//        Laptop laptop = new Laptop();
//        System.out.println("Laptop is Portable? " + (laptop instanceof Portable));

        // 2. İki objenin haberleşmesini sağlamak için
        // 1. Örnek - If, else'leri ortadan kaldırmak:  Herhangi bir computer veya mobile phone
//                                      IKeyboard interfacesini implement eden bir objeyle haberleşebilir.
//                                      Aynı zamanda bir IKeyboard objesi Communicatable interfacesini implement eden
//                                      tüm objelerle haberleşebilir. Interface olmayasaydı if else ile type check
//                                      yapmak zorunda kalırdık. Her eklenen yeni obje için yeni bir type check
//                                      yapılmak zorunda olurduk.

//        Desktop desktop = new Desktop();
//        MobilePhone phone = new MobilePhone();
        IKeyboard keyboard = getKeyboard(); // IKeyboard olsun da ne olursa olsun

        // Communicatable interfacesini implement eden herhangi bir obje ile IKeyboard objesi haberleşebilir.
        Communicatable desktop = new Desktop();
        Communicatable laptop = new Laptop();
        Communicatable phone = new MobilePhone();
        Communicatable tablet = new Tablet();

        keyboard.communicate(desktop);
        System.out.println(desktop.getText());
        keyboard.communicate(phone);
        System.out.println(phone.getText());
        keyboard.communicate(laptop);
        System.out.println(laptop.getText());
        keyboard.communicate(tablet);
        System.out.println(tablet.getText());

        // 2. Örnek: İki obje arasında interface aracılığıyla (anonymous class ile) bilgi aktarmak
        ScreenController controller = new ScreenController();
        Screen screen = controller.getScreen();
        screen.buttonClicked(screen.getButton1().getId());
        screen.buttonClicked(screen.getButton2().getId());

    }

    private static IKeyboard getKeyboard() { // run-time simülasyonu
        return new Keyboard(); // bana klavye gelmiş
//        return new TypeWriter(); // bana daktilo gelmiş
    }
}

class Screen { // B
    private Button button1 = new Button(1);
    private Button button2 = new Button(2);
    private ScreenController.ButtonClickHandler clickHandler; // B A'yı bu obje yardımıyla uyarır
//    private ScreenController controller; // gereksiz, çünkü B nin işi butona basıldığını anlayıp A'ya bir sinyal göndermek.
                                            // sinyal göndermek içinde A'nin referansına sahip olması gerekmez.

    public void setClickHandler(ScreenController.ButtonClickHandler clickHandler) {
        this.clickHandler = clickHandler; // A bir obje üretip B'ye bu method yardımıyla gönderir. Bu obje ile B A'yı uyarabilir
    }

//    public void setController(ScreenController controller) {
//        this.controller = controller;
//    }

    void buttonClicked(int buttonId){ // buttonun basıldığını anlayan method
        clickHandler.onClick(buttonId); // B A'yı burada uyarmış olur
    }

    public Button getButton1() {
        return button1;
    }

    public Button getButton2() {
        return button2;
    }
}

class ScreenController { // A
    private Screen screen;

    private void printInfo(int id){ // butona basıldığında yapılacak iş
        System.out.println("ID'si " + id + " olan butona basıldı");
    }

    ScreenController(){
        screen = new Screen();
        sendClickHandler();
    }

    private void sendClickHandler(){
        screen.setClickHandler(new ButtonClickHandler() { // anonymous class ile obje üretilir
            @Override
            public void onClick(int buttonId) {
                printInfo(buttonId);
            }
        });
    }

    public Screen getScreen() {
        return screen;
    }

    //    void setController(){
//        screen.setController(this);
//    }

    interface ButtonClickHandler {
        void onClick(int buttonId);
    }
}

class Button {
    private int id;

    Button(int id){
        this.id = id;
    }

    public int getId() {
        return id;
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

class MobilePhone extends Product implements Communicatable {
    private StringBuilder text = new StringBuilder();

    @Override
    void raisePrice() {
        setPrice(getPrice() * 0.5);
    }

    public StringBuilder getText() {
        return text;
    }

    public void appendText(String text) {
        this.text.append(text);
    }
}

class Computer extends Product implements Communicatable {
    private StringBuilder text = new StringBuilder();
    @Override
    void raisePrice() {
        setPrice(getPrice() * 0.2);
    }

    public StringBuilder getText() {
        return text;
    }

    public void appendText(String text) {
        this.text.append(text);
    }

}

class Laptop extends Computer implements Portable {
    @Override
    public void move() {
        System.out.println("I move around easily");
    }

}

class Tablet extends Product implements Portable, Communicatable {
    private StringBuilder text = new StringBuilder();
    @Override
    void raisePrice() {

    }

    @Override
    public void appendText(String text) {
        this.text.append(text);
    }

    @Override
    public StringBuilder getText() {
        return text;
    }

    @Override
    public void move() {

    }
}

class Desktop extends Computer {

}

class Keyboard extends Product implements IKeyboard {

    @Override
    void raisePrice() {
        setPrice(getPrice() * 0.2);
    }

    @Override
    public void communicate(Communicatable communicatable) {
        communicatable.appendText("From Keyboard to any " + communicatable.getClass().getSimpleName());
    }
}

class TypeWriter extends Product implements IKeyboard {

    @Override
    void raisePrice() {

    }

    @Override
    public void communicate(Communicatable communicatable) {
        communicatable.appendText("From TypeWriter to any " + communicatable.getClass().getSimpleName());
    }
}

interface IKeyboard {
    void communicate(Communicatable communicatable);
}

interface Communicatable {
    void appendText(String text);
    StringBuilder getText();
}

interface Portable {
    void move();
}


