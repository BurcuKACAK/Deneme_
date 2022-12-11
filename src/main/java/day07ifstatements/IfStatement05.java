package day07ifstatements;

import java.util.Scanner;

public class IfStatement05 {
    public static void main(String[] args) {
//Ex 1: Ay isimleri girilince kacinci ay oldugunu yazan kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a month name");
        String nameMonth = input.next();

        if (nameMonth.equalsIgnoreCase("January")){
            System.out.println(1);}
        else if (nameMonth.equalsIgnoreCase("February")){
            System.out.println(2);}
        else if (nameMonth.equalsIgnoreCase("March")){
            System.out.println(3);}
        else if (nameMonth.equalsIgnoreCase("April")){
            System.out.println(4);}
        else if (nameMonth.equalsIgnoreCase("May")){
            System.out.println(5);}
        else if (nameMonth.equalsIgnoreCase("June")){
            System.out.println(6);}
        else if (nameMonth.equalsIgnoreCase("July")){
            System.out.println(7);}
        else if (nameMonth.equalsIgnoreCase("August")){
            System.out.println(8);}
        else if (nameMonth.equalsIgnoreCase("September")){
            System.out.println(9);}
        else if (nameMonth.equalsIgnoreCase("October")){
            System.out.println(10);}
        else if (nameMonth.equalsIgnoreCase("November")){
            System.out.println(11);}
        else if (nameMonth.equalsIgnoreCase("December")){
            System.out.println(12);}
        else {
            System.out.println("Please enter a valid month name"); }





    }
}


