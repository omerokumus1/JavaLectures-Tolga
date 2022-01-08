package HW.HW5;

public class Hw5Test {
    public static void main(String[] args) {
        Payroll payroll = new Payroll(3, 4);
        System.out.println(payroll);
        System.out.println(payroll.calculateSalary());

        Employee employee = new Employee(1, "Ahmet", "Yilmaz", 8, 3);
        employee.startShift();
        employee.endShift();
        System.out.println(employee);
    }
}
