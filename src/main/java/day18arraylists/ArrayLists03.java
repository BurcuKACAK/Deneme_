package day18arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists03 {
    public static void main(String[] args) {
        //Example 1:Bir List'teki elemanlardan birbirine en yakin olan ikisini bulunuz
        //              [12, 19, 15, 30, 21]  ==>  19 ve 21

        ArrayList<Integer> a= new ArrayList<>();
        a.add(12);
        a.add(19);
        a.add(15);
        a.add(30);
        a.add(21);
        System.out.println(a);//[12, 19, 15, 30, 21]

        Collections.sort(a);

        System.out.println("a = " + a);//a = [12, 15, 19, 21, 30]

        for (int i = 1; i < a.size(); i++) {
            Math.min(a)

        }

    }
}
