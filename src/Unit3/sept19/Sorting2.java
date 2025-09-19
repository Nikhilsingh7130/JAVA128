package Unit3.sept19;


import  java.util.Collections;
import java.util.ArrayList;

public class Sorting2 {
    public static void main(String[] args) {
        ArrayList<student> al = new ArrayList<>();
        al.add(new student(20,"Abhi",100));
        al.add(new student(21,"Rahul",101));
        al.add(new student(22,"Ravi",102));
        al.add(new student(23,"Raju",103));
        al.add(new student(19,"Alakh",104));
        al.add(new student(30,"Nikhil",105));
        Collections.sort(al);
        for(student st : al)
        {
            System.out.println("NAME : "+st.name+", AGE : "+st.age + ",s ROLL_NO : "+st.roll_no);
        }
    }
}
