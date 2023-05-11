package day03;

import java.util.Scanner;

public class Q2_avecChatGPTile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ayı girin (1-12): ");
        int ay = input.nextInt();

        String mevsim = "";

        if (ay == 12 || ay == 1 || ay == 2) {
            mevsim = "Kış";
        }
        else if (ay >= 3 && ay <= 5) {
            mevsim = "İlkbahar";
        }
        else if (ay >= 6 && ay <= 8) {
            mevsim = "Yaz";
        }
        else if (ay >= 9 && ay <= 11) {
            mevsim = "Sonbahar";
        }
        else {
            System.out.println("Hatalı ay girdiniz!");
            System.exit(0);
        }

        System.out.println("Doğduğunuz ayın mevsimi: " + mevsim);

        input.close();
    }
}
