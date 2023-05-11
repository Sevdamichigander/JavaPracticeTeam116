package day07;

import java.util.Arrays;

public class C02_Menu {
    public static void main(String[] args) {
        // create 2D array of food:
        // print all the foods sorted
        /*
        steak
        hot dog
        cheeseburger
        -----------------------
        pizza
        pasta
        canoli
        -----------------------
        sushi
        ramen
        fried rice
        dumplings
        -----------------------
        kebab
        manto
        -----------------------
        beriyani
        masal
        curry
        chicken tikka masala
        -----------------------
        */


        String [][] food = {{"steak","hot dog","cheeseburger"},
                          {"pizza","pasta","canoli"},{"sushi","ramen","fried rice","dumplings"},
                          {"kebab", "manto"},
                          {"beriyani","masal","curry","chicken tikka masala"}};


        for (String [] ulkeler :food) {

            // System.out.println("-----------------------"); ==> ilk sirada yazar sonda yazmaz

            for (String yemek:ulkeler) {

                System.out.println(yemek);
            }
           System.out.println("-----------------------");
        }
        System.out.println("*******************" + "fori cozumu" + "*****************************");

        String [] ulkeler = {"American","Italien","Korean","Afghan","Indian"};

        for (int i = 0; i < food.length; i++) {

            System.out.println("-----------------------" +ulkeler[i]+"-----------------------"  );

            for (int j = 0; j < food[i].length; j++) {
                System.out.println(food[i][j] );
            }
            System.out.println("-----------------------" );
        }
    }
}
