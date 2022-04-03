package Ch13_AbstractClassesAndInterfaces.Ch13_1_Intro;

import java.util.Arrays;

public class ComparableInterface {
    public static void main(String[] args) throws CloneNotSupportedException {
        A a1 = new A(1);
//        A a2 = new A();
//        a1.compareTo(a2);
//        Arrays.sort();

        A[] as = {
                new A(12),
                new A(2),
                new A(5),
                new A(1),
                new A(8),
                new A(9),
                new A(4),
                new A(111),
        };

        System.out.println(Arrays.toString(as));
        Arrays.sort(as);
        System.out.println(Arrays.toString(as));

        A a3 = a1.clone();
        System.out.println(a3 + " " + a1);
    }
}


class A implements Comparable<A>, Cloneable {
    private int id;
    A(int id){
        this.id = id;
    }

    @Override
    public int compareTo(A o) {
        if (this.id < o.id)
            return -1;
        else if (this.id == o.id)
            return 0;
        else
            return 1;
    }

    @Override
    public String toString() {
        return "A{" +
                "id=" + id +
                '}';
    }

    @Override
    public A clone() throws CloneNotSupportedException {
        return (A) super.clone();
    }
}