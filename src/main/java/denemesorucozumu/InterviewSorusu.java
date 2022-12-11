package denemesorucozumu;

import java.util.Scanner;

public class InterviewSorusu {

    //Verilen sayi 1 ve sayi2 degerlerinin yerlerini degistiren bir kod yaziniz
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 20;
        System.out.println(sayi1);
        System.out.println(sayi2);

        sayi1 = 10 + 20;
        sayi2 = sayi1 - sayi2;
        sayi1 = sayi1-sayi2;

        System.out.println(sayi1);
        System.out.println(sayi2);

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz:");
        int a = input.nextInt();
        int b = input.nextInt();

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println(a);
        System.out.println(b);




    }


    
}
