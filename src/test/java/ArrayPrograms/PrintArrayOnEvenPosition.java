package ArrayPrograms;

public class PrintArrayOnEvenPosition {
    public static void main(String[] args) {
        int arr[] = {10,203,34,244,56,78,23,34,24,45};
        for(int i=0; i<arr.length; i = i+2)
        {
            System.out.println(arr[i]);
        }
    }
}
