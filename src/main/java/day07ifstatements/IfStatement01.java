package day07ifstatements;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

        //Ex 1: Verilen karakter buyuk harf ise ekrana "Buyuk Harf"yaziran kucuk harf ise "Kucuk Harf" yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Bir Harf Giriniz");
        char m = input.next().charAt(0);

        //if(m>='A' && m<= 'Z' ){
          //  System.out.println("Buyuk Harf...");
        //}
        //if (m>='a' && m<='z'){
          //  System.out.println("Kucuk Harf...");
        //}

        if(m>='A' && m<= 'Z' ){
            System.out.println("Buyuk Harf...");        }
        else if(m>='a' && m<='z'){
            System.out.println("Kucuk Harf...");        }
        else {
            System.out.println("Harf Degil");
        }



    }
}

