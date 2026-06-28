
import java.util.Arrays;

public class p1{
public static void main(String[] args) {
    int[][] arr = {
                   {2,7,9,10},                  
                   {12,15,18,17},
                   {37,38,39,40},
                   {42,43,49,54}
                    };
    int target=49;
  int ans[] = Search(arr, target);
  System.out.println(Arrays.toString(ans));

}

//for eliminating rows (also column is used)
 public static int[] Search(int[][] arr, int target) {
      int row = arr.length;
      int col = arr[0].length;
      int start = 0;
      int end = row * col - 1;

      while(start <= end){
      int mid = start +(end - start)/2;

      row = mid/col; 
      col = mid%col;
      int element = arr[row][col];
      if (target == element) {
         System.out.println("Num is Found");
         return new int[]{row,col};
      }
      if(target > element){
        start = mid + 1;
      }else{
        end = mid-1;
      }

   }
   return new int[]{-1,-1};
  }
  // now we have two rows 
 }

      
