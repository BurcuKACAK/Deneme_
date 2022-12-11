package homework;

public class JavaFirstHomework {

    // 1-Dikdortgenin alanini hesaplayan method olustur ve kullan
    // 2-Dikdortgenin cevresini hesaplayan method olustur ve kullan
    // 3-Dairenin cevresini hesaplayan method olustur ve kullan
    // 4-Dairenin alanini hesaplayan method olustur ve kullan


    public static void main(String[] args) {
        int dikdortgenAlani = multiply(9, 8);
        System.out.println(dikdortgenAlani);

        long dikdortgenCevresi = add(9, 8);
        System.out.println((2*dikdortgenCevresi));

        double daireCevresi = daireCevreHesaplama(7);
        System.out.println(daireCevresi);

        double daireAlani = daireAlanHesaplama(7);
        System.out.println(daireAlani);
    }
    public static int multiply(int x,int y){
        return x*y;    }
    private static long add(long a, long b){
        return a + b ;  }
    public static double daireCevreHesaplama (double r){
        double piSayisi = 3.14;
        return 2*piSayisi*r;}
    private static double daireAlanHesaplama (double r){
        double piSayisi = 3.14;
        return piSayisi*r*r;}
    }


