package DZ_java.Java_DZ_1;

import java.util.Scanner;

public class task3 {
    public static void main(String [] arg ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double num1 =  scanner.nextDouble();
        System.out.println("Введите операцию (/, *, +, -)");
        String operation = scanner.next();
        System.out.println("Введите второе число: ");
        double num2= scanner.nextDouble();
        scanner.close();
        calc(num1, num2, operation);
    }

    public static void calc(double num1, double num2, String operation) {
        double result=0;
        switch(operation){
            case "+": {
                result= num1+num2;
                break;
            }
            case "-":{
                result=num1-num2;
                break;
            }
            case "/":{
                result=num1/num2;
                break;
            }
            case "*":{
                result=num1*num2;
                break;
            }
        }
    System.out.println("Результат = "+ result);
    }
}
