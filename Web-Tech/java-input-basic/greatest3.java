import java.util.Scanner;

public class greatest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter 1st No : ");
        a = sc.nextInt();
        System.out.print("Enter 2st No : ");
        b = sc.nextInt();
        System.out.print("Enter 3st No : ");
        c = sc.nextInt();
        if (a > b && a > c)
            System.out.println("Greatest Number is " + a);
        else if (b > a && b > c)
            System.out.println("Greatest Number is " + b);
        else if (c > a && c > b)
            System.out.println("Greatest Number is " + c);
        else
            System.out.println("Duplicate Elements Are Present");
        sc.close();
    }
}
