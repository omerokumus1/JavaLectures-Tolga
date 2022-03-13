package HW.LabHomeworkCompany;

import java.util.ArrayList;
import java.util.Calendar;

public class Manager extends Employee {
    //regularEmployees: ArrayList<RegularEmployee> bonusBudget: double

    private ArrayList<RegularEmployee> regularEmployees = new ArrayList<RegularEmployee>();
    private double bonusBudget;

    public Manager(int id, String firstName, String lastName, String gender, Calendar birthDate, String maritalStatus, String hasDriverLicence, double salary, Calendar hireDate, Department department, double bonusBudget) throws Exception {
        super(id, firstName, lastName, gender, birthDate, maritalStatus, hasDriverLicence, salary, hireDate, department);
        this.bonusBudget = bonusBudget;
    }

    public Manager(Employee employee, double salary, Department department, double bonusBudget) throws Exception {
        super(employee, salary, department);
        this.bonusBudget = bonusBudget;
    }

    public void addEmployee(RegularEmployee e) {
        regularEmployees.add(e);
    }

    public void removeEmployee(RegularEmployee e) {
        regularEmployees.remove(e);
    }

    public void distributeBonusBudget() {
//        for (RegularEmployee re :
//                regularEmployees) {
//            double bonus = calculateBonus(re);
//            re.setBonus(bonus);
//        }


        double sum = calculateSumofSalarysperformanceScore();
//        unit = bonusBudget / sum;
//        bonus = unit * salary* perfSc;

        findthebonusvalue(sum);

    }

    private void findthebonusvalue(double sum) {

        for (RegularEmployee regularEmployee : regularEmployees) {
            double unit;
            double bonus;
            double salary;
            double performanceScore;
            unit = bonusBudget / sum;
            salary = regularEmployee.getSalary();
            performanceScore = regularEmployee.getPerformanceScore();
            bonus = unit * salary * performanceScore;
            regularEmployee.setBonus(bonus);
        }

    }

    public ArrayList<RegularEmployee> getRegularEmployees() {
        return regularEmployees;
    }

    public void setRegularEmployees(ArrayList<RegularEmployee> regularEmployees) {
        this.regularEmployees = regularEmployees;
    }

    public double getBonusBudget() {
        return bonusBudget;
    }

    public void setBonusBudget(double bonusBudget) {
        this.bonusBudget = bonusBudget;
    }

    double calculateSumofSalarysperformanceScore() {
        double sum = 0;
        double salary;
        double perfSc;
        for (RegularEmployee regularEmployee : regularEmployees) {
            salary = regularEmployee.getSalary();
            perfSc = regularEmployee.getPerformanceScore();
            sum += salary * perfSc;
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Manager [id: " + super.getId() + ", " + super.getFirstName() + " " + super.getLastName() + "" + "\t\t # of Employees: " + numberOfEmployees+"]";
    }
}

