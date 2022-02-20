// Write a program in java using inheritance to show how to call the base class parameterized constructors 
// from the derived class using super.

class Sum {
    Sum(int i, int j) {
        System.out.println("\nSum in default constructor : " + (i + j));
    }
}

class Person extends Sum {
    static int i = 5;
    static int j = 10;

    Person() {
        super(i, j);
        System.out.println("\nSum in inherited class : " + (i + j));
    }
}

public class super_inh {
    public static void main(String args[]) {
        Person ob = new Person();
    }
}
