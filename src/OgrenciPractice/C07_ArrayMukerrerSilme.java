package OgrenciPractice;

import java.util.ArrayList;
import java.util.List;

public class C07_ArrayMukerrerSilme {
    /*
  Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
  elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.
   */
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 5, 5, 7, 8, 5, 6, 1, 3, 4};
        tekrarEdenleriSil(arr);
    }
    public static void tekrarEdenleriSil(int[] arr) {
        List<Integer> yeniListe = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!yeniListe.contains(arr[i])) {
                yeniListe.add(arr[i]);
            }
        }
        System.out.println(yeniListe);
    }

}
