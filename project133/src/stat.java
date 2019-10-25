import java.util.Arrays;

 class stat {
    static int arr[];

    static void setData(int...a) {

        arr = a.clone();
        for (int j = 0 ; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }

    static void showData(){
        Arrays.sort(arr);

        int min = arr[0];
        int max = arr[arr.length-1];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        float avg = (float) sum / arr.length;
        System.out.print(max + " " + min + " ");
        System.out.println(avg);
    }
}