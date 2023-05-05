package day6_MuratBabayigitIle;

import java.util.Scanner;

public class Q1_nextLineAtlamaSorunu {
    /*
    ==================== WISE MARKET KASA PROGRAMI ===================================
ilk programa girildiginde bizi bir menu karsilasin bu secenekler
  1 ŞARKÜTERİ ÜRÜNLERİ
  2 MANAV ÜRÜNLERİ
  3 MARKET
  secime gore ,
  4-urunleri listele ve
  5-fiyatlari gelsin
     */
    public static void main(String[] args) {
        Scanner mb = new Scanner(System.in);
        System.out.print("Adinizi ve soyadinizi giriniz : ");
        String name = mb.nextLine();

        System.out.print("Lutfen yasinizi giriniz : ");
        int age = mb.nextInt();

        /*
        Satir sonu ara bellekte kalan bosluk kullanilmalidir.
        Bunun icin bos bir nextLine kullanarak sorun cozulur.
         */

        mb.nextLine();

        System.out.print("Lutfen mesleginizi giriniz : ");
        String job = mb.nextLine();






    }
}
