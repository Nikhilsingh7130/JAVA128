package Unit3.sept19;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(21);
        al.add(0);
        al.add(-12);
        al.add(1);
        Collections.sort(al);
        System.out.println(al);
    }
}