import java.util.Arrays;

public class test {
    char sym;
    String text;

    public void setData(char s){
        sym = s;
        System.out.println(sym);
    }

    public void setData(String t){
        text = t;
        System.out.println(text);
    }

    public void setData(char arr[]){

            if (arr.length == 1) {
                sym = arr[0];
                System.out.println(sym);
            }
            else {
                text = Arrays.toString(arr);
                System.out.println(text);
            }
    }

}