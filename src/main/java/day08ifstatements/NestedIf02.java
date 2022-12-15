package day08ifstatements;

import java.util.Scanner;

public class NestedIf02 {
    public static void main(String[] args) {

            /*
        Password'un ilk harfi buyuk harf ise
         'A' olursa gecerli password yazdirin degilse gecersiz password yazdirin
          Passwordun ilk harfi kucuk harf ise
         'z' olursa gecerli passworde yazdirin degilse gecersiz password yazdirin

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Password Giriniz");
        String psw = input.nextLine();

        if (psw.charAt(0)>'A' && psw.charAt(0)<'Z')
        {
            if (psw.charAt(0)=='A'){
                System.out.println("Gecerli Password");
            } else {
                System.out.println("Gecersiz Password; Cunku Buyuk Harf Ama A Degil" );
            }
        }
        else if (psw.charAt(0)>'a' && psw.charAt(0)<'z'){
            if (psw.charAt(0)=='z'){
                System.out.println("Gecerli Password");
            } else {
                System.out.println("Gecersiz Password; Cunku Kuyuk Harf Ama z Degil" );
            }
        }
        else {
            System.out.println("Ilk Karakter Harf Olmali");
        }
        }

    }

