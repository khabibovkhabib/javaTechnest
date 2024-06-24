// Main.java
package Demo.homeworks19June;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccountApp account = new BankAccountApp();
        System.out.println("Zəhmət olmazsa hesab nömrəsini daxil edin:");
        int accountNumber = sc.nextInt();
        account.setAccountNumber(accountNumber);
        System.out.println("Zəhmət olmazsa müştərinin adını daxil edin:");
        String customerName = sc.nextLine();
        account.setCustomerName(customerName);
        account.setAccountActivity(true);
        System.out.println("Zəhmət olmazsa artırmaq istədiyiniz məbləği daxil edin:");
        double increaseAmount = sc.nextDouble();
        account.increaseBalance(increaseAmount);
        System.out.println("Balans: " + account.getBalance());
        System.out.println("Zəhmət olmazsa ödəniş məbləğini daxil edin:");
        double reduceAmount = sc.nextDouble();
        account.reduceBalance(reduceAmount);
        System.out.println("Balans: " + account.getBalance());
        sc.close();
    }
}
