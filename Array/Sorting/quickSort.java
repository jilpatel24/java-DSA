import java.util.Arrays;
public class p1{
    static void Sort(int[] arr,int low,int high) {
       if(low >= high){
        return;
       }
       int s = low;
       int e = high;
       int m = s+(e-s)/2;
       int pivot = arr[m];

       while(s <= e){
        while(arr[s] < pivot){
            s++;
        }while (arr[e] > pivot){
            e--;
        }
        if(s <= e){
            int temp = arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
       } 
      Sort(arr, low, e);
      Sort(arr, s, high);
    }
   public static void main(String[] args) {
      int[] arr={7,1,2,9,12,3,4,5};
      Sort(arr,0,arr.length-1);
      System.out.println("reverse : "+Arrays.toString(arr));  
   }
}
