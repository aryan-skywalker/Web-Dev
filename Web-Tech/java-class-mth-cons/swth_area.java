// 6. Write a program to calculate area according to user input, whether it is circle, squareor triangle (Menu Driven).

import java.util.*;
import java.util.Scanner;

public class swth_area {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Area of circle");
            System.out.println("2. Area of square");
            System.out.println("3. Area of rectangle");
            System.out.println("4. EXIT");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\nEnter radius of Circle: ");
                    double r = sc.nextDouble();
                    double ca = 3.14 * r * r;
                    System.out.println("Area of Circle = " + ca);
                    break;

                case 2:
                    System.out.print("\nEnter side of Square: ");
                    double side = sc.nextDouble();
                    double sa = side * side;
                    System.out.println("Area of Square = " + sa);
                    break;

                case 3:
                    double b, h, ta;
                    System.out.print("\nEnter Breadth of Triangle: ");
                    b = sc.nextDouble();
                    System.out.print("Enter height of Triangle: ");
                    h = sc.nextDouble();
                    ta = (b * h) / 2;
                    System.out.println("Area of Triangle is = " + ta);
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("\nWrong choice!");
            }
        }
    }
}