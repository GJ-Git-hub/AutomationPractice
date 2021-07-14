package StringPrograms;

public class ReversString {
    public static void main(String args[])
    {
        String s ="Selenium";
        int lenght = s.length();
        String reverse ="";
        for(int i=lenght-1;i>=0;i--)
        {
            reverse = reverse + s.charAt(i);
        }
        System.out.println(reverse);


    }
}
