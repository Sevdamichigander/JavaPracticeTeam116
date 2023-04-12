package day02;

import java.util.Scanner;

public class Q3_CreatePassword_Odev {
    public static void main(String[] args) {

        /*
         * ask user to create a password.
         * it should have at least
         * 1 special char
         * 1 uppercase
         * 1 lowercase
         * 1 digit
         * the length of password should be at least 8 characters
         */


        Scanner scanner=new Scanner(System.in);

        System.out.println("Please Create Your Password: ");

        String pass=scanner.next();

        byte flag=0;

        if (pass.length()<8) {
            System.out.println("The password must be at least 8 characters");
            flag++;
        }
        if (pass==pass.toLowerCase()) {
            System.out.println("The password must contain at least 1 uppercase letter");
            flag++;
        }
        if (pass==pass.toUpperCase()) {
            System.out.println("The password must contain at least 1 lowercase letter");
            flag++;
        }
        if (pass==pass.replaceFirst("\\d","")) {
            System.out.println("The password must contain at least 1 digit");
            flag++;
        }
        if (pass==pass.replaceFirst("\\W","")) {
            System.out.println("The password must contain at least 1 special character");
            flag++;
        }

        if (flag==0) System.out.println("Your Password Successfully Created");

        /*
        Bu Java kodu kullanıcının bir parola oluşturmasını isteyen ve belirli kriterleri karşılaması gereken bir programdır.
        Kullanıcıdan alınan parolanın belirli kriterleri karşılamaması durumunda hata mesajları verir.

        Kodun yaptığı işlemler şunlardır:

        Kullanıcıya "Please Create Your Password" şeklinde bir mesaj gösterilir.

        Kullanıcının girdiği parola, "pass" değişkenine atanır.

        "flag" adlı bir bayt değişkeni tanımlanır ve değeri sıfıra eşitlenir.

        İlk olarak, "pass" değişkeninin uzunluğu 8 karakterden azsa
            "The password must be at least 8 characters" şeklinde bir hata mesajı verilir
                ve "flag" değişkeni bir arttırılır.

        Ardından, "pass" değişkeninin küçük harfleri içermediği durumlarda
        "The password must contain at least 1 lowercase letter" şeklinde bir hata mesajı verilir
        ve "flag" değişkeni bir arttırılır.

        "pass" değişkeninin büyük harfleri içermediği durumlarda
            "The password must contain at least 1 uppercase letter" şeklinde bir hata mesajı verilir
                ve "flag" değişkeni bir arttırılır.

        "pass" değişkeninde sayısal bir karakter yoksa
            "The password must contain at least 1 digit" şeklinde bir hata mesajı verilir
                ve "flag" değişkeni bir arttırılır.

        "pass" değişkeninde özel bir karakter yoksa
            "The password must contain at least 1 special character" şeklinde bir hata mesajı verilir
                ve "flag" değişkeni bir arttırılır.

        Eğer "flag" değişkeni hala 0 değerindeyse, tüm kriterleri karşılayan bir parola oluşturulduğu anlamına gelir
            ve "Your Password Successfully Created" şeklinde bir mesaj gösterilir.

            Program sona erer.

         */

    }

}

