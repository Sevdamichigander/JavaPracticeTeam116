package OgrenciPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C08_ListeDondurme {
    /*
   Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
   liste olarak dondurecek bir method olusturun.
    */
    public static void main(String[] args) {
        System.out.println(listeOlusturma());
    }

    public static List<String> listeOlusturma() {
        List<String> liste = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String kelimeler = "";
        //  do {
        //      System.out.println("Lutfen listeye eklemek istediginiz kelimeleri girip enter`a basiniz. Cikmak icin 'Q' ya basiniz.");
        //      kelimeler = scan.next();
        //      liste.add(kelimeler);
        //      liste.remove("Q");
        //  }while (!kelimeler.equals("Q"));
        while (!kelimeler.equals("Q")) {
            System.out.println("Lutfen listeye eklemek istediginiz kelimeleri girip enter`a basiniz. Cikmak icin 'Q' ya basiniz.");
            kelimeler = scan.next();
            if (!kelimeler.equals("Q")) {
                liste.add(kelimeler);
            }
        }
        return liste;

    }
}
