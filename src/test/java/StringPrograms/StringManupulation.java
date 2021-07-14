package StringPrograms;

import javax.xml.bind.SchemaOutputResolver;

public class StringManupulation {
    public static void main(String args[])
    {
        String str = "My name is jaynat Kale";
        String str2 = "My  name is jaynat Kale";

        //Calculate the length of the string
        System.out.println(str.length());

        //Check the value of Specific index
        System.out.println(str.charAt(5));

        //Check the position of string
        System.out.println(str.indexOf("a"));

        //String Compaision
        System.out.println(str.equals(str2));

        //Substring
        System.out.println(str.substring(2,9));

        String s = "  Hello World   ";
        System.out.println(s.trim());

        String splitTest = "Hell0_Test_Pass_ness";

        String splitValue[]=splitTest.split("_");

        for (int i=0; i<splitTest.length(); i++)
        {
            System.out.println(splitValue[i]);
        }


    }
}
