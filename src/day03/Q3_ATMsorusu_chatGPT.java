package day03;

import java.util.Scanner;

public class Q3_ATMsorusu_chatGPT {

            /*
            Bir Java ATM programi yaziniz asagidaki kurallara gore;
            1-Kullaniciyi karsilayan bir method yazin ve yapmak istedigi islemleri sorun
            2-Kullanici Bakiyesini gorebilmesi icin method yaziniz (default bakiye 5000)
            3-Kullanici Deposito yatirabilsin
            4-Kullanici Para cekebilsin
            5-Kullanici Cikis yapsin
             */

    private static double bakiye = 5000;            // Bu satır, ATM'nin başlangıç bakiyesini 5000 TL olarak tanımlıyor.
                                                    // Private anahtar kelimesi, bu değişkenin sadece bu sınıf içinde erişilebilir olduğunu belirtiyor.

    public static void main(String[] args) {        //Bu satır, main adlı bir metodu tanımlar.
                                                    // Bu metot, programın çalıştırıldığı ana giriş noktasıdır.
        Scanner input = new Scanner(System.in);     //Bu satır, java.util.Scanner sınıfını kullanarak kullanıcıdan
                                                    // girdi almak için bir nesne oluşturur.

        // Kullanıcıyı karşılayan metot

        System.out.println("ATM'ye hoş geldiniz. Ne yapmak istersiniz?");
        System.out.println("1- Bakiyenizi görüntüleyin");
        System.out.println("2- Para yatırın");
        System.out.println("3- Para çekin");
        System.out.println("4- Çıkış yapın");
        System.out.print("Seçiminiz: ");
        int secim = input.nextInt();                //Bu satır, kullanıcının seçimini alır ve
                                                    // secim adlı bir değişkene atar.

        switch (secim) {                            //Bu satır, kullanıcının yaptığı seçime göre farklı işlemlerin
                                                    // yapılacağı bir kontrol yapısı başlatır.
            case 1:
                bakiyeGoruntule();          //Bu satır, bakiyeGoruntule adlı metodu çağırır.
                                            // Bu metot, kullanıcının bakiyesini görüntülemek için kullanılır.
                break;
            case 2:
                paraYatir();                //Bu satır, paraYatir adlı metodu çağırır. Bu metot, kullanıcının
                                            // hesabına para yatırmak için kullanılır.
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
    /*
    Bu metod, kullanıcının hesap bakiyesini görmesine olanak sağlar.
    Bakiye değişkeni, başlangıçta 5000 TL değeri ile tanımlanmıştır.
    Bu metod, "Bakiyeniz: " ifadesiyle birlikte mevcut bakiye değerini yazdırır.
    Örneğin, ekrana "Bakiyeniz: 7500.0 TL" şeklinde bir çıktı verir.
     */
    public static void bakiyeGoruntule() {
        System.out.println("Bakiyeniz: " + bakiye + " TL");
    }

    // Para yatırma metodu
    /*
    paraYatir() metodu, kullanıcıdan alınan bir tutarı hesap bakiyesine ekler
    ve son bakiyeyi ekrana yazdırır. İlk olarak Scanner sınıfından bir nesne oluşturulur
     ve kullanıcıdan bir double türündeki tutar değişkenine para yatırmak istediği miktarı girmesi istenir.
      Sonrasında, bakiye değişkeni tutar değişkenine eklenir ve son bakiye kullanıcıya gösterilir.
     */
    public static void paraYatir() {
        Scanner input = new Scanner(System.in);

        System.out.print("Yatırmak istediğiniz tutarı girin: ");
        double tutar = input.nextDouble();

        bakiye += tutar;
        System.out.println(tutar + " TL yatırıldı. Yeni bakiyeniz: " + bakiye + " TL");

        input.close();
    }

    // Para çekme metodu
    /*
    paraCek() metodu, kullanıcıdan alınan bir tutarı hesap bakiyesinden çıkarır ve
     son bakiyeyi ekrana yazdırır. İlk olarak Scanner sınıfından bir nesne oluşturulur
     ve kullanıcıdan bir double türündeki tutar değişkenine çekmek istediği miktarı girmesi istenir.
     Eğer bu tutar değişkeni, hesap bakiyesinden fazlaysa, "Yetersiz bakiye." uyarısı verilir.
     Aksi takdirde, bakiye değişkeninden tutar değişkeni çıkarılır ve son bakiye kullanıcıya gösterilir.
     Son olarak, Scanner nesnesi kapatılır.
     */
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
