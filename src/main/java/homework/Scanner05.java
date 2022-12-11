package homework;

import java.util.Scanner;
//Kullanicidan bir dikdortgenin iki tane kenar uzunlugunu aliniz
//1-Alanini hesaplayiniz
//2-Cevresinin hesaplayiniz
public class Scanner05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Dikdortgenin Kisa Kenar Uzunlugunu Giriniz:");
        int kisaKenar = input.nextInt();
        System.out.println("Lutfen Dikdortgenin Uzun Kenar Uzunlugunu Giriniz:");
        int uzunKenar = input.nextInt();

        System.out.println("Alan Hesabi="+ kisaKenar* uzunKenar);
        System.out.println("Cevre Hesabi="+ 2*kisaKenar+2*uzunKenar);


    }
}
