package day05;

import java.util.Scanner;

public class Q4_KelimeyiTersineCevir {

    public static void main(String[] args) {

        // SORU:kullanıcıdan bir cümle veya kelime girmesini isteyip
        // girilen değeri tersine  yazdıran bir method oluşturun
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle/kelime giriniz");
        String kelime = scan.nextLine();

        System.out.println(tersineCevirme(kelime));
    }

    public static String tersineCevirme(String word) {// parametreye ne isim veriyorsak methodun icinde onu kullanmaliyiz
        // String char lari array de birlestiren bir array gibidir.
        String bosKova = "";

        for (int i = word.length(); i >= 1; i--) {// i yi 0 dan baslatirsam length -1
            // i yi 1 den baslatirsam length

            bosKova += word.charAt(i - 1);
        }
        String reversedWord = bosKova;
        return reversedWord;
    }
}
