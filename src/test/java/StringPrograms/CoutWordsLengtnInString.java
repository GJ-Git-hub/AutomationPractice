package StringPrograms;

public class CoutWordsLengtnInString {
    public static void main(String args[])
    {
        String str = "My name is Jaynat Kale";
        String temp[] = str.split(" ");

        for(int i=0;i<=temp.length-1;i++)
        {
            System.out.println("Splited Word===>" +temp[i] +" cout of the word==> " +temp[i].length());

        }

    }
}

