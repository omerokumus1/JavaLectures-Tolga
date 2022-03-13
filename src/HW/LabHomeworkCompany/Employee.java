package HW.LabHomeworkCompany;

import java.awt.*;
import java.util.Calendar;

public class Employee extends Person {

    // salary: double hireDate: java.util.Calendar department: Department numberofEmployees: int
    private double salary;
    private Calendar hireDate;
    private Department department;
    // TODO: may be static
    public static int numberOfEmployees;

    // TODO: diğer sınıflardaki constructor methodlarını da buradaki gibi düzenle
    public Employee(int id, String firstName, String lastName, String gender,
                    Calendar birthDate, String maritalStatus, String hasDriverLicence,
                    double salary, Calendar hireDate, Department department) throws Exception {
        super(id, firstName, lastName, gender, birthDate, maritalStatus, hasDriverLicence);
        this.salary = salary;
        this.hireDate = hireDate;
        this.department = department;

        numberOfEmployees++;
    }

    public Employee(Person person, double salary, Department department) throws Exception {
        this(person.getId(), person.getFirstName(), person.getLastName(),
                person.getGender(), person.getBirthDate(), person.getMaritalStatus(),
                person.isHasDriverLicence(), salary, Calendar.getInstance(), department);
    }

    //raiseSalary(percent: double): double raiseSalary(amount: int): double
    public double raiseSalary(double percent) throws Exception {
        if (percent >= 0 && percent <= 1) {
            return salary + profit(percent);
        } else
            throw new Exception("Invalid percent!!");
    }

    public double raiseSalary(int amount) {
        return salary + amount;
    }

    private double profit(double percent) {
        return salary * percent * 100;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Calendar getHireDate() {
        return hireDate;
    }

    public void setHireDate(Calendar hireDate) {
        this.hireDate = hireDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", hireDate=" + hireDate +
                ", department=" + department +
                ", numberOfEmployees=" + numberOfEmployees +
                '}';
    }
}
