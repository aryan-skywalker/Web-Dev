// 3. Write a program which will overload the area () method and display the area of acircle, 
// triangle and square as per user choice and user entered dimensions.

import java.util.*;

class Area {
    double area(double r) {
        return (3.14 * Math.pow(r, 2));
    }

    double area(double h, double b) {
        return (0.5 * h * b);
    }

    double area(float a) {
        return (Math.pow(a, 2));
    }
}

public class area_ovrl {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int c;
        Area ob = new Area();
        boolean z = true;
        while (z) {
            System.out.println("\n\n1. Area of circle");
            System.out.println("2. Area of square");
            System.out.println("3. Area of rectangle");
            System.out.println("4. EXIT");
            System.out.print("Enter your choice: ");
            c = sc.nextInt();
            switch (c) {
                case 1:
                    System.out.print("\nEnter Radius : ");
                    double r = sc.nextDouble();
                    System.out.println("\nArea of Circle : " + ob.area(r));
                    break;
                case 2:
                    System.out.print("\nEnter Height : ");
                    double h = sc.nextDouble();
                    System.out.print("Enter Breadth: ");
                    double b = sc.nextDouble();
                    System.out.println("\nArea of Triangle : " + ob.area(h, b));
                    break;
                case 3:
                    System.out.print("\nEnter Side : ");
                    float a = sc.nextFloat();
                    System.out.println("\nArea of Square : " + ob.area(a));
                    break;
                case 4:
                    z = false;
                    break;
                default:
                    System.out.println("\nInvalid Choice");
            }
        }
        sc.close();
    }
}
