package day10switchloop;

public class Loop01 {
    public static void main(String[] args) {
        //Ex 2: 11'den 44'e kadar tum tamsayilari ekrana yazdiran kodu yaziniz

        for(int i=11; i<45; i++){
            System.out.print(i+ " - ");

        }
        System.out.println();
        //Ex 3 :40'dan 23'e kadar tum cift tamsayilari ekrana yazdiran kodu yaziniz
       for( int i = 40; i>22 ;i--){
           if (i%2==0)

           System.out.print(i+ " -");
       }
        System.out.println();
        //Ex 4 :18'den 56'ya kadar tum tek tamsayilari ekrana yazdiran kodu yaziniz
        for (int i = 18; i <57 ; i++) {
            if(i%2 != 0)
                System.out.print(i + "-");

        }


    }

}
