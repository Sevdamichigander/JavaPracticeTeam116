package day04_MehmetAliSezginile;

import java.util.Arrays;
import java.util.Scanner;

public class Q1_aciklamasiz {

        /*
        Bir array icerisindeki degerleri gosteren bir java programi olusturun
         */


    static int size;
    static Scanner scan = new Scanner(System.in);

    public static void printArrayMethod() {
        System.out.println("Lutfen Array in size ini belirtin...");
        size = scan.nextInt();
        int[] ogrencilerinYaslari = new int[size];

        System.out.println("Lutfen Ogrencilerin Yaslarini giriniz");
        for (int i = 0; i < size; i++) {
            System.out.println(i + 1 + ". Veri");
            ogrencilerinYaslari[i] = scan.nextInt();
        }
        System.out.println("Olusturulan Array icerisinde ki verilerin ciktisi...");
        for (int i = 0; i < size; i++) {
            System.out.print(ogrencilerinYaslari[i] + ", "); // 15, 16,
        }

        System.out.println(Arrays.toString(ogrencilerinYaslari));  //[15, 16]
    }

    public static void main(String[] args) {
        printArrayMethod();
    }
}
