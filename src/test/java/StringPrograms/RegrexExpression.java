package StringPrograms;

public class RegrexExpression {
    public static void main(String args[])
    {
        String s = "$200";
        String newString = s.replaceAll("[^0-9]","");
        System.out.println(newString);
    }
}
