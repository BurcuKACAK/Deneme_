package day05stringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {

        String s = "Learn Java earn money";

        //s Stringindeki "money"kelimesini "dollars" kelimesi ile degistiriniz
        String newS1 = s.replace("money" , "dollars");
        System.out.println(newS1);

        //s Stringindeki "earn" kelimesini "win" kelimesi ile degistiriniz
        String newS2 =s.replace("earn", "win");
        System.out.println(newS2);

        //s Stringindeki "a" harflerini "*" ile degistiriniz
        String newS3 = s.replace("a" , "*");
        System.out.println(newS3);

        //s Stringindeki "n" harflerini "XXX" ile degistiriniz
        String new4S = s.replace("n" , "XXX");
        System.out.println(new4S);

        //s Stringindeki tum "e" harflerini siliniz
        String s5 = s.replace("e" , "");
        System.out.println(s5);

        String t = "Ali 13 yasindadir...";

        //t Stringindeki tum rakamlari * a ceviriniz
        String t1 = t.replaceAll("[0-9]","*");
        System.out.println(t1);

        //t Stringindeki tum rakamlari tum rakamlari ve harfleri ! e ceviriniz
        String t2 = t.replaceAll("[a-zA-Z0-9]" , "!");
        System.out.println(t2);


        //t Stringindeki tum sesli harfleri ? e ceviriniz
        String t3 = t.replaceAll("[aeiouAEIOU]", "?");
        System.out.println(t3);

        //t Stringindeki tum kucuk harfler disindaki harfleri <> e ceviriniz
        String t4 = t.replaceAll("[^a-z]", "<>");
        System.out.println(t4);

        //t Stringindeki tum harfler disindaki tum karakterleri + ya ceviriniz
        String t5 = t.replaceAll("[^a-zA-Z]", "+");
        System.out.println(t5);

        //t Stringindeki spaceler disindaki tum karakterleri $ a ceviriniz
        String t6 = t.replaceAll("[^ ]", "+");
        System.out.println(t6);




    }
}
