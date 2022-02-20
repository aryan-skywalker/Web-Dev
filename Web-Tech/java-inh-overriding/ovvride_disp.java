// Write a program to create an Account class containing acc_no, balance as data members and disp() to display the details. 
// Inherit it in Person class with all mentioned data members and functions. 
// Person class also has name and aadhar_no as extra data members of its own. Override disp() function. 
// Create 5 persons details.

import java.util.*;

class Account {
    int acc_no;
    double balance;

    void disp() {
        System.out.println("Account Number : " + acc_no);
        System.out.println("Account Balance : " + balance);
    }
}

class Person extends Account {
    String name;
    long aadhar_no;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Account Number : ");
        acc_no = sc.nextInt();
        System.out.print("Enter Account Balance : ");
        balance = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Name : ");
        name = sc.nextLine();
        System.out.print("Enter Aadhar no. : ");
        aadhar_no = sc.nextLong();
    }

    void disp() {
        System.out.println("\nAccount Number : " + acc_no);
        System.out.println("Account Balance : " + balance);
        System.out.println("Name : " + name);
        System.out.println("Aadhar no. : " + aadhar_no);
    }
}

public class ovvride_disp {
    public static void main(String args[]) {
        Person ob[] = new Person[5];
        for (int i = 0; i < 5; i++) {
            ob[i] = new Person();
            ob[i].input();
        }
        for (int i = 0; i < 5; i++) {
            ob[i].disp();
        }
    }
}
