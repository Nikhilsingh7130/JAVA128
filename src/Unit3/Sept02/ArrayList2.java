package Unit3.Sept02;
import java.util.*;
import java.util.ArrayList;
public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> str =new ArrayList<>();
        System.out.println("Enter the number of Products");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            str.add(sc.next());
        }
        System.out.println(str);
        Collections.sort(str);
        Iterator it = str.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        str.add(1,"Apple");
        str.addLast("Banana");
        str.addFirst("Orange");
        System.out.println(str.get(1));

    }
}
