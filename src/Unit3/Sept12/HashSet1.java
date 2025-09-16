package Unit3.Sept12;

import java.util.HashSet;
import java.util.Scanner;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<String>();
        HashSet<String> set2 = new HashSet<String>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements in hash1: ");
        int m=sc.nextInt();
        System.out.println("Enter number of elements in hash2: ");
        int n=sc.nextInt();
        for(int i=0;i<m;i++)
        {
            set1.add(sc.next());
        }
        for(int i=0;i<n;i++)
        {
            set2.add(sc.next());
        }
        System.out.println("Set 1: "+set1);
        System.out.println("Set 2: "+set2);
        System.out.println(set1.addAll(set2));

        System.out.println(set1);
        set1.removeIf(str->str.contains("o"));
    }
}
