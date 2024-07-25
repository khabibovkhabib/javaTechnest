package Demo.HomeWorksMay;

import java.util.Scanner;

public class homework16May02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zəhmət olmazsa ilk fənndən olan nəticənizi qeyd edin:");
        double firstExapResult= scanner.nextDouble();
        System.out.println("Zəhmət olmazsa ikinci fənndən olan nəticənizi qeyd edin:");
        double secondExapResult= scanner.nextDouble();
        System.out.println("Zəhmət olmazsa üçüncü fənndən olan nəticənizi qeyd edin:");
        double thirdExapResult= scanner.nextDouble();
        double total= (firstExapResult+secondExapResult+thirdExapResult)/3;
        System.out.println("orta balınız: "+ total);
    }
}