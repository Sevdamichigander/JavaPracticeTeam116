package day05;

import java.util.Scanner;

public class Q2_BolmeOperatoruOlmadanBolme {

    // Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
    // kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.
    static int bolum = 0; // bolumu dongunun icerisinde saymasi icin her seferinde artacak bir sayac olusturdum

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bolmek istediginiz sayiyi giriniz: ");
        int a = scan.nextInt();
        System.out.println("Lutfen bolen sayiyi giriniz: ");
        int b = scan.nextInt();
        System.out.println(bol(a, b));
        // System.out.println(bolunen + " / " + bolen + " = " + bolum);
        // System.out.println("Bolum = "+ bolum);
    }

    public static int bol(int bolunen, int bolen) {
        while (bolunen >= bolen) {
            bolunen -= bolen;
            bolum++;
        }
        return bolum;
    }

}

// return type = data turu
// void==> dondurmeyen method
//methode signature = isim+parametre


