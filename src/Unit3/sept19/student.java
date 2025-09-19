package Unit3.sept19;

public class student implements Comparable<student>{
    int age;
    String name;
    int roll_no;

    public student(int age, String name,int roll_no) {
        this.roll_no = roll_no;
        this.age = age;
        this.name = name;
    }
    public int compareTo(student st) {
        if(age==st.age)
        {
            return 1;
        }
        else if(age>st.age)
            return 1;
        else
            return -1;
    }
}
