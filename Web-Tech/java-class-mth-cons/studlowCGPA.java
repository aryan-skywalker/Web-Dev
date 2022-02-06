// 5. Write a program in java to input and display the details of n number of
// students having roll, name and cgpa as data members.
// Also display the name of the student having lowest cgpa

import java.util.*;

class student {
    int roll;
    String name;
    double cgpa;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nInput Student Roll :");
        roll = sc.nextInt();
        sc.nextLine();
        System.out.println("Input Student Name :");
        name = sc.nextLine();
        System.out.println("Input Student CGPA :");
        cgpa = sc.nextDouble();
        sc.close();
    }

    void display() {
        System.out.println("Roll = " + roll);
        System.out.println("Name = " + name);
        System.out.println("C.G.P.A. = " + cgpa);
    }

    double lowCGPA() {
        return cgpa;
    }
}

public class studlowCGPA {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Students : ");
        int n = sc.nextInt();
        sc.close();
        double low = 10;
        int i, index = 0;
        student ob[] = new student[n];
        for (i = 0; i < n; i++) {
            ob[i] = new student();
            ob[i].input();
        }
        for (i = 0; i < n; i++) {
            System.out.println("\n----Student " + (i + 1) + "----");
            ob[i].display();
        }
        for (i = 0; i < n; i++) {
            if (ob[i].cgpa < low) {
                low = ob[i].cgpa;
                index = i;
            }
        }
        System.out.println("\n----Student with lowest C.G.P.A.----");
        ob[index].display();
        
    }
}
