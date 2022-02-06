// 4. Write a program in Java to define a class Rectangle having data member: lengthand breadth;
// to calculate the area and perimeter of the rectangle.
// Use member functions to read, calculate and display

import java.util.*;

class Rectangle {
    double length;
    double breadth;

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter details of Rectangle\n");
        System.out.print("Enter Length : ");
        length = sc.nextDouble();
        System.out.print("Enter Breadth : ");
        breadth = sc.nextDouble();
        sc.close();
    }

    double area() {
        return (length * breadth);
    }

    double perimeter() {
        return (2 * (length + breadth));
    }

    void display(double a, double p) {
        System.out.println("\nArea of Rectangle : " + a);
        System.out.println("Perimeter of Rectangle : " + p);
    }
}

public class rectangle {
    public static void main(String args[]) {
        Rectangle ob = new Rectangle();
        double a, p;
        ob.read();
        a = ob.area();
        p = ob.perimeter();
        ob.display(a, p);
    }
}
