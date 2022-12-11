package day05stringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {

    public static void main(String[] args) {

        /*Example; Asagidaki kurallara gore kullanicinin girdigi password u kontol ediniz.
                    1-En az 8 karakter olsun
                    2-Space karakteri passwordde olmasin
                    3-En az bir tane buyuk harf olsun.
                    4-En az bir tane kucuk harf olsun.
                    5-En az bir tane sembol harf olsun.
                    6-En az bir tane rakam olsun.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz:");

        String p = input.nextLine();

        boolean p1 = p.length()>7;

        boolean p2 = !p.contains(" ");

        boolean p3 = p.replaceAll("[^A-Z]" , "").length()>0;

        boolean p4 =  p.replaceAll("[^a-z]", "").length()>0;

        boolean p5 = p.replaceAll("\\{Punct}" , "").length()>0;

        boolean p6 = p.replaceAll("[0-9]", "").length()>0;

        System.out.println("Password Gecerli mi?" +( p1 && p2 && p3 && p4 && p5 && p6));


    }
}
