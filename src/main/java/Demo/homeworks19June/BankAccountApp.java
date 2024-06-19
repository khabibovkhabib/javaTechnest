package Demo.homeworks19June;

import java.util.Scanner;

public class BankAccountApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int accountNumber = 0;
        String customerName;
        double balance = 0;
        boolean accountActivity = true;

        balance = increaseBalance(balance, sc);
        System.out.println("Balans: " + getBalance(balance));

        balance = reduceBalance(balance, sc);
        System.out.println("Balans: " + getBalance(balance));

        sc.close();
    }
    public static double getBalance(double balance) {
        return balance;
    }
    public static double increaseBalance(double balance, Scanner sc) {
        System.out.println("Zəhmət olmazsa artırmaq istədiyiniz məbləği daxil edin:");
        double increaseAmount = sc.nextDouble();
        balance += increaseAmount;
        return balance;
    }
    public static double reduceBalance(double balance, Scanner sc) {
        System.out.println("Zəhmət olmazsa ödəniş məbləğini daxil edin:");
        double reduceAmount = sc.nextDouble();
        if (balance >= reduceAmount) {
            balance -= reduceAmount;
            return balance;
        } else {
            System.out.println("Balansınızda kifayət qədər məbləğ yoxdur!");
            return balance;
        }
    }
}
