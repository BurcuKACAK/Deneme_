package day07ifstatements;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        //Ex 2 :Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu yazdiriniz
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz:");
        int x =input.nextInt();

        if(x%2==0){
            System.out.println("Cift Sayi");}
        else if (x%2!=0){
            System.out.println("Tek Sayi");}


    }
}
