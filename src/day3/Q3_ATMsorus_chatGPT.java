package day3;

import java.util.Scanner;

public class Q3_ATMsorus_chatGPT {
    private static double bakiye = 5000; // ATM'nin başlangıç bakiyesi

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıyı karşılayan metot
        System.out.println("ATM'ye hoş geldiniz. Ne yapmak istersiniz?");
        System.out.println("1- Bakiyenizi görüntüleyin");
        System.out.println("2- Para yatırın");
        System.out.println("3- Para çekin");
        System.out.println("4- Çıkış yapın");
        System.out.print("Seçiminiz: ");
        int secim = input.nextInt();

        switch (secim) {
            case 1:
                bakiyeGoruntule();
                break;
            case 2:
                paraYatir();
                break;
            case 3:
                paraCek();
                break;
            case 4:
                System.out.println("ATM'den çıkış yapılıyor...");
                break;
            default:
                System.out.println("Geçersiz seçim.");
        }

        input.close();
    }

    // Bakiye görüntüleme metodu
    public static void bakiyeGoruntule() {
        System.out.println("Bakiyeniz: " + bakiye + " TL");
    }

    // Para yatırma metodu
    public static void paraYatir() {
        Scanner input = new Scanner(System.in);

        System.out.print("Yatırmak istediğiniz tutarı girin: ");
        double tutar = input.nextDouble();

        bakiye += tutar;
        System.out.println(tutar + " TL yatırıldı. Yeni bakiyeniz: " + bakiye + " TL");

        input.close();
    }

    // Para çekme metodu
    public static void paraCek() {
        Scanner input = new Scanner(System.in);

        System.out.print("Çekmek istediğiniz tutarı girin: ");
        double tutar = input.nextDouble();

        if (tutar > bakiye) {
            System.out.println("Yetersiz bakiye.");
        } else {
            bakiye -= tutar;
            System.out.println(tutar + " TL çekildi. Yeni bakiyeniz: " + bakiye + " TL");
        }

        input.close();
    }
}
