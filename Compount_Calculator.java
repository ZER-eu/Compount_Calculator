import java.util.Scanner;
import java.util.Random;

public class Project_Compount_Calculator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the Principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the Interest-Rate(in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("The amount after %d year/s is $%,.2f", years, amount);
      
        scanner.close();
    
