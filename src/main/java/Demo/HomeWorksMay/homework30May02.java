package Demo.HomeWorksMay;

import java.util.Scanner;

public class homework30May02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zəhmət olmazsa ilk rəqəmi daxil edin:");
        double firstNumber = scanner.nextDouble();
        System.out.println("Zəhmət olmazsa ikinci rəqəmi daxil edin:");
        double secondNumber = scanner.nextDouble();
        System.out.println("Maksimum rəqəm: " + findMax(firstNumber, secondNumber));
        scanner.close();
    }

    public static double findMax(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
