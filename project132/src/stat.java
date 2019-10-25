public class stat {
    private static int x = 0;

    static void showStat() {
        for (int i = 0; i < 20; i++) {
            System.out.print(x + " ");
            x++;
        }
    }
}