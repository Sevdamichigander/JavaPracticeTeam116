package day02;

import java.util.Scanner;

public class Q2_HesapMakinesi {
    public static void main(String[] args) {
        /*
         * Kullanicidan iki tamsayi sayi ve islem cinsini alin
         * ve sayilari kullanicinin belirledigi isleme tabi tutup sonucu yazdirin.
         *
         * islem cinsi icin 1:toplama 2:cikarma 3:carpma 4: bolme
         *
         * Ornek : Inputs : sayilar : 18 , 10  islem : 3
         *         Output : 18 X 10 = 180
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematiksel isleme sokmak icin iki tane tamsayi giriniz : ");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        System.out.println("Islem turunu seciniz : \n\t1 : Toplama\n\t2 : Cikarma\n\t3 : Carpma\n\t4 : Bolme");
        int islem = scanner.nextInt();

        System.out.println("***************** If cozumu****************");

        if(islem == 1) System.out.println(sayi1+sayi2);
        else if(islem == 2) System.out.println(sayi1-sayi2);
        else if(islem == 3) System.out.println(sayi1*sayi2);
        else if(islem == 4) {
            if(sayi2==0) System.out.println("O a bolum tanimsizdir");
            else System.out.println(sayi1/sayi2);

        } else System.out.println("Yanlis giris yaptiniz. Lutfen tekrar deneyiniz");

        System.out.println("***************** Switch Case cozumu****************");

        switch (islem){
            case 1 : System.out.println(sayi1+sayi2); break;

            case 2 : System.out.println(sayi1-sayi2); break;

            case 3 : System.out.println(sayi1*sayi2); break;

            case 4 : if(sayi2==0) System.out.println("O a bolum tanimsizdir");
                System.out.println(sayi1/sayi2);
            default:
                System.out.println("Yanlis giris yaptiniz. Lutfen tekrar deneyiniz");
/*
        Scanner scan = new Scanner(System.in);

        System.out.println("Matematiksel isleme sokmak icin iki tane tamsayi giriniz : ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("Islem turunu seciniz :\n\t1 : Toplama\n\t2 : Cikarma\n\t3 : Carpma\n\t4 : Bolme ");

        int islem = scan.nextInt();

        System.out.println("*********************IF COZUMU************************");

        if (islem == 1) System.out.println(a + b);
        else if (islem == 2) System.out.println(a - b);
        else if (islem == 3) System.out.println(a * b);
        else if (islem == 4) {
            if (b == 0) System.out.println("0'a bolum tanimsizdir!");
            else System.out.println(a / b);
        } else System.out.println("Yanlis giris yaptiniz, lutfen tekrar deneyiniz!");

        System.out.println("*********************SWITCH CASE COZUMU************************");

        switch (islem) {

            case 1:
                System.out.println(a + " + " + b + " = " + (a + b));
                break;

            case 2:
                System.out.println(a + " - " + b + " = " + (a - b));
                break;

            case 3:
                System.out.println(a + " * " + b + " = " + (a * b));
                break;

            case 4:
                if (b == 0) System.out.println("0'a bolum tanimsizdir!");
                else System.out.println(a + " / " + b + " = " + (a / b));
                break;

            default:
                System.out.println("Yanlis giris yaptiniz, lutfen tekrar deneyiniz!");

        }


        System.out.println("*********************SWITCH CASE 2 COZUMU************************");

        System.out.println("Islemini yapmak istediginiz isareti giriniz ");
        char isaret = scan.next().charAt(0);

        switch (isaret) {

            case '+':
                System.out.println(a + " + " + b + " = " + (a + b));
                break;

            case '-':
                System.out.println(a + " - " + b + " = " + (a - b));
                break;

            case '*':
                System.out.println(a + " * " + b + " = " + (a * b));
                break;

            case '/':
                if (b == 0) System.out.println("0'a bolum tanimsizdir!");
                else System.out.println(a + " / " + b + " = " + (a / b));
                break;

            default:
                System.out.println("Yanlis giris yaptiniz, lutfen tekrar deneyiniz!");


 */
        }
    }
}
