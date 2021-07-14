package ArrayPrograms;

public class SmallestElementInArray {
    public static void main(String[] args) {
        int arr[] = {10,24,3,45,67,89};
        int min = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println(min);
    }
}
