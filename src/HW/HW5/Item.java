package HW.HW5;

public class Item {
    private int id;
    public static int numberOfItems = 0;

    public Item(int id){
        this.id = id;
        numberOfItems++;
    }

}
