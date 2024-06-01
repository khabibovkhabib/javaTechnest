package Demo;

import java.util.Scanner;

public class homework30May03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zəhmət olmazsa ilk rəqəmi daxil edin:");
        double firstNumber = scanner.nextDouble();
        System.out.println("Zəhmət olmazsa ikinci rəqəmi daxil edin:");
        double secondNumber = scanner.nextDouble();
        System.out.println("Rəqəmlərin cəmi: " + sum(firstNumber, secondNumber));
        scanner.close();
    }
    public static double sum(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }
}
