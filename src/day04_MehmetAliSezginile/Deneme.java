package day04_MehmetAliSezginile;

import java.util.Scanner;

public class Deneme {

    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        /*
         * ask user to create a password.
         * it should have at least
         * 1 special char
         * 1 uppercase
         * 1 lowercase
         * 1 digit
         * the length of password should be at least 8 characters
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz : ");
        String sifre = scan.next();
        int sayac = scan.nextInt();

        if (sifre.length()<8){
            System.out.println("Sifre en az 8 karakterli olmali");
            sayac++;
        }






    }
}
