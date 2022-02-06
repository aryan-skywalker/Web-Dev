import java.util.Scanner;

public class greater2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.print("Enter 1st No. : ");
        n1 = sc.nextInt();
        System.out.print("Enter 2nd No. : ");
        n2 = sc.nextInt();
        System.out.print("The greater no between the two is : ");
        System.out.print(n1 > n2 ? n1 : n2);
        sc.close();
    }
}
