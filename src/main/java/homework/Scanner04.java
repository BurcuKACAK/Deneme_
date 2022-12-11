package homework;

import java.util.Scanner;
//Kullanicidan 2 sayi alip 4 islem yapan ve islemlerin sonucunu ekrana yazdiran kodu yaziniz
public class Scanner04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Iki Sayi Giriniz:");
        int first = input.nextInt();
        int second = input.nextInt();

        System.out.println(first+second);
        System.out.println(first-second);
        System.out.println(first*second);
        System.out.println(first/second);
    }
}
