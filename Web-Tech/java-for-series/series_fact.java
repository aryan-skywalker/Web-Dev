import java.util.Scanner;
import java.lang.Math;

public class series_fact {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, j, f = 1;
        double sum = 0;
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        if (n >= 1)
            sum = 1;
        if (n > 1) {

            for (i = 2; i <= n; i++) {
                f = 1;
                for (j = 1; j <= i; j++) {
                    f = f * j;
                }
                sum = sum + ((Math.pow(i, i)) / f);
            }
        }

        System.out.print("Sum = " + sum);
        sc.close();
    }
}