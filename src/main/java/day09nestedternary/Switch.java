package day09nestedternary;

public class Switch {
    public static void main(String[] args) {
        //Example 1: Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz

        //      Sunday ==>1 . . .Saturday ==>7

        String dayname = "Wednesday";
        switch (dayname){
            case "Sunday":
                System.out.println(1);
                break;
            case "Monday":
                System.out.println(2);
                break;
            case "Tuesday":
                System.out.println(3);
                break;
            case "Wednesday":
                System.out.println(4);
                break;
            case "Thursday":
                System.out.println(5);
                break;
            case "Friday":
                System.out.println(6);
                break;
            case "Saturday":
                System.out.println(7);
                break;
            default:
                System.out.println("Lutfen gecerli bir gun giriniz");
        }

    }
}
