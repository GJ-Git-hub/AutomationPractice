package Collections.mapCollection;

import java.util.HashMap;
import java.util.Map;

public class SimpleMapCreation {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();

        map.put(1,"Jaynat Kale");
        map.put(2,"Rashi Kale");
        map.put(3,"Priyanka Kale");

        //Using Simple For loop
      /*  for(Map.Entry m: map.entrySet())
        {
            System.out.println(m.getKey()+ " " +m.getValue());
        }*/

      //Using Stream API




    }
}
