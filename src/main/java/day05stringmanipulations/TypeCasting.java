package day05stringmanipulations;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

        //Byte data tipini int e ceviriniz
        byte age = 25;
        int ageInt = age;
        System.out.println(ageInt);//Autowidening

        //long data tipini short a ceviriniz
        long m= 5444;
        short mShort = (short) m;
        System.out.println(mShort);

        //int data tipini float a ceviriniz

        int population = 700000;
        float floatPopulation = population;
        System.out.println(floatPopulation);

        //int double tipini short a ceviriniz

        double num = 12.934;
        short numS = (short) num;
        System.out.println(numS);

        short a = 260;
        byte aByte = (byte) a;
        System.out.println(aByte);

        short x = 589;
        byte xByte = (byte) x;
        System.out.println(xByte);

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen -128 ile 127 arasinda bir sayi giriniz");
        Byte sayi = scan.nextByte();
        System.out.println(5*sayi);



    }
}
