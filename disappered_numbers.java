import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;

public class disappered_numbers {
    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};
        System.out.println(sort(arr));
    }
    static List<Integer> sort(int [] arr)
    {
        int i =0 ;
        while(i<arr.length)
        {
            int correct = arr[i] -1;
            if(arr[i]!= arr[correct])
            {
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
        List<Integer> arr1 = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1)
            {
                arr1.add(j+1);
            }
        }
        return arr1;

    }
    static void swap(int [] arr , int first , int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
