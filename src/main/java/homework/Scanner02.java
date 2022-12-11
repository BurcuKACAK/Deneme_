package homework;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        //Kullanicidan ilk ismini ve soy ismini alip ikisini ayni satirda ekrana yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz:");
        String name = input.next();
        System.out.println("Lutfen soyisminizi giriniz:");
        String lastName = input.next();
        System.out.println(name+" "+lastName);

    }
}
