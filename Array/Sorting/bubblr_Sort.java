import java.util.Arrays;
class Solution {
   public static void main(String[] args) {
      int[] arr = {7,12,34,1,5,8};
      search_ind(arr);
      System.out.println(Arrays.toString(arr));
     
      }
      static void search_ind(int[] arr){
        boolean swap ;//what if array is already sorted
       for(int i =0;i<arr.length;i++){
        swap = false;
        for(int j = 1;j < arr.length-i;j++){
          if(arr[j] < arr[j-1]){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1]=temp;
            swap = true;
          }
        }//you got already sorted array so you don't check for all element you just break bcz its not needed
        if(!swap){ //swap = false
          break;
        }
       }
}
}
      

   

    
