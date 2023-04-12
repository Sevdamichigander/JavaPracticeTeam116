package day3;

import java.util.Scanner;

public class Q2_WhenDidYouBorn {
    // Kullaniciya hangi ayda dogdunu sorun ve
    // dogdugu ayin Hangi mevsim oldugunu veren bir java program yaziniz

    static Scanner scan = new Scanner(System.in);
    static String month ;
    static String season = null ;
    static String january ="january" ;
    static String february = "february" ;
    static String march = "march" ;
    static String april = "april" ;
    static String may = "may" ;
    static String june = "june" ;
    static String july = "july" ;
    static String august ="august" ;
    static String september ="september" ;
    static String october ="october" ;
    static String november ="november" ;
    static String december ="december" ;


    public static void birthDay(){
        System.out.println("Please enter the month you born in");
        month = scan.next();
        if (month.equalsIgnoreCase(january) || month.equalsIgnoreCase(february)||month.equalsIgnoreCase(december)){
            season = "Winter" ;
        } else if (month.equalsIgnoreCase(march) || month.equalsIgnoreCase(april)||month.equalsIgnoreCase(may)){
            season = "Spring" ;
        }else if (month.equalsIgnoreCase(june) || month.equalsIgnoreCase(july)||month.equalsIgnoreCase(august)){
            season = "Summer" ;
        }else if (month.equalsIgnoreCase(september) || month.equalsIgnoreCase(october)||month.equalsIgnoreCase(november)){
            season = "Autumn" ;
        }else {
            System.out.println("Invalid Input...");
            birthDay();// method call
        }
        System.out.println("You were born in :"+ season);
    }
    public static void main(String[] args) {
        birthDay() ;

    }
}
