package SeleniumPractice;

import java.util.HashMap;

public class HashMapClass {
    public static void main (String args[])
    {

        System.out.println(loginCredesials().get("valid"));
        System.out.println(loginCredesials().get("Invalid"));
    }

    public static HashMap<String, String > loginCredesials()
    {
        HashMap<String, String > user = new HashMap<String, String >();
        user.put("valid","userName:password");
        user.put("Invalid","jaynatkal:Kale");
        return user;
    }

}
