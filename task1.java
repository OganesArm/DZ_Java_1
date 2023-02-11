package DZ_java.Java_DZ_1;
import java.util.Scanner;
// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
//(произведение чисел от 1 до n)
public class task1 {
    public static void main(String[] args) {


        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n = ");
        int n = iScanner.nextInt(); 
        iScanner.close();

        int Tn;
        Tn = (n*(n+1))/2;
        System.out.printf("Треугольное число для n = %d: %d\n", n, Tn);

        int factorial = 1;
        if (n == 0 && n == 1) {
            factorial = 1;
        } else {
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
        }
        System.out.printf("Факториал для числа n = %d: n! = %d", n, factorial);
    }
}