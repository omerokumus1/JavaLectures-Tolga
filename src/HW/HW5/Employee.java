package HW.HW5;

import java.util.Arrays;
import java.util.Random;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private int workHour;
    private int speed; //  speed represents that the employee can produce 3 items in an hour.
    private Item[] items;
    private Payroll payroll;

    // Employee(id: int, name: String, surname: String, workHour: int, speed: int)
    public Employee(int id, String name, String surname, int workHour, int speed) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.workHour = workHour;
        this.speed = speed;
    }

    /*
    startShift() method finds how many items this employee should produce according to
    speed and workHour values. After that, it creates appropriate number of items with
    randomly generated ids between 1-100 and put them into items array. It then returns items
    array.
     */
    public Item[] startShift() {
        int totalItems = workHour * speed;
        items = new Item[totalItems];
        /** TODO:
         *      1. random id üret
         *      2. ürettiğin id ile Item objesi üret
         *      3. ürettiğin Item objesini items dizisinin içine at
         */
        int id;
        Item item;
        for (int i = 0; i < totalItems; i++) {
            // 1.
            id = (int) (Math.random() * 100 + 1);
            // 2.
            item = new Item(id);
            // 3.
            items[i] = item;
        }

        return items;
    }


    /*
    endShift() method creates a Payroll object with employee’s work hour and the number
    of items s/he creates. It assigns this object to payroll data field. It then returns payroll
    object.
     */
    public Payroll endShift() {
        int itemCount = speed * workHour;
        payroll = new Payroll(workHour, itemCount);
        return payroll;
    }

    @Override
    public String toString() {
        return "This is the employee with id " + id + " speed " + speed + ". The work hour is " + workHour+ " and the " +
                "produced item count is " + (speed * workHour) + ".";
    }
}
