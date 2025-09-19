package Unit3.sept19;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertyClass {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\Users\\Nikhil Singh\\IdeaProjects\\unit1\\src\\Unit3\\sept19\\db.properties");
            Properties p=new Properties();
            p.load(fr);
            Set s = p.entrySet();
            Iterator itr=s.iterator();
            while(itr.hasNext()) {
                Map.Entry entry = (Map.Entry) itr.next();
                System.out.println(entry.getKey()+"="+entry.getValue());
//            System.out.println(p.getProperty("user"));
//            System.out.println(p.getProperty("password"));
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}