package ArrayPrograms;

public class MinArray {

    //Create a static method

    public static void min(int arr[])
    {
        int min = arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    public static void main(String args[])
    {
        int a[] = {10,20,30,40,50};
        min(a);
    }


}
