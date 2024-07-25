package Demo.HomeWorksMay;

import java.util.Scanner;

public class homework30May03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zəhmət olmazsa rəqəmi daxil edin:");
        int x = scanner.nextInt();
        int sum = 0;

        while (x != 0) {
            sum += x % 10;
            x = x / 10;
        }

        System.out.println("Rəqəmlərin cəmi: " + sum);
    }
}
