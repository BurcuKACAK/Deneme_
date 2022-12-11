package homework;

import java.util.Scanner;
//Kullanicidan adresini alini ve ekrana yazdiriniz
public class Scanner03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Adresinizi Giriniz");
        String adres = input.nextLine();
        System.out.println(adres);

    }
}
