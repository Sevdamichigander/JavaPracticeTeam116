package day03;

import java.util.Scanner;

public class Q3_ATM_GrupCalismasiile {
    /*
Bir Java ATM programi yaziniz asagidaki kurallara gore;
1-Kullaniciyi karsilayan bir method yazin ve yapmak istedigi islemleri sorun
2-Kullanici Bakiyesini gorebilmesi icin method yaziniz (default bakiye 5000)
3-Kullanici Deposito yatirabilsin
4-Kullanici Para cekebilsin
5-Kullanici Cikis yapsin
*/
    static Scanner scan = new Scanner(System.in);

    static double bakiye = 5000;
    static double paraYatirma;
    static int cekilenPara;

    static int islemSayisi;

    public static void bankamizaHosGeldiniz() {

        System.out.println(" ***** Hos Geldiniz ***** ");
        System.out.println(" Lutfen yapmak istediginiz islem numarasini giriniz " +
                "\n1- Bakiye " +
                "\n2- Para Yatırma " +
                "\n3- Para Cekme " +
                "\n4- Cikis ");

        islemSayisi = scan.nextInt();

        if (islemSayisi > 4 || islemSayisi < 1) {
            System.out.println("Hatali Giris Yaptiniz");
        }
    }

    public static void bakiyeOgrenme() {
        System.out.println("Bakiyeniz : " + bakiye);
    }

    public static void paraYatirma() {
        System.out.println("Yatirmak istediginiz tutari giriniz");

        paraYatirma = scan.nextDouble();

        bakiye += paraYatirma;
        System.out.println("Bakiyeniz : " + bakiye);
    }

    public static void cekilenPara() {
        System.out.println("Lutfen cekmek istediginiz tutari giriniz");
        cekilenPara = scan.nextInt();
        if (bakiye < cekilenPara || cekilenPara > 5000) {
            System.out.println("Yanlis tutar girisi - Gecersiz islem");

            cekilenPara();

        } else {
            bakiye = bakiye - cekilenPara; //bakiye-=çekilenpara;
            System.out.println("Bakiyi : " + bakiye);
        }
    }

    public static void cikis() {
        System.out.println("Bizi tercih ettiginiz icin pisman olmayacaksiniz");
    }

    public static void islemSayisi() {

        do {
            bankamizaHosGeldiniz();

            switch (islemSayisi) {
                case 1:
                    bakiyeOgrenme();
                    break;
                case 2:
                    paraYatirma();
                    break;
                case 3:
                    cekilenPara();
                    break;
                case 4:
                    cikis();
                    break;
            }
        } while (islemSayisi != 4);
    }
    public static void main(String[] args) {
        islemSayisi();
    }
}
