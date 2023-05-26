package OgrenciPractice;
import java.util.Arrays;
import java.util.Scanner;

public class C02_Banknot {
    //Soru-2) kullanıcının girdiği TL miktarını en az banknot sayısına çeviren programı array kullanarak yapınız.
    //int[ ] bankonatlar = {200, 100, 50, 20, 10, 5, 1};
    //Örneğin Lütfen Testirlik Maaşınızı TL Olarak Girin: 8642
    //Minimum banknot sayısı:
    //43 x 200 TL
    //2 x 20 TL
    //2 x 1 TL
    //Toplam Kullanılan Bankonot Sayısı: 47

    public static void main(String[] args) {

        int[ ] banknotlar = {200, 100, 50, 20, 10, 5, 1};

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen Testirlik Maaşınızı TL Olarak Girin");

        int paraMiktari=scanner.nextInt();
        int [] kullanilanBanknot=new int[7];

        // System.out.println(Arrays.toString(kullanilanBankonot));

        for (int i=0;i<banknotlar.length;i++){   //maas = 1520    i=0    200x7,
                                                //  maas=120      i=1    100x1,
                                                //  maas=20       i=2    20x1

            kullanilanBanknot[i]=paraMiktari/banknotlar[i];
            paraMiktari=paraMiktari%banknotlar[i];
        }

        System.out.println(Arrays.toString(kullanilanBanknot));
    }
}
