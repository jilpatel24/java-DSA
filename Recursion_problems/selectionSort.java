
import java.util.Arrays;

public class p1{
    static void selectionSort(int[] arr,int i,int j,int max) {
       if(i == 0){
        return;
       }
       if(j < i){
        if(arr[j] > arr[j+1]){
          selectionSort(arr, i, j+1,j);
        }else{
          selectionSort(arr, i, j+1,max);
       }
    }else{
      int temp = arr[max];
      arr[max] = arr[i-1];
      arr[i-1] = temp;
      selectionSort(arr, i-1, 0, 0);
     }
    }
   public static void main(String[] args) {
      int[] arr={7,1,2,9,12,3,4,5};
      selectionSort(arr, arr.length-1, 0,0);
      System.out.println(Arrays.toString(arr));
   }
}
