package day07;

public class C04_Ebob_Ekok {

    // Take 2 integers from user and find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)
    // Kullanicidan 2 adet tamsayi alip, EBOB ve EKOK'larini bulan program yaziniz.

    public static void main(String[] args) {
        int sayi1 = 4;
        int sayi2 = 6;

        int buyukSayi = 0;
        int kucukSayi = 0;

        if(sayi1<sayi2){
            kucukSayi = sayi1;
            buyukSayi = sayi2;
        }else {
            kucukSayi = sayi2;
            buyukSayi = sayi1;
        }

        for (int i = kucukSayi ; i > 1 ; i--) {
            if ( sayi1 % i == 0 && sayi2 % i == 0 ){
                System.out.println("Sayilarin EBOB'u = " + i );
                break;
            }
        }
        for (int i = buyukSayi; i <= sayi1*sayi2 ; i+=buyukSayi) {
            if ( i % sayi1 == 0 && i % sayi2 == 0 ) {
                System.out.println("Sayilarin EKOK'u = " + i);
                break;
            }
        }
    }
}
