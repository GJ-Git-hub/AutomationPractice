package StringPrograms;

public class ReplceTheStringWithGivenString {
    public static void main(String args[])
    {
        String str = "My name is Jayant Kale";
        String newStr = str.replaceAll("is","a");
        System.out.println(newStr);
    }
}
