import java.util.Scanner;
import java.util.Random;

public class project1310 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество элементов: ");
        int n = in.nextInt();
        Random rand = new Random();
        int arr[] = new int[n];
        System.out.println("Сформирован ряд чисел: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(99);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Максимальное и минимальное значение заданного ряда чисел: ");
        System.out.print(argum.getNums(arr));
    }
}