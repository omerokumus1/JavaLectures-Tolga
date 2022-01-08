package HW.HW5;

public class Payroll {
    private int workHour;
    private int itemCount;

    public Payroll(int workHour, int itemCount) {
        this.workHour = workHour;
        this.itemCount = itemCount;
    }

    /*
    calculateSalary() method calculates salary of the employee according to the number of
    hours an employee has worked and the number of items s/he produced. For each hour an
    employee works, s/he earns 3 liras and for each item s/he produces s/he additionally earns 2
    liras.
     */
    public int calculateSalary() {
        return workHour * 3 + itemCount * 2;
    }

    @Override
    public String toString() {
        return "The work hour is " + workHour + " and the produced item count is " + itemCount + " .";
    }
}
