package day08ifstatements;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {
  /*
         Example 1: Kullanicidan 3 tane pozitif bir tamsayi aliniz.
          Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
          Eger ucgen ise "eskenar"
          Ucgen olma durumunu
          kontrol ediniz.
          INFO :
          Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
                           herhangi iki kenar farki ucuncu kenardan kucuk olmali
           a+b>c>a-b
           a+c>b>a-c
           b+c>a>b-c
           a=b=c ise eskenar ucgen
         */

        Scanner input =  new Scanner(System.in);
        System.out.println("Please enter three positive integer for side length");

               double a = input.nextDouble();
               double b = input.nextDouble();
               double c = input.nextDouble();

               Boolean ucgenmi = (a+b>c && c>Math.abs(a-b)) && (a+c>b && b>Math.abs(a-c)) && (b+c>a && a>Math.abs(b-c));




    }
}
