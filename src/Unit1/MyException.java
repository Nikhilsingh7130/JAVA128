package Unit1;

import java.util.*;
public class MyException {
    public static void main(String[] args) {
        int x,y,z=0;
        Scanner sc = new Scanner(System.in);
        try
        {
            x = sc.nextInt();
            y = sc.nextInt();
            z=x/y; //Exception occurs
            System.out.println("Exception Not Occur");
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Result : "+z );
        }
    }
}
