package Unit3.Sept12;

import java.util.ArrayList;
import java.util.Scanner;

public class AL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> ll=new ArrayList<>();
        while(n>0) {
            String  x=sc.next();
            if(ll.contains(x)) {
                System.out.println(ll.size());
            }
            else {
                ll.add(x);
            }
            n--;
        }
        System.out.println(ll);
    }
}
