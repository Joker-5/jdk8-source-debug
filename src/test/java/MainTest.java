import java.util.ArrayList;
import java.util.HashMap;

public class MainTest {
    public static void main(String[] args) {
        //System.out.print(System.getProperty("sun.boot.class.path"));
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.add(1));
        System.out.println(list.size());
        HashMap<String, String> map = new HashMap<>();
        map.put("1","1");
        System.out.println(map.size());
        //-Xbootclasspath/p:"/Users/joker/DevTools/IdeaProjects/open-source/jdk-source-debug/target/classes"
    }
}
