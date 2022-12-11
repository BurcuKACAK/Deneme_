package denemesorucozumu;

import java.util.Scanner;

public class QuestionBank {
    public static void main(String[] args) {

        // Kullanicinin girdigi 2 tam sayiyi degistiriniz
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Iki Tam Sayi Giriniz");

        int x1 = input.nextInt();
        int x2 = input.nextInt();

        System.out.println("Ilk Hali:"+ x1 +" - " + x2);

        x1 = x1+x2;
        x2 = x1-x2;
        x1 = x1-x2;

        System.out.println("Son Hali:" + x1 + " - " + x2);

        //Short data tipinde bir değişken oluşturunuz ve onu bir int değişkenine dönüştürünüz.

        short a = 1234;
        int a1 = a;

        //Long data tipinde bir değişken oluşturunuz ve onu bir int değişkenine dönüştürünüz.

        long b = 123;
        int b1 = (int) b;
        System.out.println(b1);

        //Double data tipinde bir değişken oluşturunuz ve onu bir float değişkenine dönüştürünüz.

        double c = 11124554412.3;
        float c1 = (float) c;
        System.out.println(c1);

    }
}
