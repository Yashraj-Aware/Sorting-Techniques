import java.util.Arrays;

public class basicsorting {
    public static void main(String[] args) {
        int [] arr = {1,3,2,4,6,5};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int [] arr){
        boolean swapped;
        
        int n = arr.length;
        for (int i = 0; i < n - 1; i++){
            swapped = false;
            for (int j = 1; j < n - i - 1 ; j++){
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            if(!swapped){
                break;
            }
        }
    }
    }
}
