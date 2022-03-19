//package HW.LabHomeworkCompany;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Calendar;
//
//
//public class test {
//    public static void main(String[] args) throws Exception {
//
//        ArrayList<Person> personList = new ArrayList();
//
//        Department Accounting = new Department(1, "Accounting");
//
//        Department Marketing = new Department(2, "Marketing");
//
//
//        Calendar startDate = Calendar.getInstance();
//
//        startDate.set(2018, Calendar.MAY, 1);
//        Project AutoCredit = new Project("AutoCredit", startDate, "Open");
//
//        startDate.set(2018, Calendar.DECEMBER, 1);
//        Project ATM = new Project("ATM", startDate, "Open");
//
//        startDate.set(2017, Calendar.MAY, 1);
//        Project Creditcard = new Project("Creditcard", startDate, "Close");
//
//        startDate.set(2019, Calendar.MAY, 1);
//        Project Robotic = new Project("Robotik", startDate, "Open");
//
//        startDate.set(2019, Calendar.JULY, 1);
//        Project FaceRecognition = new Project("FaceRecognition", startDate, "Open");
//
//        startDate.set(2018, Calendar.SEPTEMBER, 1);
//        Project SpeechRecognition = new Project("SpeechRecognition", startDate, "Open");
//
//        startDate.set(2018, Calendar.NOVEMBER, 1);
//        Project MobilApp = new Project("MobilApp", startDate, "Open");
//
//        startDate.set(2019, Calendar.JANUARY, 1);
//        Product Product1 = new Product("Product1", startDate, 10000);
//
//        startDate.set(2019, Calendar.FEBRUARY, 2);
//        Product Product2 = new Product("Product2", startDate, 1500);
//
//        startDate.set(2018, Calendar.NOVEMBER, 1);
//        Product Product3 = new Product("Product3", startDate, 15000);
//
//        startDate.set(2018, Calendar.APRIL, 1);
//        Product Product4 = new Product("product4", startDate, 50000);
//
//        startDate.set(2017, Calendar.JANUARY, 11);
//        Product Product5 = new Product("product5", startDate, 90000);
//
//        Calendar birthRate = Calendar.getInstance();
//
//        birthRate.set(1986, Calendar.MAY, 1986);
//        Person Ayşe = new Person(111, "Ayşe", "Çalışkan", "Woman", birthRate, "Married", "Yes");
//
//        birthRate.set(1982, Calendar.JUNE, 9);
//        Person Mehmet = new Person(123, "Mehmet", "Arı", "Man", birthRate, "Single", "Yes");
//
//        birthRate.set(1988, Calendar.JUNE, 9);
//        Person İsmail = new Person(145, "İsmail", "Çelik", "Man", birthRate, "Married", "Yes");
//
//        birthRate.set(1979, Calendar.JULY, 23);
//        Person Bulut = new Person(156, "Bulut", "Karadağ", "Man", birthRate, "Single", "Yes");
//
//        birthRate.set(1990, Calendar.SEPTEMBER, 23);
//        Person Serkan = new Person(167, "Serkan", "Yıldız", "Man", birthRate, "Married", "Yes");
//
//        birthRate.set(1988, Calendar.NOVEMBER, 23);
//        Person Cevdet = new Person(178, "Cevdet", "Balcı", "Man", birthRate, "Married", "No");
//
//        birthRate.set(1967, Calendar.JANUARY, 9);
//        Person Taner = new Person(189, "Taner", "Eser", "Man", birthRate, "Single", "Yes");
//
//        birthRate.set(1989, Calendar.APRIL, 5);
//        Person Mustafa = new Person(213, "Mustafa", "Emir", "Man", birthRate, "Married", "Yes");
//
//        birthRate.set(1998, Calendar.FEBRUARY, 1);
//        Person Hacer = new Person(224, "Hacer", "Paksoy", "Man", birthRate, "Married", "Yes");
//
//        birthRate.set(1989, Calendar.SEPTEMBER, 24);
//        Person Ela = new Person(236, "Ela", "Kara", "Woman", birthRate, "Married", "No");
//
//        birthRate.set(1976, Calendar.NOVEMBER, 18);
//        Person Fatma = new Person(247, "Fatma", "Esin", "Woman", birthRate, "Single", "Yes");
//
//        birthRate.set(1967, Calendar.DECEMBER, 17);
//        Person Arzu = new Person(256, "Arzu", "Öztürk", "Woman", birthRate, "Married", "Yes");
//
//        birthRate.set(1988, Calendar.JULY, 9);
//        Person Selin = new Person(267, "Selin", "Ergül", "Woman", birthRate, "Single", "No");
//
//        Calendar hireDate = Calendar.getInstance();
//
//        hireDate.set(2015, Calendar.MAY, 22);
//        Employee employeeMehmet = new Employee(123, "Mehmet", "Arı", "Man", Mehmet.getBirthDate(), "Single", "Yes", 10000, hireDate, Accounting);
//        new Employee(employeeMehmet, 10000, Accounting);
//
//        hireDate.set(2017, Calendar.OCTOBER, 10);
//        Employee employeeAyşe = new Employee(111, "Ayşe", "Çalışkan", "Woman", Ayşe.getBirthDate(), "Married", "Yes", 5000, hireDate, Accounting);
//        //employeeAyşe=new Employee(employeeAyşe, 5000, Accounting);
//
//        hireDate.set(2018, Calendar.NOVEMBER, 15);
//        Employee employeeBulut = new Employee(156, "Bulut", "Karadağ", "Man", birthRate, "Single", "Yes", 3500, hireDate, Accounting);
//        //employeeBulut= new Employee(employeeBulut, 5000, Accounting);
//
//        hireDate.set(2015, Calendar.FEBRUARY, 14);
//        Employee employeeSerkan = new Employee(167, "Serkan", "Yıldız", "Man", Serkan.getBirthDate(), "Married", "Yes", 7500, hireDate, Accounting);
//        //employeeSerkan=new Employee(employeeSerkan, 7500, Accounting);
//
//        hireDate.set(2014, Calendar.MAY, 24);
//        Employee employeeMustafa = new Employee(213, "Mustafa", "Emir", "Man", Mustafa.getBirthDate(), "Married", "Yes", 10000, hireDate, Marketing);
//        //employeeMustafa=new Employee(employeeMustafa, 10000, Marketing);
//
//        hireDate.set(2010, Calendar.MAY, 24);
//        Employee employeeArzu = new Employee(256, "Arzu", "Öztürk", "Woman", Arzu.getBirthDate(), "Married", "Yes", 15000, hireDate, Marketing);
//        //employeeArzu=new Employee(employeeArzu, 15000, Marketing);
//
//        hireDate.set(2016, Calendar.NOVEMBER, 4);
//        Employee employeeFatma = new Employee(247, "Fatma", "Esin", "Woman", Fatma.getBirthDate(), "Single", "Yes", 5000, hireDate, Marketing);
//        //employeeFatma=new Employee(employeeFatma,5000,Marketing);
//        ArrayList<Product> HacersProducts = new ArrayList();
//        HacersProducts.add(Product1);
//        HacersProducts.add(Product2);
//        HacersProducts.add(Product5);
//
//        Customer customerHacer = new Customer(224, "Hacer", "Paksoy", "Man", Hacer.getBirthDate(), "Married", "Yes", HacersProducts);
//        //customerHacer= new Customer(customerHacer, HacersProducts);
//
//        ArrayList<Product> SelinsProducts = new ArrayList<>();
//        SelinsProducts.add(Product3);
//
//        Customer customerSelin = new Customer(267, "Selin", "Ergül", "Woman", Selin.getBirthDate(), "Single", "No", SelinsProducts);
//        //customerSelin=new Customer(customerSelin, SelinsProducts);
//
//        ArrayList<Product> CevdetsProducts = new ArrayList<>();
//        CevdetsProducts.add(Product2);
//        CevdetsProducts.add(Product3);
//
//        Customer customerCevdet = new Customer(178, "Cevdet", "Balcı", "Man", Cevdet.getBirthDate(), "Married", "No", CevdetsProducts);
//        //customerCevdet= new Customer(customerSelin, CevdetsProducts);
//
//
//        Manager managerMehmet = new Manager(123, "Mehmet", "Arı", "Man", Mehmet.getBirthDate(), "Single", "Yes", 10000, hireDate, Accounting, 150000);
//        //managerMehmet=new Manager(managerMehmet, 10000, Accounting, 150000);
//
//        Manager managerArzu = new Manager(256, "Arzu", "Öztürk", "Woman", Arzu.getBirthDate(), "Married", "Yes", 15000, employeeAyşe.getHireDate(), Marketing, 100000);
//        //managerArzu=new Manager(managerArzu, 15000, Accounting, 100000);
//
//
//        RegularEmployee regularEmployeeAyşe = new RegularEmployee(111, "Ayşe", "Çalışkan", "Woman", Ayşe.getBirthDate(), "Married", "Yes", 5000, hireDate, Accounting, 25);
//        //regularEmployeeAyşe=new RegularEmployee(regularEmployeeAyşe, 25);
//
//        RegularEmployee regularEmployeeSerkan = new RegularEmployee(167, "Serkan", "Yıldız", "Man", Serkan.getBirthDate(), "Married", "Yes", 7500, hireDate, Accounting, 50);
//        //     regularEmployeeSerkan=new RegularEmployee(regularEmployeeSerkan, 50);
//
//        RegularEmployee regularEmployeeMustafa = new RegularEmployee(213, "Mustafa", "Emir", "Man", Mustafa.getBirthDate(), "Married", "Yes", 10000, hireDate, Marketing, 100);
//        //   regularEmployeeMustafa=new RegularEmployee(regularEmployeeMustafa, 100);
//
//        RegularEmployee regularEmployeeFatma = new RegularEmployee(247, "Fatma", "Esin", "Woman", Fatma.getBirthDate(), "Single", "Yes", 5000, hireDate, Marketing, 80);
//        //regularEmployeeFatma= new RegularEmployee(regularEmployeeFatma, 80);
//
//
//        ArrayList<Product> SerkansSales = new ArrayList<>();
//        SerkansSales.add(Product5);
//        SerkansSales.add(Product1);
//
//        SalesEmployee salesEmployeeSerkan = new SalesEmployee(167, "Serkan", "Yıldız", "Man", Serkan.getBirthDate(), "Married", "Yes", 7500, hireDate, Accounting, 50, SerkansSales);
//        //salesEmployeeSerkan=new SalesEmployee(salesEmployeeSerkan, 7500, SerkansSales);
//
//        ArrayList<Product> MustafasSales = new ArrayList<>();
//        MustafasSales.add(Product1);
//        MustafasSales.add(Product2);
//        MustafasSales.add(Product3);
//
//        SalesEmployee salesEmployeeMustafa = new SalesEmployee(213, "Mustafa", "Emir", "Man", Mustafa.getBirthDate(), "Married", "Yes", 10000, hireDate, Marketing, 100, MustafasSales);
//
//        ArrayList<Project> AyşesProjects = new ArrayList<>();
//        AyşesProjects.add(Creditcard);
//        AyşesProjects.add(Robotic);
//
//        Developer developerAyşe = new Developer(111, "Ayşe", "Çalışkan", "Woman", Ayşe.getBirthDate(), "Married", "Yes", 5000, hireDate, Accounting, 25, AyşesProjects);
//        //developerAyşe=new Developer(developerAyşe, AyşesProjects);
//
//        ArrayList<Project> FatmasProjects = new ArrayList<>();
//        FatmasProjects.add(FaceRecognition);
//        FatmasProjects.add(SpeechRecognition);
//
//        Developer developerFatma = new Developer(247, "Fatma", "Esin", "Woman", Fatma.getBirthDate(), "Single", "Yes", 5000, hireDate, Marketing, 80, FatmasProjects);
//        //developerFatma=new Developer(developerAyşe, AyşesProjects);
//
//
//        managerMehmet.distributeBonusBudget();
//        managerMehmet.raiseSalary(0.2);
//
//        managerArzu.distributeBonusBudget();
//        managerArzu.raiseSalary(0.2);
//
//        regularEmployeeAyşe.raiseSalary(0.3);
//        regularEmployeeFatma.raiseSalary(0.3);
//        regularEmployeeMustafa.raiseSalary(0.3);
//        regularEmployeeSerkan.raiseSalary(0.3);
//
//        developerAyşe.raiseSalary(0.23);
//        developerFatma.raiseSalary(0.23);
//
//        salesEmployeeMustafa.raiseSalary(0.18);
//        salesEmployeeSerkan.raiseSalary(0.18);
//
//        SalesEmployee maximumone= findTheSalesEmployeeWhohasmaximumSale(MustafasSales, SerkansSales,salesEmployeeMustafa,salesEmployeeSerkan);
//        maximumone.raiseSalary(1000);
//
//        System.out.println("************************************************");
//        System.out.println(Accounting);
//        System.out.println(managerMehmet);
//
//    }
//
//
//
//
//
//
//
//
//
//
//
//    private static SalesEmployee findTheSalesEmployeeWhohasmaximumSale(ArrayList<Product> mustafasSales, ArrayList<Product> serkansSales, SalesEmployee salesEmployeeMustafa, SalesEmployee salesEmployeeSerkan) {
//        double sumofmustafasproducts = 0;
//        double price1 = 0;
//        for (Product mustafasSale : mustafasSales) {
//            price1 = mustafasSale.getPrice();
//            sumofmustafasproducts += price1;
//        }
//        double sumofSerkansproducts = 0;
//        double price2 = 0;
//        for (Product serkansSale : serkansSales) {
//            price2 = serkansSale.getPrice();
//            sumofSerkansproducts += price2;
//        }
//        if (price1 > price2) {
//            return salesEmployeeMustafa;
//        }
//        else {
//            return salesEmployeeSerkan;
//        }
//
//
//    }
//
//}
