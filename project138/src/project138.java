import java.util.Scanner;
import java.util.Random;

public class project138 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int n = in.nextInt();
        Random rand = new Random();
        int arr[] = new int[n];
        System.out.println("Сформирован массив: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(99);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Среднее значение элементов массива равно " + aver.getAvg(arr));
    }
}