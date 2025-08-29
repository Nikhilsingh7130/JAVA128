import java.util.*;
public class Aug29Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserDefineException obj = new UserDefineException();
        try{
        obj.validate(20);
        }
        catch(InvalidAgeException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
