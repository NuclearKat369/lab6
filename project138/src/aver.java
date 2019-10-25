public class aver {

    static float getAvg(int x[]){
        int buf[] = x.clone();
        int k = 0;
        float av;
        for (int i = 0; i < buf.length; i++){
            k = k + x[i];
        }
        av = (float) k / buf.length;
        return av;
    }
}