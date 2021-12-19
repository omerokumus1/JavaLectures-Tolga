public class PrintF {
    public static void main(String[] args) {

        String name = "Ömer";
        String surname = "Okumuş";
        int age = 25;
        String school = "Marmara University";
        String program = "Master";
        String department = "Computer Science";
        String undergrad = "Marmara University";
        String undergradDep = "Computer Science";
        double undergradGPA = 3.5;
        double gpa = 0.0;
        System.out.println("\nHi, my name is " + name + ", and my surname is " + surname + ". I am " + age + " years old."
                + "I am studying at " + school + " at " + program + " program at " + department + ".\nI am graduated" +
                " from " + undergrad + " at " + undergradDep + ". My undergrad gpa is " + undergradGPA + ". My current" +
                " gpa is " + gpa + "\n");

        System.out.printf("Hi, my name is %s, and my surname is %s. I am %d years old. I am studying at %s at %s program at" +
                        " %s.\nI am graduated from %s at %s. My undergrad gpa is %.2f. My current gpa is %.2f.\n", name, surname, age,
                school, program, department, undergrad, undergradDep, undergradGPA, gpa);

        System.out.printf("%30s%30s\n", "Programming Language", "Release Date");
        System.out.printf("%30s%30s\n", "Java", "1980");
        System.out.printf("%30s%30s\n", "C", "1975");
        System.out.printf("%30s%30s\n", "Python", "2005");

        System.out.printf("%-30s%-30s\n", "Programming Language", "Release Date");
        System.out.printf("%-30s%-30s\n", "Java", "1980");
        System.out.printf("%-30s%-30s\n", "C", "1975");
        System.out.printf("%-30s%-30s\n", "Python", "2005");


    }
}
