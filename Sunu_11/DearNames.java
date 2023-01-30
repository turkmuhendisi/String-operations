package Sunu_11;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class DearNames {
    public static void main(String[] args) throws IOException {

        // Version - 1

        /*File file = new File("Sunu_11/isimler.txt");
        Scanner text = new Scanner(file);*/

        // Version - 2

        File file2 = new File("Sunu_11/isimler2.txt");
        Scanner text2 = new Scanner(file2);

        File newFile = new File("Sunu_11/dearNames.txt");
        FileWriter fileWriter = new FileWriter(newFile, true);
        BufferedWriter newText = new BufferedWriter(fileWriter);

        String[] line = new String[30];
        int indexCounter = 0;

        // Version - 1

        /*while (text2.hasNextLine()) {
            line[indexCounter] = "Sayın " + text2.nextLine() + "\n";
            indexCounter++;
        }*/

        // Version - 2

        while (text2.hasNextLine()) {
            line[indexCounter] = "Sayın " + (text2.nextLine().trim()).replaceAll(" ","") + "\n";
            indexCounter++;
        }

        for (String s : line) {
            newText.append(s);
        }


        newText.close();




    }
}
