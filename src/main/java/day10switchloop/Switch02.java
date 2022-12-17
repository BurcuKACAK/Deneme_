package day10switchloop;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        //Example 1: Kulanicidan iki sayi ve yapilacak islemi alan ve +, -, *, /, % islemlerini yapan kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Iki Sayi Veriniz");
        double a =input.nextDouble();
        double b = input.nextDouble();
        System.out.println("Lutfen Yapilacak Islemi ( + , - , * , / ,% Giriniz");

        char islem = input.next().charAt(0);

        switch (islem){

            case '+':
                System.out.println(a + "+"+  b + "="+ (a+b));
                break;
            case '-':
                System.out.println(a + "-"+  b + "="+ (a-b));
                break;
            case '*':
                System.out.println(a + "*"+  b + "="+ (a*b));
                break;
            case '/':
                System.out.println(a + "/"+  b + "="+ (a/b));
                break;
            case '%':
                System.out.println(a + "%"+  b + "="+ (a*b/100));
                break;

            default:
                System.out.println("Lutfen gecerli bir deger giriniz");


        }


    }
}
