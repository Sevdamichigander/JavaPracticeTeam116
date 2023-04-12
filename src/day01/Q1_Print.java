package day01;

public class Q1_Print {
    public static void main(String[] args) {
        /*
    Konsolda :
    "Hello "\
    / 'World'"
    yazdiriniz.
    */
        System.out.println("\"Hello \"\\\n" +
                "/ 'World'\"");

         /*
      \n (or \r)  : Starts from a new line : Metni bir alt satırdan itibaren yazdırır.
              \t  : Horizontal tab         : Metni yatayda 1 tab miktarı kaydırır.
              \\  : Prints a back slash    : \  Ters slash yazdırır
              \'  : Prints single quote    : '  Tek tırnak yazdırır.
              \"  : Prints double quote    : "  Çift tırnak yazdırır.
     */

        System.out.println("\""); // "
        System.out.println("\"Hello \"\\\n/ \'World\'\"");

        char a=92;
        System.out.println('"'+"Hello "+'"'+a+"\n/ 'World'"+'"');

        // String afilliYazi = "Hello "\ / 'World'" olmuyor

        String afilliYazi2 = "\"Hello \"\\\n" + "    / 'World'\"";

        char karakter ='\''; // '

        System.out.println("afilliYazi2 = " + afilliYazi2); //soutv yi secerek print ettirdik




    }
}
