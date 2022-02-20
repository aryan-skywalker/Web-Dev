// Write a program in java to define a class Shape which has data member „area‟and amember function showArea(). 
// Derive two classes Circle and Rectangle from Shapeclass. 
// Add appropriate data members and member functions to calculate and displaythe area of Circle and Rectangle.

import java.util.*;

class Shape {
    double area;

    void showArea() {
        System.out.println("Area = " + area);
    }
}

class Circle extends Shape {
    Circle(int r) {
        area = 3.14 * Math.pow(r, 2);
        showArea();
    }
}

class Rectangle extends Shape {
    Rectangle(int l, int b) {
        area = l * b;
        showArea();
    }
}

public class bsclss_showarea {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        int l, b, r;
        r = sc.nextInt();
        System.out.print("Enter length and breadth  : ");
        l = sc.nextInt();
        b = sc.nextInt();
        System.out.println("\n--Area of Circle--");
        Circle ob1 = new Circle(r);
        System.out.println("\n--Area of Reactangle--");
        Rectangle ob2 = new Rectangle(l, b);
        sc.close();
    }
}
