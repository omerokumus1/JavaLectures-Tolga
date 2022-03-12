package Ch10_OOThinking;

public class Person {
    String name;
    private int age = 1;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) { // encapsulation ile bir data field'ı koruyabilir ve kısıtlama uygulayabiliriz.
        if (age >= 0)
            this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("person age: " + p.getAge());
        p.setAge(-2);
        System.out.println("person age: " + p.getAge());


    }
}
