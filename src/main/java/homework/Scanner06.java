package homework;

import java.util.Scanner;
//Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki rakamlarin toplamini
//yazdiran kodu yaziniz

public class Scanner06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen Bes Basamakli Bir Sayi Giriniz:");

        int number = input.nextInt();

        int lastDigit = number%10;
        number = number/10;

        int lastSecondDigit = number%10;
        number = number/10;

        int lastThirdDigit = number%10;
        number = number/10;

        int lastFourthDigit = number%10;
        number = number/10;

        int lastFifthDigit = number%10;


        System.out.println(lastDigit+lastSecondDigit+lastFifthDigit+lastFourthDigit);






    }
}
