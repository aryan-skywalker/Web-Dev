import java.util.Scanner;

public class smallest2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.print("Enter 1st No. : ");
        n1 = sc.nextInt();
        System.out.print("Enter 2nd No. : ");
        n2 = sc.nextInt();
        if (n2 < n1)
            System.out.println(n2 + " is the smallest number.");
        else if (n1 < n2)
            System.out.println(n1 + " is the smallest number.");
        else
            System.out.println(n1 + " and " + n2 + " are equal.");
        sc.close();
    }
}
