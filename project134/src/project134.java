import java.util.Scanner;

public class project134 {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        System.out.println("Введите число: ");
        int y = in.nextInt();
        if (y < 0 ) System.out.println("Ошибка!");
        else if (y < 70) {
            System.out.println("Двойной факториал числа " + y + " равен " + fact.factor(y));    // без рекурсии
            System.out.println("Двойной факториал числа " + y + " равен " + fact.factorRec(y)); // с рекурсией
        }
        else System.out.println("Получится слишком большое число.");
    }
}
