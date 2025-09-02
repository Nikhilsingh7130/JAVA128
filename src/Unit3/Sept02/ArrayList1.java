package Unit3.Sept02;
import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(24);
        al.add(36);
        al.add(48);
        System.out.println(al);
        for(int i:al)
        {
            System.out.print(i+" ");
        }
    }
}
