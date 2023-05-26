package OgrenciPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ListtenIstenmeyeniCikarma {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ihsan","adem","ayse","aysegul","esat","galip","ilknur");
        System.out.println(list);

        String istenmeyenKrk = "esat";

        List<String> yeniList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            if (!list.get(i).contains(istenmeyenKrk)){
                yeniList.add(list.get(i));
            }
        }
        System.out.println(yeniList);
    }

}
