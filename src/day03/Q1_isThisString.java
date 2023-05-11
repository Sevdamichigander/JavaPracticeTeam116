package day03;

import java.util.Scanner;

public class Q1_isThisString {

    // Kullanicidan alinan karakterlerin string olup olmadigini
    //kontrol eden bir java program yaziniz

    static Scanner scan = new Scanner(System.in);

    public static void isThisString() {

        System.out.println("Please input a string text...");
        // Kullanici int bir giris yapabilir ==> kontrol etmemiz gerek

        if (scan.hasNextInt()) {//can.hasNextInt())==> eger scan yani kullanicinin giris yaptigi data int ise true dondurecek

            int input = scan.nextInt();
            System.out.println("This is an integer input : " + input);
            isThisString(); // method call yaptik
        }
        else if (scan.hasNextDouble()) {

            double doubleInput  =scan.nextDouble();
            System.out.println("This is a double input : " + doubleInput);
            isThisString();
        }
        else if (scan.hasNext()) {
            String stringData = scan.next();
            System.out.println("Great this is a string input");

        }

    }

    public static void main(String[] args) {
        isThisString();

    }
}

