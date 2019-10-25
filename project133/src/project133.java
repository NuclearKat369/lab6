import java.util.Random;
import java.util.Scanner;

public class project133 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите желаемое количество чисел: ");
        int n = in.nextInt();
        Random rand = new Random();
        int g[] = new int [n];
        for (int i = 0; i < n; i++){
            g[i] = rand.nextInt(999);
        }
        System.out.println("Передан набор чисел: ");
        stat.setData(g);
        System.out.println();
        System.out.println("Наибольшее значение, наименьшее значение, среднее значение из заданного набора чисел: ");
        stat.showData();
    }
}