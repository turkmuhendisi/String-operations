package Sunu_11;

public class Loops_1a {
    public static void main(String[] args) {

        /*
        Konsolda alt alta aşağıdaki on bin adet mesajı çıktı veren Java
        programını while döngüsü ile yazınız ..(Not println print vb
        metottan 1 tane kullanınız.)

        Yazilim Muhendisligi-1
        Yazilim Muhendisligi-3
        Yazilim Muhendisligi-4
        ...

        */

        String text1 = "Yazilim Muhendisligi";
        String text2 = "Cok Calismaliyiz Cokk";


        // With while

        /*int sayac = 0;

        while (sayac < 10000) {
            System.out.println(text1 + "-" + (sayac + 1));
            sayac++;
        }*/

        // With for

        /*for (int i = 0; i < 10000; i++) {
            System.out.println(text1 + "-" + (i + 1));
        }*/

        /*System.out.println(text1 + "-1");
        for (int i = 3; i <= 10000; i += 2) {
            System.out.println(text2 + "-" + (i - 1));
            System.out.println(text1 + "-" + i);
        }
        System.out.println(text2 + "-10000");*/

        // With while

        int loopCounter = 0;
        int loopFor1 = 1, loopFor2 = 2;

        while (loopCounter < 5000) {

            System.out.println(text1 + "-" + loopFor1);
            loopFor1 += 2;

            System.out.println(text2 + "-" + loopFor2);
            loopFor2 += 2;

            loopCounter++;

        }

    }
}
