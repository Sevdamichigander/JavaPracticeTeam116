package day4;

import java.util.Scanner;

public class Odev4_TekrarEdenKelimeleriBulma {
    public static void main(String[] args) {
        /*
         * Ask the user for a String and a sentences
         * Find and print occurrence of String in sentences.
         * (without case sensitivity)
         *
         * sentences =“hihihi” String=“hi” output=“There are 3 "hi"s in hihihi "
         * sentences =“I am coming” String=“com” output ="there is 1 “com” in sentences "
         */


        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");//Kullanıcıdan bir cümle girilmesi istenir
        // ve girilen cümle bir String değişkenine atanır.

        String sentence = input.nextLine();

        System.out.print("Enter a string to search: ");//Kullanıcıdan aranacak bir kelime girilmesi istenir
        // ve girilen kelime bir String değişkenine atanır.
        String searchString = input.nextLine();

        // convert both strings to lowercase for case-insensitive search
        sentence = sentence.toLowerCase();//Hem cümle hem de aranan kelime,
        // büyük-küçük harf hassasiyeti olmadan aramak için
        //küçük harflere dönüştürülür.
        searchString = searchString.toLowerCase();

        int count = 0;//Aranan kelimenin kaç kez bulunduğunu saymak için bir sayaç
        // ve cümle içinde ilk bulunan indeks belirlenir.
        int index = sentence.indexOf(searchString); // find the first occurrence of the string
        while (index != -1) {//indexOf metodu kullanılarak cümle içindeki tüm aranan kelime geçişleri sayılır
            // ve sayacı arttırılır.
            count++; // increment the count if the string is found
            index = sentence.indexOf(searchString, index + 1); // look for the next occurrence
        }

        // print the result
        if (count == 0) {//Bir kontrol yapısı kullanılarak, eğer aranan kelime cümle içinde bulunamazsa
            // buna ilişkin bir çıktı verilir.
            // Aksi takdirde, aranan kelimenin kaç kez geçtiği çıktı olarak verilir.
            System.out.println("The string \"" + searchString + "\" was not found in the sentence \"" + sentence + "\".");
        }
        else if (count == 1) {
            System.out.println("There is 1 \"" + searchString + "\" in the sentence \"" + sentence + "\".");
        }
        else {
            System.out.println("There are " + count + " \"" + searchString + "\"s in the sentence \"" + sentence + "\".");
        }
    }
}


