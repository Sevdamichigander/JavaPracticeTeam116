package day02;

import java.util.Scanner;

public class Q4_BedenKitleIndeksi_Odev {
    /*
     * ask user to create a password.
     * it should have at least
     * 1 special char
     * 1 uppercase
     * 1 lowercase
     * 1 digit
     * the length of password should be at least 8 characters
     */
    /*

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Create Your Password: ");

        String pass = scanner.next();

        byte flag = 0;

        if (pass.length() < 8) {
            System.out.println("The password must be at least 8 characters");
            flag++;
        }
        if (pass == pass.toLowerCase()) {
            System.out.println("The password must contain at least 1 uppercase letter");
            flag++;
        }
        if (pass == pass.toUpperCase()) {
            System.out.println("The password must contain at least 1 lowercase letter");
            flag++;
        }
        if (pass == pass.replaceFirst("\\d", "")) {
            System.out.println("The password must contain at least 1 digit");
            flag++;
        }
        if (pass == pass.replaceFirst("\\W", "")) {
            System.out.println("The password must contain at least 1 special character");
            flag++;
        }

        if (flag == 0) System.out.println("Your Password Successfully Created");

      }

     */
// 1- Get weight and height from user
    public static void main(String[] args) {
        /*
         * Write a Java program to compute body mass index (BMI)
         * print the situation.
         * Isuser weak, fat or obese ?
         *
         * (Hint BMI = weight(kg)/ (height*height)(m)
         * BMI<20 weak
         * 20<BMI<25 healthy
         * 25<BMI<30 fat
         * Over 30 obese
         */

        // 1- Get weight and height from user
        Scanner scan= new Scanner(System.in);

        System.out.println(" Please enter your weight as kg");
        double weight = scan.nextDouble();
        System.out.println(" Please enter your height as cm");
        double height = scan.nextDouble();
        height= height/100 ;
        // 2- Calculate BMI

        double bmi = weight/(height*height) ;

        // 3- Compare BMI with limits and print result

        if (bmi<=20) {
            System.out.println("You are weak");
        } else if (bmi<=25) {
            System.out.println("You are healthy");
        } else if (bmi<=30) {
            System.out.println("You are fat");
        } else  {System.out.println("You are obese");
        }

        scan.close();
    }
}

