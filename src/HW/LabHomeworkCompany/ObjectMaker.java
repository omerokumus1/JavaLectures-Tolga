package HW.LabHomeworkCompany;

import java.awt.print.PrinterJob;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

public class ObjectMaker {
    private ArrayList<Product> products;
    private ArrayList<Project> projects;
    private ArrayList<Person> people;
    private ArrayList<Department> departments;

    public ObjectMaker() {
        products = new ArrayList<>();
        projects = new ArrayList<>();
        people = new ArrayList<>();
        departments = new ArrayList<>();
    }

    public Object createObject(String inputLine) throws Exception {
        String[] lineSplit = inputLine.split(" ");
        String type = lineSplit[0];
        if (type.equals("Product"))
            return createProduct(lineSplit);
        else if (type.equals("Project"))
            return createProject(lineSplit);
        else if (type.equals("Department"))
            return createDepartment(lineSplit);
        else
            return createPerson(lineSplit);
    }

    private Department createDepartment(String[] lineSplit) {
        int id = Integer.parseInt(lineSplit[1]);
        String departmentName = lineSplit[2];
        return new Department(id, departmentName);
    }

    private Project createProject(String[] lineSplit) throws Exception {
        String projectName = lineSplit[1];
        Calendar startDate = parseDate(lineSplit[2]);
        String state = lineSplit[3];
        return new Project(projectName, startDate, state);
    }

    private Product createProduct(String[] lineSplit) throws Exception {
        String productName = lineSplit[1];
        Calendar saleDate = parseDate(lineSplit[2]);
        double price = Double.parseDouble(lineSplit[3]);
        return new Product(productName, saleDate, price);
    }

    private Person createPerson(String[] lineSplit) throws Exception {
        String type = lineSplit[0];
        switch (type) {
            case "Person":
                return getPerson(lineSplit);
            case "Customer":
                return getCustomer(lineSplit);
            case "Employee":
                return getEmployee(lineSplit);
            case "Manager":
                return getManager(lineSplit);
            case "RegularEmployee":
                return getRegularEmployee(lineSplit);
            case "SalesEmployee":
                return getSalesEmployee(lineSplit);
            case "Developer":
                return getDeveloper(lineSplit);
            default:
                throw new IllegalTypeException("Type is not defined");
        }
    }

    private Person getDeveloper(String[] lineSplit) throws Exception {
        int id = Integer.parseInt(lineSplit[1]);
        Person person = findPersonById(id);
        String[] projectNames = Arrays.copyOfRange(lineSplit, 2, lineSplit.length);
        ArrayList<Project> projects = getCorrespondingProjects(projectNames);
        return new Developer((RegularEmployee) person, projects);
    }

    private ArrayList<Project> getCorrespondingProjects(String[] projectNames) {
        ArrayList<Project> projectList = new ArrayList<>();
        for (String projectName :
                projectNames) {
            for (Project project :
                    this.projects) {
                if (project.getProjectName().equals(projectName))
                    projectList.add(project);
            }
        }
        return projectList;
    }

    private Person getSalesEmployee(String[] lineSplit) throws Exception {
        int id = Integer.parseInt(lineSplit[1]);
        Person person = findPersonById(id);
        String[] productNames = Arrays.copyOfRange(lineSplit, 2, lineSplit.length);
        ArrayList<Product> products = getCorrespondingProducts(productNames);
        return new SalesEmployee((RegularEmployee) person, products);
    }

    private ArrayList<Product> getCorrespondingProducts(String[] productNames) {
        ArrayList<Product> productList = new ArrayList<>();
        for (String productName :
                productNames) {
            for (Product product :
                    this.products) {
                if (product.getProductName().equals(productName))
                    productList.add(product);
            }
        }
        return productList;
    }

    private Person getRegularEmployee(String[] lineSplit) throws Exception {
        int id = Integer.parseInt(lineSplit[1]);
        double perfScore = Double.parseDouble(lineSplit[2]);
        Person person = findPersonById(id);
        return new RegularEmployee((Employee) person, perfScore);
    }

