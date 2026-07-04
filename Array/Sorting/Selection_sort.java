import java.util.Arrays;
class Solution {
   public static void main(String[] args) {
      int[] arr = {7,12,34,1,5,8};
      selection_sort(arr);
      System.out.println(Arrays.toString(arr));
      
      }
      static void selection_sort(int[] arr){
        for(int i=0;i<arr.length;i++){
        int last = arr.length - i-1; 
        int max = find_max(arr,0,last);
         swap(arr, max, last);
        }
       }
       public static int find_max(int[] arr,int first,int last){
        int max = first;
        for (int i = first; i <= last; i++) {
            if(arr[i] > arr[max]){
              max = i;
            }
        }  
       return max;
       }
static void swap(int[] arr,int first,int last){
      int temp = arr[first];
      arr[first] = arr[last];
      arr[last] = temp;
}
}
      

   

    
