package ArrayPrograms;

public class FIndDuplicate {
    public static void main(String[] args) {
        int arr[] = {10,20,3,4,6,8,9,10};

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1; j<arr.length;j++ )
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[i]+ " Given number is duplicate");
                }
            }
        }
    }

}
