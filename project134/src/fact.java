public class fact {

    static long factor(int num) {
        long n = num;
        while ((num - 2) > 0) {
            n = n * (num - 2);
            num = num - 2;
        }
        return n;
    }
    static long factorRec(int num) {
        long result;
        if (num == 1) return 1;
        if (num == 2) return 2;
        result = factorRec(num - 2) * num;
        return result;
    }
}




//Напишите программу, в которой описан статический метод для вычисления
//двойного факториала числа, переданного аргументом методу. По определению, двойной
//факториал числа п (обозначается как n!!) — это произведение через одно всех чисел, не
//больших числа п. То есть n!! = п * (n - 2) * (п - 4)* ... (последний множитель равен 1 для
//нечетного п и равен 2 для четного n). Например, 6!! = 6 х 4 х 2 = 48 и 5!! = 5 х 3 х 1 = 15.
//Предложите версию метода без рекурсии и с рекурсией.


