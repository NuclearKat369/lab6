import java.util.Scanner;

public class project139 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String text = in.nextLine();
        char t[] = text.toCharArray();
        System.out.println("Массив после перестановки: ");
        System.out.println(change.swap(t));

    }
}


//Напишите программу со статическим методом, аргументом
// которому передается одномерный символьный массив. В результате
// вызова метода элементы массива попарно меняются местами:
// первый — с последним, второй — с предпоследним и так далее.