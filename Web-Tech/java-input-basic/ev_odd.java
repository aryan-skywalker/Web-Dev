import java.util.Scanner;

public class ev_odd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a No. : ");
        n = sc.nextInt();
        if (n % 2 == 0)
            System.out.println("It is an Even number");
        else
            System.out.println("It is a Odd number");
        sc.close();
    }
}
