package day06_MuratBabayigitIle;

import java.util.Scanner;

public class Q3_AdamAsmacaOyunu {
    /*
-------ADAM ASMACA OYUNU --------
Kullanıcı, tahmin etmek istediği harfleri girebilir. Tahmin edilen harfler,
kelimenin doğru harfleriyle yer değiştirilir ve kalan hak sayısı tutulur.
Tahmin edilen kelimenin her aşaması ekrana yazdırılır.
Kullanıcının tahmin hakkı bittiğinde, doğru kelime ekrana yazdırılır
 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] kelimeler = {"java", "programlama", "fonksiyon", "yazilim", "degisken", "kodlama"};

        String secilenKelime=kelimeler[(int)Math.random()* kelimeler.length];
        int kelimelength = secilenKelime.length();

        System.out.println("Lutfen bir harf girip enter tusuna basiniz");

    }

}
