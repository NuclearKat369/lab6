public class sqrsum {

    static long getSqsRec(int x){
        long result;
        if (x == 1) return 1;
        result  = getSqsRec (x - 1) + x * x;
        return result;
    }

    static long getSqs(int x){
        long result = 0;
        for (int y = x; y >= 1; y--){
            result = y * y + result;
        }
        return result;
    }
}
