package day06stringmanipulationifstatement;

import java.util.Scanner;

public class StringManipulations {

    public static void main(String[] args) {
        //Bir Stringin bas ve sonunda space karakteri varsa siliniz.

        String s = "  Ali Can   ";
        System.out.println(s);
        String sTrimmed =  s.trim();
        System.out.println(sTrimmed);

        //Asagida fiyatlari verilen urunlerin toplam fiyatini veriniz.

        //String tv = 456.99$ ; String laptop = 875.99$

        String tv = "$456.99";
        String laptop = "$875.99";

        String tv1 =  tv.replace("$" , "");
        String laptop1 =  laptop.replace("$", "");

        Double totalPrice = Double.valueOf(tv1) + Double.valueOf(laptop1);
        System.out.println(totalPrice);

        // Verilen ismin ilk harfini ve soyismin ilk harfini ekrana yazdiriniz.
        // Ali CAN==> AC

        String name = "   ali cAN   ";

       char name1 =  name.trim(). toUpperCase().charAt(0);
       char name2 =  name.trim().toUpperCase().split(" ")[1].charAt(0);

        System.out.println("" + name1+name2);

        //Ex : Bir stringin hic karakter icermedigini kontrol eden (Bos String) kodu yaziniz

        String m= "";
        //1.Yol
        boolean m1= m.length()==0;
        System.out.println("String bos mu?" + m1);

        //2.Yol
        boolean m2 = m.isEmpty();
        System.out.println(m2);

        //Bir Stringin space haric hibir karakter icermedigini kontrol eden kodu yaziniz

        //1.Yol
        String a = "    ";
        boolean a1 =  a.replace(" " , "").length()==0;
        System.out.println("Sadece space mi var?" + a1);

        //2.Yol

        boolean a2 = a.replace(" ", "").isEmpty();
        System.out.println("Sadece space mi var?" +a2);

        //3. Yol

        boolean a3 = a.isBlank();
        System.out.println("Sadece space mi var?"+a3);

        //Bir Stringde a,e,i karakterlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz
        //          "Java is easy to learn"

        String k =  "Java is easy to learn";
        int k1 =  k.indexOf('a');
        int k2 = k.indexOf('i');
        int k3 = k.indexOf('e');

        System.out.println("Indexler Toplami"+ (k1+k2+k3));

        //Bir Stringte "Java" kelimesinin ilk olarak kacinci indexte kullanildigini gosteren kodu yaziniz
        // "Ah Java vah Java sensiz olmuyor Java"

        String y = "Ah Java vah Java sensiz olmuyor Java";
        int y1 = y.indexOf("Java");
        System.out.println(y1);

        int y2 =  y.indexOf("xyz");
        System.out.println(y2);

        //Bir String te a,e,i karakterlerinin son gorunumlerinin indexleri toplamini ekrana yazdiriniz
        //      "Java is easy to learn"

        String b = "Java is easy to learn";
        int b1 = b.lastIndexOf("a");
        int b2 = b.lastIndexOf("e");
        int b3 = b.lastIndexOf("i");

        System.out.println(b1+b2+b3);

        //Bir Stringdeki tekrarsiz karakterleri ekrana yazdiriniz.
        //      "aac"

        String u= "aac";

       char u1 =  u.charAt(0);
       char u2 = u.charAt(1);
       char u3 = u.charAt(2);

       if(u.indexOf(u1) == u.lastIndexOf(u1)){
           System.out.println(u1);}
       if(u.indexOf(u2)==u.lastIndexOf(u2)){
           System.out.println(u2);}
       if (u.indexOf(u3)==u.lastIndexOf(u3)) {
           System.out.println(u3);}
      //Sayi uc basamakli ise ekrana "Waoow!" yazdiriniz.

        int c= 123;
        c = Math.abs(c);

       if(c>99 && c<1000 ){
           System.out.println("Waoow");       }











    }
}
