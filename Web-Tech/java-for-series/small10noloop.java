import java.util.Scanner;

public class small10noloop{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int small = 9999;
        System.out.print("Enter 10 no. : ");
        int n1 = sc.nextInt();
        if (n1 < small)
            small = n1;
        int n2 = sc.nextInt();
        if (n2 < small)
            small = n2;
        int n3 = sc.nextInt();
        if (n3 < small)
            small = n3;
        int n4 = sc.nextInt();
        if (n4 < small)
            small = n4;
        int n5 = sc.nextInt();
        if (n5 < small)
            small = n5;
        int n6 = sc.nextInt();
        if (n6 < small)
            small = n6;
        int n7 = sc.nextInt();
        if (n7 < small)
            small = n7;
        int n8 = sc.nextInt();
        if (n8 < small)
            small = n8;
        int n9 = sc.nextInt();
        if (n9 < small)
            small = n9;
        int n10 = sc.nextInt();
        if (n10 < small)
            small = n10;
        System.out.print("The smallest among 10 digits inputted is " + small);
        sc.close();
    }
}