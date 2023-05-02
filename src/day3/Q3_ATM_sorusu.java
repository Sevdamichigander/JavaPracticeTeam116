package day3;

import java.util.Scanner;

public class Q3_ATM_sorusu {
    /*
    Bir Java ATM programi yaziniz asagidaki kurallara gore;
    1-Kullaniciyi karsilayan bir method yazin ve yapmak istedigi islemleri sorun
    2-Kullanici Bakiyesini gorebilmesi icin method yaziniz (default bakiye 5000)
    3-Kullanici Deposito yatirabilsin
    4-Kullanici Para cekebilsin
    5-Kullanici Cikis yapsin
     */


    //Scanner nesnesi oluşturma ve değişkenleri tanımlama

    /*
    Bu değişkenler, programın farklı bölümlerinde erişilmesi
     gerektiğinde kullanılmak üzere static olarak tanımlanmıştır.
      Eğer bu değişkenler static olarak tanımlanmazsa,
      farklı metodlar arasında veya main metodunun dışında kullanılamazlar.
       Ancak static olarak tanımlanarak, tüm metodlar tarafından
        erişilebilir hale gelirler ve böylece programın farklı bölümlerinde
         kullanılabilecekleri anlamına gelir.
     */

    static Scanner scan = new Scanner(System.in);
    static double balance = 5000;
    static double deposit ;
    static int withdraw ;
    static int numberOfTransaction ;

    //Kullanici yi ana ekranda karsilamak ve yapmak istedigi islemleri secmesi
    // icin welcomeToBank methodunu olusturduk
    public static  void welcomeToBank(){

        System.out.println("****** WELCOME TO THE BANK OF SLOVENIA ******");
        System.out.println("Please Select Your Transaction");
        System.out.println("1-Balance\n2-Deposit\n3-Withdraw\n4-Exit");
        numberOfTransaction =scan.nextInt();
        if(numberOfTransaction>=5 || numberOfTransaction<1){
            System.out.println("Wrong Input...");
            welcomeToBank();// Kullanici hatali giris yaptiginda tekrar basa donmesi ve giris yapmasi icin
            //method call yaptik
        }
    }

    //Kullanicinin bakiyesinini ogrenebilmesi icin balanceLearning() methodu create ettik
    public static void balanceLearning(){ //Öncelikle, metot başına "public static" yazılarak,
                                        // metotun diğer sınıflardan çağrılabilir ve
                                        //main metodunun dışında kullanılabilir olduğu belirtilir.
        System.out.println("Your Balance is :"+ balance);
        welcomeToBank();
    }

    //Kullanicinin hesabina para yatirmasi icin depositAmount() methodu create ettik
    public static void depositAmount(){
        System.out.println("Please enter the deposit amount");
        deposit = scan.nextDouble();
        balance += deposit ;
        System.out.println("Your Balance is :"+ balance);
    }
    //Kullanicinin hesabindan para cekmesi icin withdrawAmount() methodu create ettik
    public static void withdrawAmount(){
        System.out.println("Please enter the withdraw amount");
        withdraw = scan.nextInt();

        if(withdraw>balance || withdraw>2500){
            System.out.println("not possible transaction");
            withdrawAmount();
            return;// baska bir condition olmadigi icin kodun burada durmasini ve devam etmemesini istiyoruz
            // bu sebepten return; key kullandik, return key basa dondermiyor sadece kodun o satirda durmasini sagliyor
            // method call yaptik return e gerek kalmadi,kullanilmayabilir
        }
        balance -= withdraw ;
        System.out.println("Your Balance is :"+ balance);
    }

    public static void exit(){
        System.out.println("Thank you for choosing us");
    }

    public static void transaction(){
        welcomeToBank();
        switch (numberOfTransaction) {
            case 1: balanceLearning(); break;
            case 2: depositAmount(); break;
            case 3: withdrawAmount(); break;
            case 4: exit(); break;
        }
    }

    public static void main(String[] args) {
        transaction() ;
        /*
        Java programlama dilinde, bir programın çalıştırılması "main" metodunun bulunmasına bağlıdır.
        "main" metodunun bulunmaması durumunda, program çalışmayacaktır.

        Ancak, "main" metodu her zaman her şeyi yazmanız gereken ilk metod değildir.
        Öncelikle, programın işlevselliğine ve gereksinimlerine göre, farklı metodlar oluşturulur.
        Bu metodlar, programın farklı işlevlerini gerçekleştirmek için kullanılır.

        Bu programda da önce, farklı işlevleri gerçekleştirmek için gerekli metodlar oluşturulmuştur.
        Daha sonra, "main" metodu, programı çalıştırmak için kullanılmıştır.
        Bu nedenle, önce farklı metodların oluşturulması daha mantıklı ve anlamlıdır.
         */
    }
}
