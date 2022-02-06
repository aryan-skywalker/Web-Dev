import java.util.Scanner;
import java.lang.Math;

public class series_pow {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, j, f = 1;
        double sum = 0;
        System.out.print("Enter x : ");
        int x = sc.nextInt();
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        if (n >= 1)
            sum = 1;
        if (n > 1) {
            for (i = 1; i <= n; i++) {
                f = 1;
                for (j = 1; j <= i; j++) {
                    f = f * j;
                }
                if (i % 2 != 0)
                    sum = sum - ((Math.pow(x, i)) / f);
                else
                    sum = sum + ((Math.pow(x, i)) / f);
            }
        }
        System.out.print("Sum = " + sum);
        sc.close();
    }
}