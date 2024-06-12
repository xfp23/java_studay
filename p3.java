package snippet;
import java.util.*;

public class P3 {
    static Map<String, String> map = new HashMap<>();
	 static String[] KEY = new String[]{"NO 1", "NO 2", "NO 3"};
    static String[] VALUE = new String[] {"rank a","rank b","rank c"};
    public static void print_json() {
    	for(int i = 0; i < 3; i++)
    	{
    		map.put(KEY[i], VALUE[i]);
    		System.out.println(KEY[i] + ":" + map.get(KEY[i]));
    	}
    }
}
