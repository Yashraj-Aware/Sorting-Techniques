import java.util.*;

public class duplicate_numbers {
    public static void main(String[] args) {
        int [] arr = {1,3,4,2,2};
        System.out.println(sort(arr));
    }
    static void swap(int [] arr , int first , int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static List<Integer> sort (int[] arr)
    {
        int i =0 ;
        while(i<arr.length)
        {
            int correct = arr[i] -1;
            if(arr[i]!=arr[correct])
            {
                swap(arr, i, correct);
            }
            else
            {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!= j+1)
            {
                ans.add(arr[j]);
            }
        }
        return ans;
    }
}
