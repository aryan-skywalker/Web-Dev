import java.util.Scanner;

public class prime {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int n = sc.nextInt();
            int i, count = 0;
            if (n == 1)
                System.out.println("Composite Number");
            else if (n == 2)
                System.out.println("Prime Number");
            else {
                for (i=2;i<=n/2;i++ ) {
                    if (n % i == 0)
                    {
                        count++;
                        break;
                    }
                }
                if (count == 0)
                    System.out.println("Prime Number");
                else
                    System.out.println("Composite Number");
            }
            sc.close();
        }
    }
}