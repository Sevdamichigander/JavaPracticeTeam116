package day07;

public class C01_ArraydekiSayilarinToplami {

    //Create an array of 5 floats and calculate their sum.
    public static void main(String[] args) {

        // float [] numbers = new float[5];
        float[] numbers = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
        float toplam = 0;

        System.out.println("*******************for loop cozumu*****************************");

        for (int i = 0; i < numbers.length; i++) {
            toplam += numbers[i];
        }
        System.out.println("Toplam for loop :" + toplam);

        System.out.println("*******************while cozumu*****************************");

        toplam = 0;
        int i = 0; // Baslangic noktamiz burasi. For loop ta otomatik olarak veriliyordu. scope tan dolayi sorun vermedi

        while (i < numbers.length) {//condition

            toplam+=numbers[i];
            i++;//artis miktari

        }
        System.out.println("Toplam while loop: " + toplam);

        System.out.println("*******************azalan cozumu*****************************");

        toplam = 0;

        for (int i2 = numbers.length-1; i2>=0; i2--) {

            //length ==> >0 yeterli
            //length-1 ==> >=0 olmali

            toplam += numbers[i2];
        }
        System.out.println("Toplam azalan :" + toplam);

        System.out.println("*******************while loop cozum 2*****************************");

        toplam = 0;
        int sayac = numbers.length;

        while (sayac>0){
            toplam+=numbers[sayac-1];

            sayac--;
        }
        System.out.println("Toplam while loop 2 :" + toplam);

        System.out.println("*******************while loop cozum 3*****************************");

        toplam = 0;

        int sayac2 = numbers.length-1;

        while (sayac2>=0){
            toplam+=numbers[sayac2];
            sayac--;
        }
        System.out.println("Toplam while loop 3 :" + toplam);
    }
}
