import java.util.Scanner;

public class pos_neg {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a No. : ");
        n = sc.nextInt();
        if (n > 0)
            System.out.println("It is a positive number");
        else
            System.out.println("It is a negative number");
        sc.close();
    }
}
