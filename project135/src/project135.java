import java.util.Scanner;

public class project135 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = in.nextInt();
        System.out.println("Сумма квадратов натуральных чисел до " + n + " равна " + sqrsum.getSqsRec(n));  //с рекурсией
        System.out.println("Сумма квадратов натуральных чисел до " + n + " равна " + sqrsum.getSqs(n));     //без рекурсии
    }
}