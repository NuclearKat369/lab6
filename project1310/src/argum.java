import java.util.Arrays;

public class argum {

    static String getNums(int...a){
        Arrays.sort(a);
        int n[] = new int[2];
        n[0] = a[a.length - 1];
        n[1] = a[0];
        String arrn = Arrays.toString(n);
        return arrn;
    }
}