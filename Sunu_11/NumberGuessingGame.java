package Sunu_11;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        int random = (int)(Math.random() * 101);

        System.out.println("0 - 100 arasında rastgele bir sayı oluşturuldu\nSayıyı tahmin ediniz.");
        System.out.print("\n-> ");

        Scanner user = new Scanner(System.in);

        int guess = user.nextInt();

        if (guess == random) System.out.println("Tebrikler bildiniz.");
        else if (guess > random) System.out.println("Tahmininiz sayıdan büyük.");
        else System.out.println("Tahmininiz sayıdan küçük.");

        while (guess != random) {
            System.out.print("\nSayıyı tahmin ediniz -> ");
            guess = user.nextInt();

            if (guess == random) System.out.println("Tebrikler bildiniz.");
            else if (guess > random) System.out.println("Tahmininiz sayıdan büyük.");
            else System.out.println("Tahmininiz sayıdan küçük.");
        }

    }
}
