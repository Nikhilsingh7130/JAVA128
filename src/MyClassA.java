public class MyClassA {

    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        a1.bread=a1.bread-1;
        System.out.println(a2.bread);
    }
    static{
        System.out.println("Static block");
    }
}
