package ArrayPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondlargestArray {


    static  int finddiff(int [] input)
    {
        Arrays.sort(input);
        int younger = input[0];
        int elder = input[input.length-1];
        int diff = elder-younger;
        return diff;

    }

    public static void main(String[] args) {
        int arr[] = {12, 35, 10, 34, 10,58};

        int diff = finddiff(arr);

        System.out.println(diff);




    }
}
