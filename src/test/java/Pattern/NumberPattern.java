package Pattern;

public class NumberPattern {
    public static void main(String[] args) {
        int i,j, num=6;

        for(i=0;i<num;i++)
        {
            for(j=1;j<=num;j++)
            {
                if(i==num)
                {
                    System.out.print("* ");
                }else {
                    System.out.print(j);
                }

            }
            System.out.println(" ");
        }

    }
}
