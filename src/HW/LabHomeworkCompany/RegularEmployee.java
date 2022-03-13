package HW.LabHomeworkCompany;

import java.util.Calendar;

public class RegularEmployee extends Employee{
    private double performanceScore;
    private double bonus;


    public RegularEmployee(int id, String firstName, String lastName, String gender, Calendar birthDate, String maritalStatus, String hasDriverLicence, double salary, Calendar hireDate, Department department,double performanceScore) throws Exception {
        super(id, firstName, lastName, gender, birthDate, maritalStatus, hasDriverLicence, salary, hireDate, department);
        this.performanceScore=performanceScore;
    }
    // RegularEmployee(Employee employee, double perfScore)


//    public RegularEmployee(Employee employee, double salary, Department department, double performanceScore) throws Exception {
//        super(employee, salary, department);
//        this.performanceScore = performanceScore;
//    }

    public RegularEmployee(Employee employee, double perfScore) throws Exception {
        super(employee, employee.getSalary(), employee.getDepartment());
        this.performanceScore=perfScore;

    }

    public double getPerformanceScore() {
        return performanceScore;
    }

    public void setPerformanceScore(double performanceScore) {
        this.performanceScore = performanceScore;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "RegularEmployee{" +
                "numberOfEmployees=" + numberOfEmployees +
                ", performanceScore=" + performanceScore +
                ", bonus=" + bonus +
                '}';
    }
}
