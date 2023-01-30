package Sunu_11;
import java.util.Scanner;

import static java.lang.System.out;

public class Odev_4 {
    public static void main(String[] args) {

        int sayi1 = (int) (Math.random() * 10);
        int sayi2 = (int) (Math.random() * 10);

        Scanner user = new Scanner(System.in);

        out.printf("%n%d ve %d toplamı kaçtır -> ", sayi1, sayi2);
        int result = user.nextInt();

        System.out.println((sayi1 + sayi2 == result) ? "Tebrikler Bildiniz" : "Yanlış Cevap");

        while (sayi1 + sayi2 != result) {
            out.printf("%n%d ve %d toplamı kaçtır -> ", sayi1, sayi2);
            result = user.nextInt();
            out.println((sayi1 + sayi2 == result) ? "Tebrikler Bildiniz" : "Yanlış Cevap");
        }

    }
}
