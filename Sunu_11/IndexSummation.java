package Sunu_11;

public class IndexSummation {
    public static void main(String[] args) {


        System.out.print("  |");
        for (int i = 1; i < 10; i++) {
            System.out.printf("%7d", i);
        }
        System.out.println();

        System.out.print("--|");
        for (int i = 0; i < 63 ; i++) {
            System.out.print("-");
        }
        System.out.println();

        for (int i = 1; i < 10 ; i++) {
            System.out.printf("%2d|", i);
            for (int j = 1; j < 10; j++) {
                System.out.printf("%3d%d-%2d", j , i , (i + j));
            }
            System.out.println();
        }

    }
}
