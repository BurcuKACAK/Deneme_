package day18arraylists;


import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

        //1)ArrayList nasil olusturulur?

        List<Integer> nums = new ArrayList<>();

        //2)ArrayListler nasil yazdirilir?

        System.out.println(nums);//[]

        nums.add(37);
        nums.add(38);
        nums.add(39);
        nums.add(40);
        nums.add(41);
        nums.add(42);
        System.out.println("nums = " + nums);//nums = [37, 38, 39, 40, 41, 42]


        //3)ArrayList'in bos olup olmadigini nasil anlariz?
        boolean numsEmpty1 = nums.isEmpty();
        System.out.println("numsEmpty1 = " + numsEmpty1);

        List<Integer> ages = new ArrayList<>();
        boolean agesEmpty = ages.isEmpty();
        System.out.println("ages1 = " + agesEmpty);

        //Example 1: nums ArrayList'indeki tum tek sayilari 11
        // artirdiktan sonra ekrana yazdiriniz


        //nums = [37, 38, 39, 40, 41, 42]
        for (int w : nums) {
            if (w %2 !=0 ){
                nums.set(nums.indexOf(w), w+11);

            }

        }//for
        System.out.println("nums = "+ nums);//nums = [48, 38, 50, 40, 52, 42]
        nums.add(52);
        nums.add(36);
        nums.add(52);

        //4)List'lerden eleman nasil silinir?

        //Ex:num ArrayList'inden 52 rakaminin ilk gorunumunu siliniz

        System.out.println(nums);//[48, 38, 50, 40, 52, 42, 52, 36, 52]

        //nums.remove(52) bu sekilde hata verir

        //nums.remove((nums.indexOf(52)));
        //System.out.println("nums = " + nums); busekilde de oluyor

        /*
         remove() methodunun icerisine tamsayi yazarsaniz;
         Java bunu indeks kabul eder.Silinecek eleman olarak algilamaz.
         Tum tamsayilar aksi belirtilmedigi surece primitive int 'tir.
         Primitive Data Type'lari da ArrayLst'lerin elemani olamazlar.
         Primitive Data Type'larini Wrapper class'a cevirmeliyiz

         */

        Integer sayi =52;
        nums.remove(sayi);
        System.out.println("nums = " + nums);



        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");

        System.out.println("names = " + names);//names = [Tom, Thomas, Tahsin, Trump, Taceddin]

        List<String> emekliOlacaklar = new ArrayList<>();

        emekliOlacaklar.add("Thomas");
        emekliOlacaklar.add("Tahsin");
        emekliOlacaklar.add("Trump");

        names.removeAll(emekliOlacaklar);

        System.out.println("emekliOlacaklar = " + emekliOlacaklar);//emekliOlacaklar = [Thomas, Tahsin, Trump]
        System.out.println("names = " + names);//names = [Tom, Taceddin]

        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
        System.out.println("a = " + a);//a = [Shoes, TV, Radio, Laptop, Shoes, Book, Shoes]

        // Ex : a Listesindeki shoes elemaninin ilk gorunumunu siliniz

        a.remove("Shoes");
        System.out.println("a = " + a);//a = [TV, Radio, Laptop, Shoes, Book, Shoes]

        //5) ArrayListimizde coklu datanin olup olmadigini nasil gosteririz?
        // containsAll() : Bir listin icinde coklu elemanin olup olmadigini kontrol eder
        // Hepsi varsa true; en az bir tanesi yoksa false verir.


        List<String> myNames = new ArrayList<>();
        myNames.add("Burcu");
        myNames.add("Can");
        myNames.add("Zisan");
        myNames.add("Emre");
        myNames.add("Bilal");
        myNames.add("Gul");
        System.out.println("myNames = " + myNames);//myNames = [Burcu, Can, Zisan, Emre, Bilal, Gul]

        List<String> varMi = new ArrayList<>();
        varMi.add("Burcu");
        varMi.add("Ebubekir");
        varMi.add("Can");
        System.out.println("varMi = " + varMi);

        boolean sonuc =  myNames.containsAll(varMi);
        System.out.println("sonuc = " + sonuc);


    }

}
