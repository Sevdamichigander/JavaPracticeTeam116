package OgrenciPractice;

import java.util.ArrayList;

public class C11_DizidekiDolarlariKaldir_SayilariTopla {
    public static void main(String[] args) {

/*
        Problem Tanımı :
        getSum isminde bir method oluşturun.
        Parametresi ArrayList'tir.
        Dizideki tüm $ ları kaldır ve tüm sayıları topla
        return yaptğımız veri tipi 'int' olmalıdır.
        sonuç 0'dan küçükse, -1 yazdırın.

        Örnek1:
        ArrayList = $13, $15, $20
        Cevap = 48 olmalı

        Örnek 2 :
        ArrayList= $-13, $0, $0
        Cevap = -1 olmalı.
         */

        ArrayList<String> dolarArr = new ArrayList<>();
        dolarArr.add("$-13");
        dolarArr.add("$0");
        dolarArr.add("$0");
        getSum(dolarArr);

    }

    private static int getSum(ArrayList<String> dolarArr) {

        int sayac = 0;
        for (String each: dolarArr
        ) {
            String eachDolarsiz = each.replace("$", "");
            sayac+=Integer.parseInt(eachDolarsiz);

        }
        if(sayac<0){
            System.out.println("-1");
        }else{
            System.out.println(sayac);
        }

        return sayac;

    }
}
