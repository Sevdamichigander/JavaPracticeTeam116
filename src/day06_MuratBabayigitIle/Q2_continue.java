package day06_MuratBabayigitIle;

public class Q2_continue {
    public static void main(String[] args) {
        for (int i = 1; i <6 ; i++) {
            if(i==3){
                continue;// Atlamak istedigim noktaya bunu ekliyoruz
            }
            System.out.println(i+" ");

        }
        System.out.println("");
        System.err.println("Islem tamam");// ==> en son yazdiracagimiz seye bunu (err) yapabiliriz.
        // Kirmizi yazar
    }
}
