package StringPrograms;

public class ReverseOrderOfWord {

    public static void main(String args[]) {
        String str = "My name is Gauri Jawalekar";
        String reverce = "";

        String temp[] = str.split(" ");

        for (int i = 0; i < temp.length; i++) {
            // The if condition will remove the last index Space of string array.The program can be run without if also

            if (i == temp.length - 1)
                reverce = temp[i] + reverce + " ";
            else
                reverce = " " + temp[i] + reverce;
        }
        System.out.println(reverce);
    }
}

/*
The Out Put with if condition will be  -Jawalekar gauri is name My
and without If it would be -  Jawalekar gauri is name My
The difference is first space only
*/
