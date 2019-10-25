public class arrcopy {

    static int[] getArr(int x[], int y) {
        int a[] = new int[y];
        for (int i = 0; i < y; i++){
            if (y < x.length) a[i] = x[i];
            else a = x.clone();
            }
        return (a);
    }
}