package ArrayPrograms;

public class CopyArray {

    public static void main(String[] args) {
        int arr1[] = {10,20,30,49,50};
        int arr2[] = new int[arr1.length];

        for(int i=0;i<arr1.length;i++)
        {
            arr2[i]=arr1[i];
        }
        System.out.println("Print the array2");
        for(int i=0;i<arr2.length;i++)
        {
            System.out.println(arr2[i]);
        }
    }
}
