package day04_MehmetAliSezginile;

import java.util.Arrays;
import java.util.Scanner;

public class Q1_ArrayGoruntuleme {

        /*
        Bir array icerisindeki degerleri gosteren bir java programi olusturun
         */
    // int bir array olusturalim.
    // Bir array create etmek icin once data turunu ve size ini tanimlamamiz gerekiyor.
    // static ===> her yerden ulasalim diye

    static int size ; // Birden fazla array create etmek ister isek size i her yerde kullanabiliriz
    // birden fazla method icinde kullanicidan veri alabilmek ve tekrara dusmemek icin class level da olusturduk
    static Scanner scan = new Scanner(System.in) ;

    //Kullanici tarafindan create edilen bir array i print almak icin method olusturlalim
    public static void printArrayMethod(){
        //Oncelikle kullaniciya array in size inin ne olmasi gerektigini soralim
        System.out.println("Lutfen Array in size ini belirtin...");
        size = scan.nextInt();
        // kullanicidan aldigimiz size ile array in size ini olusturmus olduk
        int [] ogrencilerinYaslari = new int[size] ;

        //Simdi array icerisine veri eklemeliyiz
        System.out.println("Lutfen Ogrencilerin Yaslarini giriniz");
        for(int i = 0 ; i<size ; i++){
            System.out.println(i+1+". Veri");
            ogrencilerinYaslari[i] = scan.nextInt();
        }
        // Girilen array verilerinin print ini almak icin bir for loop daha olusturmaliyiz
        System.out.println("Olusturulan Array icerisinde ki verilerin ciktisi...");
        for (int i=0; i<size; i++){
            System.out.print(ogrencilerinYaslari[i]+", "); // 15, 16,
        }
        //Asagidaki method ile bir array in butununun ciktisi alinir fakat yukarida ki for loop ile
        // her bir array icerisinde ki elemanlar disari cikarilir
        System.out.println(Arrays.toString(ogrencilerinYaslari));  //[15, 16]
    }

    public static void main(String[] args) {
        printArrayMethod() ;
    }
}
