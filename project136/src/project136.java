import java.util.Scanner;
import java.util.Random;

public class project136 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество элементов массива");
        int l = in.nextInt();
        int n[] = new int[l];
        Random rand = new Random();

        for (int i = 0; i < n.length; i++){
            n[i] = rand.nextInt(999999);
            System.out.print(n[i] + " ");
        }
        System.out.println();
        System.out.println("Введите количество элементов нового массива: ");
        int m = in.nextInt();
        int nn[] =  arrcopy.getArr(n, m);
        for (int i = 0; i < nn.length; i++){
            System.out.print(nn[i] + " ");
        }
    }
}