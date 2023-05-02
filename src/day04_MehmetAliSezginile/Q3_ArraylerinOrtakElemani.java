package day04_MehmetAliSezginile;

import java.util.ArrayList;
import java.util.List;

public class Q3_ArraylerinOrtakElemani {
    /*
   Iki string array icerisindeki ayni elemanlari bulan bir java methodu create ediniz
     */

    public static void ortakEleman() {
        // Verilen iki array i karsilastirmak icin uzunluklarinin ayni olmasi gerekiyor
        //degilse kucuk olana gore karsilastirmak gerekiyor.

        String[] data1 = {"Java", "SQL", "HTML", "Selenium", "API", "Python", "postman"};
        String[] data2 = {"Java", "SQL", "hTML", "selenium", "Api", "C#", "postman"};

        // karsilastirdigim elemanlari bir array icine  atayamayiz.
        // Cunku ayni olan kac tane eleman var bilmiyoruz. Yani uzunnlugu bilmiyoruz.
        // BU nedenle list i kullanmak gerek

        //Ayni olan elemanlari olusturmak icin list olusturuyoruz

        List<String> ortakElemanlarListesi = new ArrayList<>();

        // inner for loop ile array lerin icerisine girip herbir datayi digerleri ile karsilastiralim

        for (int i = 0; i < data1.length; i++) {
            for (int j = 0; j < data2.length; j++) {

                if (data1[i].equalsIgnoreCase(data2[j])) {
                    ortakElemanlarListesi.add(data1[i]);
                }

            }

        }

        System.out.println("ortak elemanlar : " + ortakElemanlarListesi);


    }

    public static void main(String[] args) {
        ortakEleman();
    }
}

