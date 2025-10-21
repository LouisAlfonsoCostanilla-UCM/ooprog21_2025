


import java.util.*;

public class BankBalance{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        final double int_rate = 0.03;
        int year = 0;
        double balance;

        System.out.print("Enter initial bank balance: ");
        balance = scanner.nextInt();

        System.out.println("Do you want to see next year's balance? ");
        System.out.println("Enter 1 for yes or any number for no >> ");
        choice = scanner.nextInt();
       

        while (choice == 1) {
            year ++;
             balance = balance + (balance * int_rate);

            System.out.println("After " + year +  " year/s at 0.03 interest rate, balance is $" + balance);
            System.out.println("");

            System.out.println("Do you want to see the balance at the end of the year? ");
            System.out.println("Enter 1 for yes or any number for no >> ");
            choice = scanner.nextInt();
            
        }
        
        scanner.close();

    }
}