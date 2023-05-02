package day04_MehmetAliSezginile;

import java.util.Arrays;
import java.util.Scanner;

public class Q2_ArrayElementlerininToplami {

    // Kullanicidan alinan size ile bir int array olusturun ve
    // array icerisindeki elemanlarin toplamini veren bir java methodu yazin.

    static int size;
    static Scanner scan = new Scanner(System.in);

    public static void arrayElemanlariToplami() {

        System.out.println("Lutfen array in size ini belirtin");
        size = scan.nextInt();

        int[] employeeSalary = new int[size];


        // array i create etmek icin for loop kullanalim
        for (int i = 0; i < size; i++) {
            System.out.println(1+i+". calisan");
            employeeSalary[i] = scan.nextInt();

        } //array icindeki verileri toplamak
        int toplam = 0;

        for (int i = 0; i < size; i++) {
            toplam += employeeSalary[i];

        }

        System.out.println(Arrays.toString(employeeSalary));

        System.out.println("Calisanlarin maaslari toplami : " + toplam);
    }

    public static void main(String[] args) {
        arrayElemanlariToplami();
    }
}
