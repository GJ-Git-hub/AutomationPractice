package StringPrograms;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringFrequencyUsingMap {

    public static void main(String[] args) {

        String str = "Priyanka Bhoyar";

        //Convert string to char array

        char[] ch = str.toCharArray();

        //Hash Map Declaration
        Map <Character,Integer> map = new LinkedHashMap<>();
        //Traverse the character Array
        for(char word : ch)
        {
            if(map.containsKey(word))
            {
                map.put(word,map.get(word)+1);
            }
            else {
                map.put(word,1);
            }
        }

        //Traverse the Map

        for(Map.Entry m: map.entrySet())
        {
            System.out.println(m.getKey() + " " +m.getValue());
        }
    }
}
