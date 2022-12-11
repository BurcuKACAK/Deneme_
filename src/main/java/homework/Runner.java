package homework;

public class Runner {
    public static void main(String[] args) {

        Car myCar = new Car();
        System.out.println(myCar.fiyat );
        System.out.println(myCar.model);

        myCar.dur();
        myCar.hareket();

        Student ahmetSaid = new Student();
        System.out.println(ahmetSaid.isim);
        System.out.println(ahmetSaid.sinifNo);
        System.out.println(ahmetSaid.adres);

        ahmetSaid.saglik();
        ahmetSaid.dersCalisma();

    }
}
