package denemevol1;

public class Vol1 {

    /* Herhangi bir 3 öğe için float, long ve integer data tipinde değişkenler oluşturunuz. Bu
    değişkenlerin değerlerinin çarpımını konsolda yazdırınız
    */
    public static void main(String[] args) {

     float x = 9.85F;
     long y = 18574;
     int z = 45;

        System.out.println("Degiskenlerin Carpimi=" +x*y*z);


        /*3 öğe (kitap, defter ve laptop) fiyatı için long data tipinde değişkenler oluşturunuz.
Konsolda 2 kitap, 4 defter ve 3 laptop için toplam fiyatını yazdırınız
         */

        long kitapFiyati = 55 , defterFiyati = 32 , laptopFiyati = 22000;
        System.out.println("Toplam Fiyat="+ 2*kitapFiyati+ 4*defterFiyati+3*laptopFiyati);
}}
