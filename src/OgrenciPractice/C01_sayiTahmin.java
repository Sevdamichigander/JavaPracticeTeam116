package OgrenciPractice;
import java.util.Random;
import java.util.Scanner;

public class C01_sayiTahmin {

    //      1 ile 100 arasında rastgele üretilen sayının kullanıcının kaçıncı denemede tahmin ettiğini hesaplayan,
    //     ayrıca kullanıcıyı "daha büyük sayı giriniz","daha küçük sayı giriniz" şeklinde  yönlendiren programı
    //     metot kullanarak yazınız.

        public static void main(String[] args) {
            Random random=new Random();

            int sayi= random.nextInt(101);
            int tahmin;
            int sayac=0;

            Scanner scanner=new Scanner(System.in);

            do{
                System.out.println("lütfen tahmininizi giriniz: ");
                tahmin=scanner.nextInt();
                sayac++;

                if (sayi==tahmin)
                    System.out.println("Tebrikler "+sayac+" . seferde bildiniz");
                else if (tahmin>sayi) {

                    System.out.println("Daha küçük bir sayı giriniz");

                }else System.out.println("Daha büyük bir sayı giriniz");

            }while(tahmin!=sayi);
        }
}
