package Collections.MapCollection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SyncronozeMapExample {
    public static void main(String[] args) {
        Map<Integer,String> map= new HashMap<Integer, String>();
        map.put(1,"Gauri Jawalekar");
        map.put(2,"Priya Kale");
        map.put(3,"Rashi Kale");

        Map<Integer,String> map2 = Collections.synchronizedMap(map);
        System.out.println(map2);

    }
}
