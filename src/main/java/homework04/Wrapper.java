package homework04;

public class Wrapper {
    public static void main(String[] args) {

        //short data tipinin minimum ve maksimum degerlerini kod yazarak bulunuz

        short min = Short.MIN_VALUE;
        System.out.println(min);
        short max = Short.MAX_VALUE;
        System.out.println(max);
        //int min ve byte max toplami
        int intMin = Integer.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;
        System.out.println(intMin+byteMax);

        //primitive int i Wrapper Integer e cevir

        int num = 98;
        Integer wrapnum = num;
        System.out.println(wrapnum);

        //Wrapper Byte i primitive byte a cevir

        Byte m = 75;
        byte prim = m;
        System.out.println(prim);

        //pri chari Wrapper Character e cevir

        char ilkHarf = 'M';
        Character wrapHarf = ilkHarf;
        System.out.println(wrapHarf);

        //Wrapper Boolean i primitive boolean a cevir

        Boolean emekliMisin = false;
        boolean priEmekliMisin =emekliMisin;
        System.out.println(priEmekliMisin);

        //Size String olarak verilen iki fiyatin toplamini ekrana yazdirin

        String gomlek = "150";
        String pantolon = "400";

        int toplam = Integer.valueOf(gomlek)+Integer.valueOf(pantolon);
        System.out.println(toplam);

        String tv = "12000";
        String dolap = "50000";

        int toplam2 = Integer.valueOf(tv)+Integer.valueOf(dolap);
        System.out.println(toplam2);



    }


}
