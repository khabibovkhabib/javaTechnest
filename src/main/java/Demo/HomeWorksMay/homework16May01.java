package Demo.HomeWorksMay;

import java.util.Scanner;

public class homework16May01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rəqəmi daxil edin");
        double firstNumber = scanner.nextDouble();
        System.out.println("Əməliyyatı seçin");
        char operation = scanner.next().charAt(0);
        System.out.println("ikinci rəqəmi daxil edin");
        double secondNumber = scanner.nextDouble();
        double  result= 0;
        if (operation=='-'){
            result= firstNumber-secondNumber;
        }
        else if(operation=='+'){
            result= firstNumber+secondNumber;
        }
        else if(operation=='*'){
            result= firstNumber*secondNumber;
        }
        else if(operation=='/'){
            if (secondNumber!=0){
                result=firstNumber/secondNumber;
            }else {
                System.out.println("0 - a bölmək mümkün deyil");
            }
        }
        else {
            System.out.println("Yanlış seçim");
        }
        System.out.println("Cavab: "+ result);
    }
}