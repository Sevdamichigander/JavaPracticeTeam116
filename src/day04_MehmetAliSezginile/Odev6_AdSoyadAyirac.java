package day04_MehmetAliSezginile;

import java.util.Scanner;

public class Odev6_AdSoyadAyirac {
    public static void main(String[] args) {
        // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
        // ad ayrı soyad ayrı sekilde ekrana yazdırınız.

        Scanner input = new Scanner(System.in); // Scanner nesnesi oluşturuyoruz.

        System.out.print("Lütfen adınızı ve soyadınızı aralarında bir boşluk bırakarak giriniz: ");
        String adSoyad = input.nextLine(); // Kullanıcıdan ad soyadı tek seferde girdi alıyoruz.

        String[] kelime = adSoyad.split(" "); // Girilen ad soyadı boşluk karakterine göre ayırıp kelime dizisine atıyoruz.

        String ad = kelime[0]; // İlk kelime adımız olacak.
        String soyad = kelime[1]; // İkinci kelime soyadımız olacak.

        System.out.println("Adınız: " + ad); // Adımızı ekrana yazdırıyoruz.
        System.out.println("Soyadınız: " + soyad); // Soyadımızı ekrana yazdırıyoruz.

    }
}


