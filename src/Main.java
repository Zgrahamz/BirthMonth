// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int bMo;

        System.out.println("Enter your birth month (1-12)");
        bMo = sca.nextInt();

        if (bMo > 12 || bMo < 1) {
            System.out.println("You entered an incorrect month value: " + bMo);
        } else {
            System.out.println("Your birth month is: " + bMo);
        }
    }
}