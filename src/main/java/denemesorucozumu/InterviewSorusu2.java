package denemesorucozumu;

import java.util.Scanner;

public class InterviewSorusu2 {
    public static void main(String[] args) {
        // Kullanicidan aldiginiz iki sayiyi once yer degistirin ardindan bu iki sayinin bolme islemini yapiniz
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Iki Sayi Giriniz:");

        float a = input.nextFloat();
        float b = input.nextFloat();

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(a);
        System.out.println(b);

        float bolme = a/b;
        System.out.println("a/b=" +bolme);

        double sayı1 = 18.934;
        int sayı2 = (int)sayı1;
        System.out.println(sayı2);



    }
}
