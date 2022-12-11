package day05stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

        String s = "Learn Java Earn Money";
        System.out.println(s);

        String sUpper = s.toUpperCase();
        System.out.println(sUpper);

        String sLower = s.toLowerCase();
        System.out.println(sLower);

        //s Stringindeki ilk karakteri aliniz

        char sFirst = s.charAt(0);
        System.out.println(sFirst);

        //s Stringindeki ikinci ve sondan ikici karakteri aliniz

        char second = s.charAt(1);
        char lastSecond = s.charAt(19);
        System.out.println("" +second+lastSecond);

        //s Stringindeki karakter sayisini bulunuz

        int number = s.length();
        System.out.println(number);

        // s Stringindeki ilk dort karakteri aliniz.

        String sub1 = s.substring(0 , 5);
        System.out.println(sub1);

        // s Stringindeki Java kelimesini aliniz.

        String sub2 = s.substring(6,10);
        System.out.println(sub2);

        //s Stringindeki Java kelimesini aliniz.

        String sub3 = s.substring(16,21);
        System.out.println(sub3);

        //s Stringinde "money"kelimesinin olup olmadigini kontrol ediniz.
         boolean isExist = s.contains("money");
         System.out.println(isExist);

         //s Stringinin belli bir kelime veya harf ile baslayip baslamadigini kontrol ediniz

        boolean isStart = s.startsWith("Learn");
        System.out.println(isStart);

        //s Stringinin belli bir kelime veya harf ile bitip bitmedigini kontrol ediniz

        boolean isnEnd = s.endsWith("Momy");
        System.out.println(isnEnd);





    }
}
