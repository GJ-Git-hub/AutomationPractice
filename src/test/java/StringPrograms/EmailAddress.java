package StringPrograms;

public class EmailAddress {

    public static void main(String args[])
    {
        String email = "test@test.de";
        String[] For_split_email = email.split("[@._]");
        int wordCoutn = For_split_email.length;
        System.out.println("Lenth of word" +wordCoutn);
        for (int j = 0; j <= For_split_email.length - 1; j++)
        {
            System.out.println("word ==>" + For_split_email[j]+ " word Count ==> " +For_split_email[j].length());

        }

    }
}

