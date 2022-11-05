import java.util.Arrays;

public class selsction_sort {
    public static void main(String[] args) {
        int [] arr = {4,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            //e hey i just refernce variable in kunal a other constructor like rahul we need away to refe
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr , 0 , last);
            swap(arr, maxIndex , last);
        }
    }
    static void swap(int [] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int getMaxIndex(int [] arr , int start  , int end){
        int max = start;
        for (int i = 0; i <= end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    } 

}
