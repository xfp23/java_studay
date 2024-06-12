import java.util.Map;
import java.util.*;
public class P3 {
    public static void main(String[]args){
        Map map = new HashMap();
        map.put("No 1","Rank A");
        map.put("No 2","Rank B");
        map.put("No 3","Rank C");
        Set entrySet=map.entrySet();
        Iterator it =entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) (it.next());
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + ":" + value);
        }
    }
}
