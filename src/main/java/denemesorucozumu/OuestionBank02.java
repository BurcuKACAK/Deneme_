package denemesorucozumu;

public class OuestionBank02 {
    public static void main(String[] args) {
        //Double data tipinde bir değişken oluşturunuz ve onu bir short değişkenine dönüştürünüz.
        //Sonrasında bu short değişkenin değerini konsolda yazdırınız.
        //Not : Çıktıya dikkat ediniz, ondalık bir değer olmayacaktır


        double d = 12.5;
        short d1 = (short) d;
        System.out.println(d1);

        //Byte data tipinde bir değişken oluşturunuz ve onu bir double değişkenine dönüştürünüz.
        //Sonrasında bu double değişkenin değerini konsolda yazdırınız.
        //Not : Çıktıya dikkat ediniz, ondalık bir değer olmayacaktır.

        byte e = 123;
        double e1 = e;
        System.out.println(e1);

        //Byte data tipinin minimum değeri ile short data tipinin maksimum değerinin toplamını
        //bulmak için bir kod yazınız

        byte min = Byte.MIN_VALUE;
        short max = Short.MAX_VALUE;
        System.out.println(min+max);

        //Data tipi String olan “103” değerini byte data tipine dönüştürmek için bir kod yazınız ve
        //yine data tipi String olan “2351” değerini short data tipine dönüştürüp konsolda iki
        //değişken arasındaki farkı yazdırınız

        String m = "103";
        byte m1= Byte.valueOf(m);
        String n = "2351";
        short n1 = Short.valueOf(n);
        System.out.println(n1-m1);


        //Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir
        //ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda
        //yazdırınız.


        String sehir = "  anKAra  ";
        String sehir1 = sehir.trim().toLowerCase();
        sehir1 = sehir1.substring(0,1).toUpperCase()+sehir1.substring(1);
        System.out.println(sehir1);

        String sehir2 = "  MiAmI ";
        String sehir3 = sehir2.trim().toLowerCase();
        sehir3 = sehir3.substring(0,1).toUpperCase()+sehir3.substring(1);
        System.out.println(sehir3);


        //Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
        //karakter sayısının toplamını yazdırınız.
        //Örnek: İsimler Ali Can, Merve Star, Mark Tom ise konsolda 22 görmelisiniz

        String x = "Ali Can";
        String y = "Merve Star";
        String z = "Mark Tom";

        int isim1 = x.replaceAll("\\s","").length();
        int isim2 = y.replaceAll("\\s" , "").length();
        int isim3 = z.replaceAll("\\s" , "").length();

        System.out.println(isim1+isim2+isim3);

        //Bir String değişkeni oluşturunuz, String'deki toplam alfabetik ve sayısal karakter sayısını
        //konsolda yazdırınız.
        //Örnek: String : ' Miami 33018!!! ' ise konsolda 10 yazdırmanız gerekir.

        String g = "  Miami 33018!!!  ";

        Integer g1 =  g.replaceAll("//s" , "").replaceAll("[^(a-zA-Z0-9)]", "").length();
        System.out.println("Toplam Alfabetik ve Sayisal  Karakter Sayisi=" + g1);


        //Bir String değişkeni oluşturunuz, String'deki toplam alfabetik ve sayısal karakter sayısını
        //konsolda yazdırınız.
        //Örnek: String : " Ayse Betul KACAK08 ??? " ise konsolda 10 yazdırmanız gerekir.

        String h = " Ayse Betul KACAK:08 YAS ??? ";

        Integer h1 =  h.replaceAll("//s", "").replaceAll("[^(a-zA-Z0-9)]" , "").length();
        System.out.println( "Toplam Alfabetik ve Sayisal Karakter Sayisi = " + h1);

        //Bir String değişkeni oluşturunuz, String'deki rakam olmayan karakterlerin sayısını
        //konsolda yazdırınız.
        //Örnek: String: '1a3Bcf4!...' ise konsolda 8 yazdırmanız gerekir

        String i = "1a3Bcf4!...";

        int i1 = i.replaceAll("[(0-9)]" , "").length();
        System.out.println(i1);

        //Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son
        //karakteri yazdırınız.
        //Örnek:'Ali Can' için n yazdırmalısınız.
        // ‘Miami’ için i yazdırmalısınız

        String s = " Miami ";
        int a =s.trim().length()-1;
        String boslukOlmayanSonKrk = s.substring(a, a +1);
        System.out.println("Bosluk olmayan son karakter: " + boslukOlmayanSonKrk);



















    }
}
