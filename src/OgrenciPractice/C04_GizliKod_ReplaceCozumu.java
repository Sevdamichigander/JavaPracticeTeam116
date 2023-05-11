package OgrenciPractice;

import java.util.Scanner;

public class C04_GizliKod_ReplaceCozumu {  /*
        1-) Interwiew
        Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren kodu yazınız.
        Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar.
         Genellikle çevirdikleri harfler şu şekilde:
        s -> 5
        a -> 4
        e -> 3
        i -> 1
        o -> 0
        OUTPUT :
         hackerDili("java ile hersey guzel")
         h4ck3rd1l1("j4v4 1l3 h3r53y guz3l")
    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin = scan.nextLine();
        String cevrilenMetin = donusturucu(metin);

        System.out.println(cevrilenMetin);
    }

    private static String donusturucu(String metin) {
        String cevrilenMetin = metin.replace("s","5")
                .replace("a","4").replace("e","3")
                .replace("i","1")
                .replace("o","0");

        return cevrilenMetin;
    }
}

