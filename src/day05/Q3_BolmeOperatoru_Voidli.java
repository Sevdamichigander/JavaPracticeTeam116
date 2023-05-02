package day05;

import java.util.Scanner;

public class Q3_BolmeOperatoru_Voidli {

    //void de benim icin islemin yapilmasi yeterli. Bana birsey dondurmesine gerek yok. Okul kaydinda kayit isleminin yapilmasi gibi.
    // Kayit makbuzu verimese de kayit islemi yapilmistir.


        // Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
        // kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.

        static int bolum = 0; // bolumu dongunun icerisinde saymasi icin her seferinde artacak bir sayac olusturdum
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Lutfen bolmek istediginiz sayiyi giriniz: ");
            int a = scan.nextInt();
            System.out.println("Lutfen bolen sayiyi giriniz: ");
            int b = scan.nextInt();
            bol(a, b); // Bu adimda method calisir ama bize bisey dondurmez
        }
        public static void bol(int bolunen, int bolen){
            while(bolunen>=bolen){
                bolunen-=bolen;
                bolum++;
            }
            System.out.println("Burada bolum yazdirilir " + bolum);
        }

}