    private Person getManager(String[] lineSplit) throws Exception {
        int id = Integer.parseInt(lineSplit[1]);
        double bonusBudget = Double.parseDouble(lineSplit[2]);
        Person person = findPersonById(id);
        return new Manager((Employee) person, bonusBudget);
    }

    private Person getEmployee(String[] lineSplit) throws Exception {
        double salary = Double.parseDouble(lineSplit[2]);
        Calendar hireDate = parseDate(lineSplit[3]);
        Department department = getDepartment(lineSplit[4]);
        int id = Integer.parseInt(lineSplit[1]);
        Person person = findPersonById(id);
        return new Employee(person, salary, hireDate, department);
    }

    private Person findPersonById(int id) {
        for (Person p:
                people) {
            if (p.getId() == id)
                return p;
        }
        return null;
    }

    private Department getDepartment(String departmentName) {
        for (Department dep :
                departments) {
            if (dep.getDepartmentName().equals(departmentName))
                return dep;
        }
        return null;
    }

    private Person getCustomer(String[] lineSplit) throws Exception {
        // TODO: Person'ı ara yoksa oluştur varsa onu kullan: findPerson()
        //      - ArrayList için önce department araması yap (id ile) bulduğun department'ı gönder (getSalesEmployee'deki gibi)
        String[] productNames = Arrays.copyOfRange(lineSplit, 2, lineSplit.length);
        ArrayList<Product> products = getCorrespondingProducts(productNames);
        int id = Integer.parseInt(lineSplit[1]);
        Person person = findPersonById(id);
        return new Customer(person, new ArrayList<>());
    }

    private Person getPerson(String[] lineSplit) throws Exception {
        int id = Integer.parseInt(lineSplit[3]);
        String firstName = lineSplit[1];
        String lastName = lineSplit[2];
        String gender = lineSplit[4];
        Calendar birthDate = parseDate(lineSplit[5]);
        String maritalStatus = lineSplit[6];
        String hasDriverLicence = lineSplit[7];
        return new Person(id, firstName, lastName, gender, birthDate, maritalStatus, hasDriverLicence);
    }

    private Calendar parseDate(String date) throws Exception {
        String[] dateSplit = date.split("/");
        Calendar calendar = Calendar.getInstance();
        int year = Integer.parseInt(dateSplit[2]);
        int month = Integer.parseInt(dateSplit[1]);
        int day = Integer.parseInt(dateSplit[0]);
        calendar.set(year, getMonth(month), day);

        return calendar;
    }

    private int getMonth(int month) throws Exception {
        switch (month) {
            case 1:
                return Calendar.JANUARY;
            case 2:
                return Calendar.FEBRUARY;
            case 3:
                return Calendar.MARCH;
            case 4:
                return Calendar.APRIL;
            case 5:
                return Calendar.MAY;
            case 6:
                return Calendar.JUNE;
            case 7:
                return Calendar.JULY;
            case 8:
                return Calendar.AUGUST;
            case 9:
                return Calendar.SEPTEMBER;
            case 10:
                return Calendar.OCTOBER;
            case 11:
                return Calendar.NOVEMBER;
            case 12:
                return Calendar.DECEMBER;
            default:
                throw new Exception();
        }
    }

    public void addObject(Object o) throws Exception {
        if (o instanceof Project)
            addProject((Project) o);
        else if (o instanceof Product)
            addProduct((Product) o);
        else if (o instanceof Department)
            addDepartment((Department) o);
        else if (o instanceof Person)
            addPerson((Person) o);
        else
            throw new Exception("Undefined object in addObject method.");

    }

    private void addPerson(Person person) {
        people.remove(person);
        people.add(person);
    }

    private void addProject(Project project) {
        projects.add(project);
    }

    private void addProduct(Product product) {
        products.add(product);
    }

    private void addDepartment(Department department) {
        departments.add(department);
    }

    @Override
    public String toString() {
        return "ObjectMaker{" +
                "people=" + people +
                '}';
    }
}
