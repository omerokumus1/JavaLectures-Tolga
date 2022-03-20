package HW.LabHomeworkCompany;

import java.util.Calendar;
import java.util.Date;

public class Person {

    // id: int- firstName: String  lastName: String  gender: byte  birthDate: java.util.Calendar maritalStatus: byte hasDriverLicence: boolean
    private int id;
    private String firstName;
    private String lastName;


    private byte gender;
    private Calendar birthDate;
    private byte maritalStatus;
    private boolean hasDriverLicence;

    public Person(int id, String firstName, String Lastname,
                  String gender, Calendar Birthrate, String maritalStatus,
                  String hasDriverLicence) throws Exception {
        this.id = id;
        this.firstName = firstName;
        this.lastName = Lastname;
        this.setGender(gender);
        this.setMaritalStatus(maritalStatus);
        this.birthDate = Birthrate;
        this.setHasDriverLicence(hasDriverLicence);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        if (gender == 1) {
            return "Man";
        } else
            return "Woman";
    }

    public void setGender(String gender) throws Exception {
        if (gender.equals("Man")) {
            this.gender = 1;
        } else if (gender.equals("Woman")) {
            this.gender = 2;
        } else throw new Exception("Invalid input");
    }

    public Calendar getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Calendar birthDate) {
        this.birthDate = birthDate;
    }

    public String getMaritalStatus() {
        if (maritalStatus == 1) {
            return "Single";
        } else return "Married";
    }

    public void setMaritalStatus(String maritalStatus) throws Exception {
        if (maritalStatus.equals("Single")) {
            this.maritalStatus = 1;
        } else if (maritalStatus.equals("Married")) {
            this.maritalStatus = 2;
        } else throw new Exception("Invalid input !");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String isHasDriverLicence() {
        if (hasDriverLicence) {
            return "Yes";
        } else return "No";
    }

    public void setHasDriverLicence(String hasDriverLicence) throws Exception {
        if (hasDriverLicence.equalsIgnoreCase("yes")) {
            this.hasDriverLicence = true;
        } else if (hasDriverLicence.equalsIgnoreCase("no")) {
            this.hasDriverLicence = false;
        } else throw new Exception("Invalid input!!");
    }

    @Override
    public String toString() {
        return "\t\t\t\tPerson Info [" +
                "id=" + id +
                ", firstName=" + firstName +
                ", lastName=" + lastName +
                ", gender=" + getGender() +
                "]";
    }

    public void printInfo() {
        System.out.println("Person [" + id + ", firstName=" + firstName + ", lastName=" + lastName
                + ", gender=" + getGender() + ", birthDate=" + getDateFormatted(birthDate)
                + ", maritalStatus=" + getMaritalStatus() + ", hasDriverLicence=" + isHasDriverLicence() + "]");
    }

    public String getDateFormatted(Calendar calendar) {
        return calendar.get(Calendar.DAY_OF_MONTH) + "/" + (calendar.get(Calendar.MONTH) + 1) + "/" + calendar.get(Calendar.YEAR);
    }
}




