import java.util.Scanner;

public class biodata {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Roll No. : ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Branch : ");
        String branch = sc.nextLine();
        System.out.println("\n\tBIODATA\t");
        System.out.print("Name = " + name + "\nRoll No. = " + roll + "\nBranch = " + branch);
        sc.close();
    }
}