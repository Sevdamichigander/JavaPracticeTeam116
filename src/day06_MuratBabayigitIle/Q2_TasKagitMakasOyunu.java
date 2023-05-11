package day06_MuratBabayigitIle;

import java.util.Random;
import java.util.Scanner;

public class Q2_TasKagitMakasOyunu {
    // Bilgisayara karsi tas kagit makas oyunu oynayacağımız kodları yazınız
    // Kural: 5 puana ilk ulasan oyunu kazanir

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rndm = new Random();

        int userChoice = 0;
        int compChoice=0;
        int userPoint=0;
        int compPoint=0;

        do {
            System.out.println("Lutfen secim yapiniz : \n1-Tas \n2-Kagit \n3-Makas");

            //Kullanicinin secimini iste.
            userChoice= scan.nextInt();

            //Bilgisayar icin random bir deger uretecegiz
            compChoice=rndm.nextInt(3)+1; //0-3 arasi  0 dahil 3 haric bir deger uretecegi icin +1 dedik.
            if (userChoice==1 && compChoice==2){
                System.out.println("Bilgisayarin sectigi :" + compChoice);
                System.out.println("");
                System.out.println("Kagit tasi sarar--Bilgisayar kazandi");
                compPoint++;
                System.out.println("Sizin puaniniz : " + userPoint + "\nBilgisayarin puani : " +compPoint);
                System.out.println("");

            }else if (userChoice==1 && compChoice==3){
                System.out.println("Bilgisayarin sectigi :" + compChoice);
                System.out.println("");
                System.out.println("Tas makasi kirar--Siz kazandiniz");
                userPoint++;
                System.out.println("Sizin puaniniz : " + userPoint + "\nBilgisayarin puani : " +compPoint);
                System.out.println("");

            }else if (userChoice==2 && compChoice==1){
                System.out.println("Bilgisayarin sectigi :" + compChoice);
                System.out.println("");
                System.out.println("Kagit tasi sarar--Siz kazandiniz");
                userPoint++;
                System.out.println("Sizin puaniniz : " + userPoint + "\nBilgisayarin puani : " +compPoint);
                System.out.println("");

            }else if (userChoice==2 && compChoice==3){
                System.out.println("Bilgisayarin sectigi :" + compChoice);
                System.out.println("");
                System.out.println("Makas kagidi keser--Bilgisayar kazandi");
                compPoint++;
                System.out.println("Sizin puaniniz : " + userPoint + "\nBilgisayarin puani : " +compPoint);
                System.out.println("");

            }else if (userChoice==3 && compChoice==1) {
                System.out.println("Bilgisayarin sectigi :" + compChoice);
                System.out.println("");
                System.out.println("Tas makasi kirar--Bilgisayar kazandi");
                compPoint++;
                System.out.println("Sizin puaniniz : " + userPoint + "\nBilgisayarin puani : " +compPoint);
                System.out.println("");

            }else if (userChoice==3 && compChoice==2){
                System.out.println("Bilgisayarin sectigi :" + compChoice);
                System.out.println("");
                System.out.println("Makas kagidi keser--Siz kazandiniz");
                userPoint++;
                System.out.println("Sizin puaniniz : " + userPoint + "\nBilgisayarin puani : " +compPoint);
                System.out.println("");

            }else{
                System.out.println("Sizin puaniniz : " + userPoint + "\nBilgisayarin puani : " +compPoint);
                System.out.println("");
            }

        }while(userPoint!=5 && compPoint!=5);

        if(userPoint>compPoint){
            System.out.println("Tebrikler siz kazandiniz");
        }else{
            System.out.println("Maalesef kaybettiniz.");
        }
        System.err.println("Oyun bitti!");
    }
}
