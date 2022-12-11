package day07ifstatements;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {
///Ex 3: Verilen bir sayinin pozitif, negayif veya notr oldugunu kontrol eden kodu yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int s = input.nextInt();

        if (s>0){
            System.out.println("Pozitif");
        } else if (s<0){
            System.out.println("Negatif");
        } else {
            System.out.println("Notr");
        }


    }
}
