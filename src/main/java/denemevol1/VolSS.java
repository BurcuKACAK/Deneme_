package denemevol1;

import java.util.Scanner;

public class VolSS {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isteginizi giriniz.\nHira Tatlisi mi Java mi?");

        String  y = input.nextLine();

        if (y.equalsIgnoreCase("Hira")){
            System.out.println("Hirayi Yaparsam Javayi Yapamam");}

        else  {
            System.out.println("Javayi Yaparsam Hirayi Yapamam \nTarafini  sec :)");

        }
    }
}
