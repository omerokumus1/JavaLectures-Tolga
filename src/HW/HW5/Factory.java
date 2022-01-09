package HW.HW5;


public class Factory {
    private String name;
    private Employee[] employees;
    private Storage storage;
    private Payroll[] payrolls;
    private double itemPrice;

    public Factory(String name, int capacity, double itemPrice) {
        this.name = name;
        this.itemPrice = itemPrice;
        this.storage = new Storage(capacity);
//        employees = new Employee[0];
    }

    public double getRevenue() {
        double Revenue = (itemPrice) * storage.getItems().length;
        return Revenue;
    }

    public double getPaidSalaries() {
        double paidsalaries = 0;
        for (int i = 0; i < payrolls.length; i++) {
            paidsalaries += payrolls[i].calculateSalary();
        }
        return paidsalaries;
    }

    public void addEmployee(Employee employee) {

        /*
        1-Employeenin ürettiği itemleri al
        2- bu itemleri storage objesine ekle.
         */
        if (employees == null)
            employees = new Employee[0];

        Employee[] copyemployee = new Employee[employees.length + 1];
        for (int i = 0; i < employees.length; i++) {
            copyemployee[i] = employees[i];
        }
        copyemployee[copyemployee.length - 1] = employee;
        employees = copyemployee;

        // 1-Employeenin ürettiği itemleri al
        Item[] ıtems = employee.startShift();
        //  2- bu itemleri storage objesine ekle.
        for (int i = 0; i < ıtems.length; i++) {
            storage.addItem(ıtems[i]);

        }


    }

    public Employee removeEmployee(int id) {
        // If there are no employees, it prints an appropriate error message.
        if (employees == null) {
            System.out.println("There are no employees!");
            return null;
        } else {
            // try to find employee with the given id
            Employee emp = findEmployee(id);
            // If the employee with a given id is not found, it prints an appropriate error message.
            if (emp == null) {
                System.out.println("Employee does not exist");
                return null;
            } else if (employees.length == 0) {
                System.out.println("Employee does not exist");
                return null;
            } else {
                removeEmployeeAndResizeEmployeesArray(emp);
                // Then, you need to call endShift() method of the newly removed employee and call
                //addPayroll(payroll:Payroll) method with the returned payroll by the
                //endShift() method.

                // call endShift() method of the newly removed employee
                Payroll payroll = emp.endShift();
                // call addPayroll(payroll:Payroll) method with the returned payroll by the endShift() method.
                addPayroll(payroll);
                return emp;
            }
        }

    }

    private void addPayroll(Payroll payroll) {
        // method adds the payroll passed as the parameter to the
        // payrolls data field. Note that you need to resize the payrolls array for this.

        // first element
        if (payrolls == null) {
            payrolls = new Payroll[1];
            payrolls[0] = payroll;
        } else {
            // resize
            Payroll[] newPayrolls = new Payroll[payrolls.length + 1];
            // 1 2 3 4 5 -> payrolls
            // 1 2 3 4 5 null -> newPayrolls
//            newPayrolls = Arrays.copyOf(payrolls, payrolls.length + 1);
            for (int i = 0; i < payrolls.length; i++) {
                newPayrolls[i] = payrolls[i];
            }
            newPayrolls[newPayrolls.length - 1] = payroll;
            payrolls = newPayrolls;
        }

    }

    private void removeEmployeeAndResizeEmployeesArray(Employee emp) {
        int empIndex = getEmployeeIndex(emp.getId());
        // 1 2 3 4 5 6 7 8 9
        // 1 2 3 4 6 7 8 9
        Employee[] newEmployees = new Employee[employees.length - 1];
        for (int i = 0; i < empIndex; i++) {
            newEmployees[i] = employees[i];
        }
        int j = empIndex;
        for (int i = empIndex + 1; i < employees.length; i++) {
            newEmployees[j] = employees[i];
            j++;
        }
        employees = newEmployees;
    }

    private int getEmployeeIndex(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id)
                return i;
        }
        return -1;
    }

    private Employee findEmployee(int id) {
        Employee emp = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                emp = employees[i];
                break;
            }
        }
        return emp;
    }


}




