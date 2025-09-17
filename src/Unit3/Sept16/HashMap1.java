package Unit3.Sept16;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the map");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String key = sc.next();
            int value = sc.nextInt();
            hm.put(key,value);
        }
        for(String k : hm.keySet()){
            System.out.println(k+" "+hm.get(k));
        }
    }
}
